package com.example.demo.services;

import java.net.PasswordAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {

	
	@Autowired
	UsersRepository repo;

	@Override
	public String addUsers(Users user) {
		repo.save(user);
		return "user added";
	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
		}
		return true;
	}
	
	
	

	
@Override
public String getRole(String email) {
	Users user=repo.findByEmail(email);
return user.getRole();
}

@Override
public boolean validateUser(String email, String password) {
	Users user=repo.findByEmail(email);
	String db_pass=user.getPassword();
	if(password.equals(db_pass)) {
		return true;
	}else {
	return false;
}
	
}

@Override
public Users getUser(String email) {
	
	return repo.findByEmail(email);
}

@Override
public void update(Users user) {
	repo.save(user);
	
}
	}
	



package com.example.demo.services;

import com.example.demo.entities.Users;


public interface UsersService {
	public boolean emailExists(String email);
	public String addUsers(Users user) ;
	public boolean validateUser(String email,String password);
	public String getRole(String email);
	
	public Users getUser(String email);
	public void update(Users user);

}

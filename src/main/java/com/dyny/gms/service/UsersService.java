package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Users;

public interface UsersService {
	
	public Users getByNameAndPass(String username, String password);
	
	public int add(Users users);
	
	public int updatePass(String password, String userName);
	
}

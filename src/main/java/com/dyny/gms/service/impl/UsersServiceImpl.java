package com.dyny.gms.service.impl;

import com.dyny.gms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dyny.gms.db.dao.UsersMapper;
import com.dyny.gms.db.pojo.Users;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper mapper;

	@Override
	public Users getByNameAndPass(String username, String password) {
		// TODO Auto-generated method stub
		return mapper.getByNameAndPass(username, password);
	}

	@Override
	public int add(Users users) {
		// TODO Auto-generated method stub
		return mapper.add(users);
	}

	@Override
	public int updatePass(String password, String userName) {
		// TODO Auto-generated method stub
		return mapper.updatePass(password, userName);
	}


}

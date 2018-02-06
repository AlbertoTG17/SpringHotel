package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dao.UserDAO;
import com.hotel.model.UserInfo;


@Service
public class UserService implements IUserService {
	
	@Autowired	
	private UserDAO userDAO;
	
	public UserInfo getDataByUserName(String userName) {
		return userDAO.getActiveUser(userName);
	}
} 

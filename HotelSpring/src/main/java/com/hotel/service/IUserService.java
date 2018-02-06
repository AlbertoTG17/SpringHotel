package com.hotel.service;

import org.springframework.security.access.annotation.Secured;

import com.hotel.model.UserInfo;



public interface IUserService {
	@Secured ({"ROLE_ADMIN"})
	UserInfo getDataByUserName(String userName);
} 

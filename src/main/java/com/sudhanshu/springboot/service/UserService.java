package com.sudhanshu.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sudhanshu.springboot.dto.UserRegistrationDto;
import com.sudhanshu.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

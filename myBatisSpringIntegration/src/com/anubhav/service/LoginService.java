package com.anubhav.service;

import org.springframework.stereotype.Component;

import com.anubhav.domain.Login;

@Component
public interface LoginService {

	public Login selectLogin(String userId);
}

/**
 *   Author : HIMANSHU PATEL
 * Document : SignUpServiceImpl.java
 *     Date : 13-Jan-2018
 *     Time : 6:14:27 PM
 */
package com.obs.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.obs.entity.SignUp;
import com.obs.signup.dao.SignUpDAO;

@Service
public class SignUpServiceImpl implements SignUpService
{
	@Autowired
	private SignUpDAO signUpDAO;

	@Override
	@Transactional
	public void newSignUp(SignUp theSignUp)
	{
		signUpDAO.newSignUp(theSignUp);
	}

	@Override
	@Transactional
	public void loginFb(SignUp theSignUp) {
		
		signUpDAO.loginFb(theSignUp);
	}
}

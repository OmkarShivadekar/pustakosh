/**
 *   Author : HIMANSHU PATEL
 * Document : SignUpService.java
 *     Date : 13-Jan-2018
 *     Time : 6:12:55 PM
 */
package com.obs.signup.service;

import com.obs.entity.SignUp;

public interface SignUpService
{

	public void newSignUp(SignUp theSignUp);
	
	public void loginFb(SignUp theSignUp);
	
}

/**
 *   Author : HIMANSHU PATEL
 * Document : SingUpController.java
 *     Date : 13-Jan-2018
 *     Time : 5:35:19 PM
 */
package com.obs.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.obs.entity.SignUp;
import com.obs.signup.service.SignUpService;

@Controller
@RequestMapping("/HOME")
public class SignUpController
{
	@Autowired
	private SignUpService signUpService;
	
//	@GetMapping("/")
//	public String goHome(Model theModel) {
//		SignUp newSignUp=new SignUp();
//		theModel.addAttribute("signUpForm", newSignUp);
//		
//		return "home";
//	}
	
	@PostMapping("/signUp")
	public String signUp(@ModelAttribute("signUpForm") SignUp theSignUp) {

		signUpService.newSignUp(theSignUp);
		return "redirect:/HOME/";
	}
	
	@PostMapping("/loginFB")
	public String loginFB(@ModelAttribute("loginFbForm") SignUp theSignUp)
	{
		signUpService.loginFb(theSignUp);
		return "redirect:/HOME/";
	}
}

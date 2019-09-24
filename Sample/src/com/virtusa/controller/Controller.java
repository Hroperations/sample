package com.virtusa.controller;

import com.virtusa.factory.UserFactory;
import com.virtusa.model.UserModel;
import com.virtusa.service.UserService;
import com.virtusa.login.AdminLogin;
import com.virtusa.login.ApplicantLogin;
import com.virtusa.login.HrLogin;
import com.virtusa.login.InterviewerLogin;
import com.virtusa.login.ManagerLogin;

public class Controller {
	private UserService userService;
	public Controller() {
		this.userService=UserFactory.createUserService();
		
	}
	
	public void userAuthentication(String userName,String password) {
		
		UserModel userModel=new UserModel();
		userModel.setUserName(userName);
		userModel.setPassword(password);
		
		String userType=
				userService.userAuthenticationService(userModel);
		
		if(userType.contentEquals("APPLICANT")) {
			ApplicantLogin applicantLogin=new ApplicantLogin();
			applicantLogin.applicantLoginWindow();
		}else if(userType.contentEquals("ADMIN")) {
			AdminLogin adminLogin=new AdminLogin();
			adminLogin.adminLoginWindow();
		}else if(userType.contentEquals("HR")) {
			HrLogin hrLogin=new HrLogin();
			hrLogin.hrLoginWindow();
		}else if(userType.contentEquals("INTERVIEWER")) {
			InterviewerLogin interviewerLogin=new InterviewerLogin();
			interviewerLogin.interviewerLoginWindow();
		}else {	
			ManagerLogin managerLogin=new ManagerLogin();
			managerLogin.managerLoginWindow();        
   }
}
}

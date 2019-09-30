package com.virtusa.controller;


import java.sql.SQLException;

import com.virtusa.factory.FactoryAdminService;
import com.virtusa.model.AdminModel;
import com.virtusa.service.AdminService;
import com.virtusa.view.AdminView;

public class AdminController {
	private AdminService adminService;
	public AdminController(){
		this.adminService=FactoryAdminService.createAdminService();
		
	}

	public void storeJob(AdminModel adminModel) throws ClassNotFoundException, SQLException {
		boolean result=adminService.storeJobService(adminModel);
		AdminView adminView=new AdminView();
		if(result){
			adminView.storeSuccessful();
		}else{
			
			adminView.storeUnSuccessful();
		}
		
	}



}

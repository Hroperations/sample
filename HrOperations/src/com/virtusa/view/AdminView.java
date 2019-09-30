package com.virtusa.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminModel;
import com.virtusa.userinteface.UserInterface;

public class AdminView {
	public void adminMainView() throws ClassNotFoundException, SQLException {
		System.out.println("=======Admin View======");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Post Job");
		System.out.println("2. Generate EmpId and Emp Mail Id");
		System.out.println("3. Login");
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		AdminView adminView=new AdminView();
		
		if(option==1){
			adminView.postJob();
			}
		if(option==2){
	         
			}
		if(option==3)
		{
			UserInterface.main(null);
		}
			
		}

	private void postJob() throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Job Id");
		int jobId=scanner.nextInt();
		
		System.out.print("Enter Job Title");
		String jobTitle=scanner.next();
	
		System.out.print("Enter eligibility Criteria");
		String eligibilityCriteria=scanner.next();
		
		System.out.print("Enter Job Opportunity Id");
		int opportunityId=scanner.nextInt();
		System.out.println("\n");
		
		AdminModel adminModel =new AdminModel();
		adminModel.setJobId(jobId);
		adminModel.setJobTitle(jobTitle);
		adminModel.setEligibilityCriteria(eligibilityCriteria);
		adminModel.setOpportunityId(opportunityId);
		AdminController adminController=new AdminController();
		adminController.storeJob(adminModel);
		adminMainView();
	
	}
	public void storeSuccessful(){
		
		System.out.println("Job Updated successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Unable to Store");
	}
}

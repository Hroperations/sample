package com.virtusa.controller;

import java.util.List;

import com.virtusa.factory.FactoryApplicantService;
import com.virtusa.model.AdminModel;
import com.virtusa.model.ApplicantModel;
import com.virtusa.service.ApplicantService;
import com.virtusa.view.ApplicantView;



public class ApplicantController {
	private ApplicantService applicantService;
	public ApplicantController(){
		this.applicantService=FactoryApplicantService.createApplicantService();
		
	}

	public void viewJob() {
		List<ApplicantModel> applicantModelList=applicantService.retrieveJobService();
		ApplicantView applicantView=new ApplicantView();
		applicantView.displayJobDetails(applicantModelList);
		
	}

}

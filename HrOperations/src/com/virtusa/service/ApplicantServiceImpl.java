package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;
import com.virtusa.dao.ApplicantDAO;
import com.virtusa.entities.Applicant;
import com.virtusa.factory.FactoryApplicantDAO;
import com.virtusa.model.ApplicantModel;

public class ApplicantServiceImpl implements ApplicantService {
	private ApplicantDAO applicantDAO=null;
	public ApplicantServiceImpl(){
		this.applicantDAO=FactoryApplicantDAO.createStudentDAO();
		
	}

	@Override
	public List<ApplicantModel> retrieveJobService() {
		 List<Applicant> jobList=applicantDAO.viewJobs();
		
		List<ApplicantModel> applicantModelList=new ArrayList<ApplicantModel>();
		
		for(Applicant applicant:jobList){
			
			ApplicantModel applicantMdl=new ApplicantModel();
			applicantMdl.setJobId(applicant.getJob().getJobId());
			applicantMdl.setJobTitle(applicant.getJob().getJobTitle());
			//applicantMdl.setJobResponsibilities(applicant.getJob().getJobResponsibilities());
			applicantMdl.setEligibilityCriteria(applicant.getJob().getEligibilityCriteria());
		}
		return applicantModelList;
	}

}

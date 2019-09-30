package com.virtusa.dao;

import java.util.List;
import com.virtusa.entities.Applicant;
import com.virtusa.repository.ApplicantRepository;

public class ApplicantDAOImpl implements ApplicantDAO {

	@Override
	public List<Applicant> viewJobs() {
		return ApplicantRepository.get();
	}

}

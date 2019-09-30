package com.virtusa.entities;

public class Applicant extends User {
  
public Applicant() {
		
	}
	private Job job;
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	private String applicantId;
	public String getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	@Override
	public String toString() {
		return "Applicant [job=" + job + ", applicantId=" + applicantId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", userType="
				+ userType + ", getJob()=" + getJob() + ", getApplicantId()=" + getApplicantId() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmailAddress()=" + getEmailAddress()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getUserType()=" + getUserType() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

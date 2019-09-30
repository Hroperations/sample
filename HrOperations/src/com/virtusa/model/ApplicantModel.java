package com.virtusa.model;

public class ApplicantModel {
	@Override
	public String toString() {
		return "ApplicantModel [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobResponsibilities="
				+ jobResponsibilities + ", eligibilityCriteria=" + eligibilityCriteria + "]";
	}
	private int jobId;
	private String jobTitle;
	private String jobResponsibilities;
	private String eligibilityCriteria;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobResponsibilities() {
		return jobResponsibilities;
	}
	public void setJobResponsibilities(String jobResponsibilities) {
		this.jobResponsibilities = jobResponsibilities;
	}
	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

}

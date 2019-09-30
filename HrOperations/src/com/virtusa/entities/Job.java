package com.virtusa.entities;

public class Job {
	private int JobId;
	private String jobTitle;
	private String eligibilityCriteria;
	private int opportunityId;
	public int getOpportunityId() {
		return opportunityId;
	}
	@Override
	public String toString() {
		return "Job [JobId=" + JobId + ", jobTitle=" + jobTitle + ", eligibilityCriteria=" + eligibilityCriteria
				+ ", opportunityId=" + opportunityId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + JobId;
		result = prime * result + ((eligibilityCriteria == null) ? 0 : eligibilityCriteria.hashCode());
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + opportunityId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (JobId != other.JobId)
			return false;
		if (eligibilityCriteria == null) {
			if (other.eligibilityCriteria != null)
				return false;
		} else if (!eligibilityCriteria.equals(other.eligibilityCriteria))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (opportunityId != other.opportunityId)
			return false;
		return true;
	}
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}
	public void setOpportunityId(int opportunityId) {
		this.opportunityId = opportunityId;
	}
}

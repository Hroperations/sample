package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.virtusa.entities.Admin;
import com.virtusa.entities.Job;
import com.virtusa.integrate.ConnectionManager;

public class AdminDAOImpl implements AdminDAO {
	@Override
	public boolean persistJob(Admin admin) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("insert into job values(?,?,?,?)");
		Job job =new Job();
		statement.setInt(1, job.getJobId());
		System.out.println(statement);
		statement.setString(2, job.getJobTitle());
		System.out.println(statement);
		statement.setString(3, job.getEligibilityCriteria());
		System.out.println(statement);
		statement.setInt(4, job.getOpportunityId());
		System.out.println(statement);
		int rows=statement.executeUpdate();
		System.out.println(rows);
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
	
		return false;
	}

	

}

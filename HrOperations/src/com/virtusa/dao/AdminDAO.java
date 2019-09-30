package com.virtusa.dao;

import java.sql.SQLException;

import com.virtusa.entities.Admin;


public interface AdminDAO {
	public boolean persistJob(Admin admin) throws ClassNotFoundException, SQLException;

}

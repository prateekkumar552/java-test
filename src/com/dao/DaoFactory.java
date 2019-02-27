package com.dao;

public class DaoFactory {
	public static AdminDao getAdminDao(){
		return new AdminDaoImpl();
	}
	public static HRDao getHrDao(){
		return new HRDaoImpl();
	}

}

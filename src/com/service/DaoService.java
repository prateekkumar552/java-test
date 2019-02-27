package com.service;

import com.dao.AdminDao;
import com.dao.DaoFactory;
import com.dao.HRDao;

public class DaoService {
	public static void callService(String type){
		if(type.equals("admin")){
			AdminDao adao=DaoFactory.getAdminDao();
			adao.call();		
		}
		else{
			HRDao hdao=DaoFactory.getHrDao();
			hdao.call();
		}		
	}

}

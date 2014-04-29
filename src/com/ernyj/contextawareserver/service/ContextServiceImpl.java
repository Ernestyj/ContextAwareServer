package com.ernyj.contextawareserver.service;

import java.util.List;

import com.ernyj.contextawareserver.dao.BaseDAO;
import com.ernyj.contextawareserver.dao.Context;
import com.ernyj.contextawareserver.dao.Location;
import com.ernyj.contextawareserver.dao.Sensor;
import com.ernyj.contextawareserver.dao.User;

public class ContextServiceImpl implements ContextService{
	private BaseDAO dao;
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Context> listUserContexts(User user) {
//		return dao.findAll("Context");
//	}
//	@Override
//	public Context getContext(Integer id) {
//		return (Context)dao.getById(Context.class, id);
//	}
//	@Override
//	public boolean delContext(Integer id) {
//		boolean status = false;
//		try{
//			dao.delById(Context.class, id);
//			status = true;
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}	
//		return status;
//	}
	@Override
	public boolean saveOrUpdateContext(Context context) {
		boolean status = false;
		try{
			dao.saveOrUpdate(context);
			status = true;
		}catch(Exception ex){ ex.printStackTrace(); }	
		return status;
	}
	
	@Override
	public boolean saveOrUpdateContext(Context context, Location location, Sensor sensor) {
		boolean status = false;
		try{
			dao.saveOrUpdate(context);
			dao.saveOrUpdate(location);
			dao.saveOrUpdate(sensor);
			status = true;
		}catch(Exception ex){ ex.printStackTrace(); }	
		return status;
	}

	public BaseDAO getDao() { return dao; }
	public void setDao(BaseDAO dao) { this.dao = dao; }

}

package com.ernyj.contextawareserver.service;

import com.ernyj.contextawareserver.dao.Context;
import com.ernyj.contextawareserver.dao.Location;
import com.ernyj.contextawareserver.dao.Sensor;

public interface ContextService {
//	public List<Context> listUserContexts(User user);	
//	public Context getContext(Integer id);	
//	public boolean delContext(Integer id);	
	public boolean saveOrUpdateContext(Context context);
	public boolean saveOrUpdateContext(Context context, Location location, Sensor sensor);
}

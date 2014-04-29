package com.ernyj.contextawareserver.struts;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.ernyj.contextawareserver.dao.Context;
import com.ernyj.contextawareserver.dao.Location;
import com.ernyj.contextawareserver.dao.Sensor;
import com.ernyj.contextawareserver.dao.User;
import com.ernyj.contextawareserver.service.ContextService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ContextAction extends ActionSupport implements ServletResponseAware, ServletRequestAware{
	private ContextService contextService;
	//表单数据
	private String userid;
	private String province, city, district, address, latitude, longtitude, radius, nettype, operator;
	private String temperature, light, x, y, z;
	private String realtimetemperature,temperaturerange;
	private String datetime;

	private HttpServletResponse response;
	private HttpServletRequest request;
	
	public String addContext() throws Exception{
		setAllParameters();
		//Converter
		double double_latitude = Double.parseDouble(latitude);
		double double_longtitude = Double.parseDouble(longtitude);
		double double_radius = Double.parseDouble(radius);
		double double_x = Double.parseDouble(x);
		double double_y = Double.parseDouble(y);
		double double_z = Double.parseDouble(z);
		//preprocess
		String contextid = userid + " " + datetime;
		User user = new User(userid);
		Context context = new Context(contextid, user);
		context.setRealtimetemperature(realtimetemperature);
		context.setTemperaturerange(temperaturerange);
		context.setFlag("forTest");
		Location location = new Location(contextid, context, province, city, district, address, 
				double_latitude, double_longtitude, double_radius, nettype, operator);
		Sensor sensor = new Sensor(contextid, context, temperature, light, 
				double_x, double_y, double_z);
		context.setLocation(location);
		context.setSensor(sensor);
		//保存context到数据库
		contextService.saveOrUpdateContext(context, location, sensor);
		
		ServletOutputStream writer = null;
		try{
	        writer = response.getOutputStream();
	        writer.println("success");
	    } catch( Exception e ) { throw e; } 
		finally{ if( writer != null ) writer.close(); }
		
		return null;
	}
	
	private void setAllParameters(){	//临时解决action无法拦截获取表单数据问题
		userid = request.getParameter("userid");
		province = request.getParameter("province");
		city = request.getParameter("city");
		district = request.getParameter("district");
		address = request.getParameter("address");
		latitude = request.getParameter("latitude");
		longtitude = request.getParameter("longtitude");
		radius = request.getParameter("radius");
		nettype = request.getParameter("nettype");
		operator = request.getParameter("operator");
		temperature = request.getParameter("temperature");
		light = request.getParameter("light");
		x = request.getParameter("x");
		y = request.getParameter("y");
		z = request.getParameter("z");
		realtimetemperature = request.getParameter("realtimetemperature");
		temperaturerange = request.getParameter("temperaturerange");
		datetime = request.getParameter("datetime");
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) { this.response = response;  }
	@Override
	public void setServletRequest(HttpServletRequest request) { this.request = request; }
	public void setContextService(ContextService contextService){ this.contextService = contextService; }
	public ContextService getContextService(){ return this.contextService; }
	//表单数据getter, setter
	public String getUserid() { return userid; }
	void setUserid(String userid) { this.userid = userid; }
	
	public String getProvince() { return province; }
	public void setProvince(String province) { this.province = province; }
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
	public String getDistrict() { return district; }
	public void setDistrict(String district) { this.district = district; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	public String getLatitude() { return latitude; }
	public void setLatitude(String latitude) { this.latitude = latitude; }
	public String getLongtitude() { return longtitude; }
	public void setLongtitude(String longtitude) { this.longtitude = longtitude; }
	public String getRadius() { return radius; }
	public void setRadius(String radius) { this.radius = radius; }
	public String getNettype() { return nettype; }
	public void setNettype(String nettype) { this.nettype = nettype; }
	public String getOperator() { return operator; }
	public void setOperator(String operator) { this.operator = operator; }

	public String getTemperature() { return temperature; }
	public void setTemperature(String temperature) { this.temperature = temperature; }
	public String getLight() { return light; }
	public void setLight(String light) { this.light = light; }
	public String getX() { return x; }
	public void setX(String x) { this.x = x; }
	public String getY() { return y; }
	public void setY(String y) { this.y = y; }
	public String getZ() { return z; }
	public void setZ(String z) { this.z = z; }
	
	public String getRealtimetemperature() { return realtimetemperature; }
	public void setRealtimetemperature(String realtimetemperature) { this.realtimetemperature = realtimetemperature; }
	public String getTemperaturerange() { return temperaturerange; }
	public void setTemperaturerange(String temperaturerange) { this.temperaturerange = temperaturerange; }
	
	public String getDatetime() { return datetime; }
	public void setDatetime(String datetime) { this.datetime = datetime; }

	

	
}

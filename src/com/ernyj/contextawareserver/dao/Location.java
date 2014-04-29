package com.ernyj.contextawareserver.dao;



/**
 * Location entity. @author MyEclipse Persistence Tools
 */

public class Location  implements java.io.Serializable {


    // Fields    

     private String locationid;
     private Context context;
     private String province;
     private String city;
     private String district;
     private String address;
     private double latitude;
     private double longtitude;
     private double radius;
     private String nettype;
     private String operator;


    // Constructors

    /** default constructor */
    public Location() {
    }

	/** minimal constructor */
    public Location(String locationid, Context context) {
        this.locationid = locationid;
        this.context = context;
    }
    
    /** full constructor */
    public Location(String locationid, Context context, String province, String city, String district, String address, double latitude, double longtitude, double radius, String nettype, String operator) {
        this.locationid = locationid;
        this.context = context;
        this.province = province;
        this.city = city;
        this.district = district;
        this.address = address;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.radius = radius;
        this.nettype = nettype;
        this.operator = operator;
    }

   
    // Property accessors

    public String getLocationid() {
        return this.locationid;
    }
    
    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public Context getContext() {
        return this.context;
    }
    
    public void setContext(Context context) {
        this.context = context;
    }

    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return this.longtitude;
    }
    
    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getNettype() {
        return this.nettype;
    }
    
    public void setNettype(String nettype) {
        this.nettype = nettype;
    }

    public String getOperator() {
        return this.operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
   








}
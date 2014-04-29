package com.ernyj.contextawareserver.dao;



/**
 * Sensor entity. @author MyEclipse Persistence Tools
 */

public class Sensor  implements java.io.Serializable {


    // Fields    

     private String sensorid;
     private Context context;
     private String temperature;
     private String light;
     private double x;
     private double y;
     private double z;


    // Constructors

    /** default constructor */
    public Sensor() {
    }

	/** minimal constructor */
    public Sensor(String sensorid, Context context) {
        this.sensorid = sensorid;
        this.context = context;
    }
    
    /** full constructor */
    public Sensor(String sensorid, Context context, String temperature, String light, double x, double y, double z) {
        this.sensorid = sensorid;
        this.context = context;
        this.temperature = temperature;
        this.light = light;
        this.x = x;
        this.y = y;
        this.z = z;
    }

   
    // Property accessors

    public String getSensorid() {
        return this.sensorid;
    }
    
    public void setSensorid(String sensorid) {
        this.sensorid = sensorid;
    }

    public Context getContext() {
        return this.context;
    }
    
    public void setContext(Context context) {
        this.context = context;
    }

    public String getTemperature() {
        return this.temperature;
    }
    
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getLight() {
        return this.light;
    }
    
    public void setLight(String light) {
        this.light = light;
    }

    public double getX() {
        return this.x;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }
    
    public void setZ(double z) {
        this.z = z;
    }
   








}
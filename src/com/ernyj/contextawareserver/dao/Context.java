package com.ernyj.contextawareserver.dao;



/**
 * Context entity. @author MyEclipse Persistence Tools
 */

public class Context  implements java.io.Serializable {


    // Fields    

     private String contextid;
     private User user;
     private String flag;
     private String temperaturerange;
     private String realtimetemperature;
     private Sensor sensor;
     private Location location;


    // Constructors

    /** default constructor */
    public Context() {
    }

	/** minimal constructor */
    public Context(String contextid, User user) {
        this.contextid = contextid;
        this.user = user;
    }
    
    /** full constructor */
    public Context(String contextid, User user, String flag, String temperaturerange, String realtimetemperature, Sensor sensor, Location location) {
        this.contextid = contextid;
        this.user = user;
        this.flag = flag;
        this.temperaturerange = temperaturerange;
        this.realtimetemperature = realtimetemperature;
        this.sensor = sensor;
        this.location = location;
    }

   
    // Property accessors

    public String getContextid() {
        return this.contextid;
    }
    
    public void setContextid(String contextid) {
        this.contextid = contextid;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public String getFlag() {
        return this.flag;
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTemperaturerange() {
        return this.temperaturerange;
    }
    
    public void setTemperaturerange(String temperaturerange) {
        this.temperaturerange = temperaturerange;
    }

    public String getRealtimetemperature() {
        return this.realtimetemperature;
    }
    
    public void setRealtimetemperature(String realtimetemperature) {
        this.realtimetemperature = realtimetemperature;
    }

    public Sensor getSensor() {
        return this.sensor;
    }
    
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
   








}
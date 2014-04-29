package com.ernyj.contextawareserver.dao;

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private String userid;
     private String username;
     private String userpassword;
     private Set contexts = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String userid) {
        this.userid = userid;
    }
    
    /** full constructor */
    public User(String userid, String username, String userpassword, Set contexts) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.contexts = contexts;
    }
    
    public User(String userid, String username, String userpassword) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
    }
   
    // Property accessors

    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return this.userpassword;
    }
    
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Set getContexts() {
        return this.contexts;
    }
    
    public void setContexts(Set contexts) {
        this.contexts = contexts;
    }
   








}
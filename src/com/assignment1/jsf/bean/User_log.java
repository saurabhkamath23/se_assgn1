package com.assignment1.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.*;
import java.util.*;

@ManagedBean
public class User_log {

	public String UserName;
	public String Password;

	public User_log() {

	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}

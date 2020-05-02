package com.artempvn.task_3.client;
class User{
private String login;
private String password;
private String isAdmin;

public User(String login,String password,String isAdmin){
this.login=login;
this.password=password;
this.isAdmin=isAdmin;
}

public String getLogin(){
	return login;
}
public String getPassword(){
	return password;
}
public String getAdmin(){
	return isAdmin;
}
}
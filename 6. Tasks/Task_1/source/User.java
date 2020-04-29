class User{
private String login;
private String password;
private String email;
private String isAdmin;

public User(String login,String password,String email,String isAdmin){
this.login=login;
this.password=password;
this.email=email;
this.isAdmin=isAdmin;
}

public String getEmail(){
	return email;
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

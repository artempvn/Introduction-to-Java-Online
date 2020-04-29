class Note {
private String title;
private String date;
private String email;
private String message;

public Note(String title,String date,String email,String message){
this.title=title;
this.date=date;
this.email=email;
this.message=message;
}

public String getTitle(){
	return title;
}
public String getDate(){
	return date;
}
public String getEmail(){
	return email;
}
public String getMessage(){
	return message;
}
}
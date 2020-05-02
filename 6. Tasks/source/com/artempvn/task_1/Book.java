package com.artempvn.task_1;
class Book implements Comparable<Book>{
private String title;
private String author;
private String type;
private String description;
private String info;

public Book(String title,String author, String type){
this.title=title;
this.author=author;
this.type=type;	
info=title+"/"+author+"/"+type+"/"+description;
}

public Book(String title,String author,String type,String description){
this(title,author,type);
this.description=description;		
info=title+"/"+author+"/"+type+"/"+description;
}
public String getTitle(){
	return title;
}
public String getAuthor(){
	return author;
}
public String getType(){
	return type;
}
public String getDescription(){
	return description;
}
public String getInfo(){
	return info;
}
public int compareTo(Book o) {
return this.title.compareTo(o.title);
}
}
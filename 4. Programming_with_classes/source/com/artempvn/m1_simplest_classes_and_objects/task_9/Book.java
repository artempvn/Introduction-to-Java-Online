package com.artempvn.m1_simplest_classes_and_objects.task_9;
class Book {
private int id;
private String title;
private String author;
private String publisher;
private String year;
private String pages;
private String price;
private String binding;
public Book(){} 
public Book(String books){  
String[] a=books.split("/");	
this.id=Integer.parseInt(a[0]);
this.title=a[1];
this.author=a[2];	
this.publisher=a[3];
this.year=a[4];
this.pages=a[5];
this.price=a[6];
this.binding=a[7];	
}
public Book(int id, String title, String author, String publisher, String year, String pages, String price,String binding){  	
this.id=id;
this.title=title;
this.author=author;	
this.publisher=publisher;
this.year=year;
this.pages=pages;
this.price=price;	
this.binding=binding;
}

public void setId(int id){
	this.id=id;
}
public void setTitle(String title){
	this.title=title;
}
public void setAuthor(String author){
	this.author=author;
}
public void setPublisher(String publisher){
	this.publisher=publisher;
}
public void setYear(String year){
	this.year=year;
}
public void setPages(String pages){
	this.pages=pages;
}
public void setPrice(String price){
	this.price=price;
}
public void setBinding(String binding){
	this.binding=binding;
}
public int getId(){
	return id;
}
public String getTitle(){
	return title;
}
public String getAuthor(){
	return author;
}
public String getPublisher(){
	return publisher;
}
public String getYear(){
	return year;
}
public String getPages(){
	return pages;
}
public String getPrice(){
	return price;
}
public String getBinding(){
	return binding;
}
 public String toString() {
        return "id: "+id+"; название: "+title+"; автор(ы): "+author+"; издательство: "+publisher+"; год издания: "+year+"; количество страниц: "+pages+"; цена: "+price+"; тип переплета: "+binding+"\n";
    }
}






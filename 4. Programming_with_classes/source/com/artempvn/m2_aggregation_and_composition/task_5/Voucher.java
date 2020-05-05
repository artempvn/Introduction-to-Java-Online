package com.artempvn.m2_aggregation_and_composition.task_5;
class  Voucher { 
private int id;
private String type;
private String transport;
private String meal;
private int days;

public int getId(){
	return id;
}
public String getType(){
	return type;
}
public String getTransport(){
	return transport;
}
public String getMeal(){
	return meal;
}
public int getDays(){
	return days;
}

public Voucher (int id, String type, String transport, String meal, int days){
this.id=id;
this.type=type;
this.transport=transport;
this.meal=meal;
this.days=days;
}

}














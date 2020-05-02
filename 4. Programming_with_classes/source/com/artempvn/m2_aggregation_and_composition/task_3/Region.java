package com.artempvn.m2_aggregation_and_composition.task_3;
import java.util.*;
class  Region { 
private String name;
private double square;
private City capital;
private ArrayList<Area> areas=new ArrayList<Area>();

public String getName(){
	return name;
}
public City getCapital(){
	return capital;
}
public ArrayList<Area> getAreas(){
	return areas;
}
public double getSquare(){
	return square;
}

public Region(String name, Area...areas){ 
	this.name=name;
	for(Area a:areas){
	this.areas.add(a);	
	square+=a.getSquare();
	}
capital=this.areas.get(0).getCities().get(0);
}
}

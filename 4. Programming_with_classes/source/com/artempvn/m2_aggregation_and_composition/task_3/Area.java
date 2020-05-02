package com.artempvn.m2_aggregation_and_composition.task_3;
import java.util.*;
class  Area { 
private String name;
private double square;
private City capital; 
private ArrayList<City> cities=new ArrayList<City>();

public String getName(){
	return name;
}
public City getCapital(){
	return capital;
}
public ArrayList<City> getCities(){
	return cities;
}

public double getSquare(){
	return square;
}


public Area(String name, double square, City...cities){ 
	this.name=name;
	this.square=square;
	for(City c:cities){
	this.cities.add(c);	
	}
capital=this.cities.get(0);
}
}





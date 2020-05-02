package com.artempvn.task_4;
import java.util.*;
import static java.lang.Math.*;
class Treasure {
private static int number=1;
private int id;
private String name;
private int cost;

public Treasure(String name, int cost){
id=number;
number++;
this.name=name;
this.cost=cost;
}

public int getId(){
	return id;
}
public String getName(){
	return name;
}
public int getCost(){
	return cost;
}

public static Treasure create(){
String[] names={"аметист","гранат","изумруд","бриллиант", "рубин","опал","жемчуг"};
int nm=(int)(random()*names.length);
int cst=(int)(random()*50+1);	
Treasure t=new Treasure(names[nm],cst);	
return t;	
}
}

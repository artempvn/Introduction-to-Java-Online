package com.artempvn.task_4;
import java.util.*;
import static java.lang.Math.*;

class Ship implements Runnable{
private String name;
private Harbour harbour;
private int capacity;
private int cargo;
private String type;
	
public Ship(String name,Harbour harbour, int capacity, int cargo, String type){
	this.name=name;
	this.harbour=harbour;
	this.capacity=capacity;
	this.cargo=cargo;
	this.type=type;
}

public int getCargo(){
	return cargo;
}
public int getCapacity(){
	return capacity;
}

public String getName(){
	return name;
}

public Harbour getHarbour(){
	return harbour;
}
public String getType(){
	return type;
}

public void  startJorney(){
goToPort();
switch (type){
	case "export":
	if (loading()){
	try{
	Thread.sleep(5000);
	} catch (Exception ex){}
	}
	break;
	case "import":
	if (unloading()){
	try{
	Thread.sleep(5000);
	} catch (Exception ex){}
	}
	break;
}
leavePort();
adventuresInAnotherPlaces();	
}
	
public void goToPort(){
harbour.checkStatus();
System.out.println(name+" вошел в порт. Ќа борту "+cargo+" контейнеров из "+capacity);	
}

public boolean loading(){
boolean isLoaded=false;		
while (cargo<capacity){
if (harbour.getWarehouse().tryLoadCargo()) {
	cargo++;
	isLoaded=true;
	System.out.println(name+" загрузил контейнер");
} else {
System.out.println("Ќа складе не осталось контейнеров дл¤ "+name);	
break;
}
	}
	if (isLoaded) System.out.println(name+" загрузил все доступные контейнеры.");	
	
return isLoaded;
}

public boolean unloading(){
boolean isUnLoaded=false;		
while (cargo>0){
if (harbour.getWarehouse().tryUnLoadCargo()) {
	cargo--;
	isUnLoaded=true;
	System.out.println(name+" выгрузил контейнер");
} else {
System.out.println("Ќа складе нет места дл¤ контейнеров от "+name);	
break;
}
	}
	if (isUnLoaded) System.out.println(name+" выгрузил все доступные контейнеры.");	
	
return isUnLoaded;
}

public void leavePort(){
harbour.leavePort();
System.out.println(name+" покинул порт. Ќа борту "+cargo+" контейнеров из "+capacity);	
}

public void adventuresInAnotherPlaces(){
	try{
	Thread.sleep((int)(random()*5+1)*10000);
	} catch (Exception ex){}	
	if(type.equals("import")) cargo=(int)(random()*capacity+1);
	if(type.equals("export")) cargo=(int)(random()*capacity);
		try{
	Thread.sleep((int)(random()*5+1)*10000);
	} catch (Exception ex){}
}



public void run(){
	while(true){
startJorney();
	}		
	}
	
	
}

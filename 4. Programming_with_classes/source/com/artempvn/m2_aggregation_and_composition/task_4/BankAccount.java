package com.artempvn.m2_aggregation_and_composition.task_4;
import java.util.*;
class  BankAccount { 
private int id;
private double money;
private boolean frozen;

public int getId(){
	return id;
}
public double getMoney(){
	return money;
}
public boolean isFrozen(){
	return frozen;
}

public void setFrozen(boolean frozen){
	this.frozen=frozen;
}

public BankAccount(int id){
this.id=id;	
}

public BankAccount(int id, double money,boolean frozen){
this(id);
this.money=money;
this.frozen=frozen;	
}
public void addMoney(double money){
	if (!frozen){
		this.money+=money;
	} else System.out.println("Счет №"+id+" заблокирован.");
}
public void takeMoney(double money){
	if (!frozen){
		this.money-=money;
	} else System.out.println("Счет №"+id+" заблокирован.");
}
}














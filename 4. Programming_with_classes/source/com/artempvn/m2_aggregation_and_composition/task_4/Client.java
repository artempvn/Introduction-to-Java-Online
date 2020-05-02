//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
//всем счетам, имеющим положительный и отрицательный балансы отдельно.
package com.artempvn.m2_aggregation_and_composition.task_4;
import java.util.*;
import static java.lang.Math.*;
public class Client {
	
private String name;
private ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();	
private double totalMoney;
private double plusMoney;
private double minusMoney;

public Client(String name){
	this.name=name;
}
public Client(String name,BankAccount...accounts){
	this(name);
	for(BankAccount b:accounts){
		
	this.accounts.add(b);	
	}
}

class IdCompare implements Comparator<BankAccount>{
	public int compare (BankAccount one, BankAccount two){
		return new Integer(one.getId()).compareTo(two.getId());
	}
}
public  void function (){
System.out.println("Сортировка по id счета");
IdCompare idcom=new IdCompare();
Collections.sort(accounts,idcom);	
}

class MoneyCompare implements Comparator<BankAccount>{
	public int compare (BankAccount one, BankAccount two){
		int ret=0;
		if(one.getMoney()-two.getMoney()<0) ret=-1;
		if(one.getMoney()-two.getMoney()==0) ret=0;
		if(one.getMoney()-two.getMoney()>0) ret=1;
		return ret;
	}
}
public  void function1 (){ 
System.out.println("Сортировка по количеству денег на счете");
MoneyCompare moncom=new MoneyCompare();
Collections.sort(accounts,moncom);	
}

class FrozenCompare implements Comparator<BankAccount>{
	int ret=0;
	public int compare (BankAccount one, BankAccount two){
		if(one.isFrozen()==two.isFrozen()) ret=0;
		if(one.isFrozen()!=two.isFrozen()&&one.isFrozen()==true) ret=1;
		if(one.isFrozen()!=two.isFrozen()&&one.isFrozen()==false) ret=-1;
		return ret;
	}
}
public  void function2 (){ 
System.out.println("Сортировка по состоянию счета");
FrozenCompare frozcom=new FrozenCompare();
Collections.sort(accounts,frozcom);	
}

public void addAccount(BankAccount account){
	accounts.add(account);
}
public void deleteAccount(int id){
	for(BankAccount b:accounts){
	if (id==(b.getId()))	accounts.remove(b);
	}
}

public void search(int id){
	System.out.printf("Поиск счета id: %d\n",id);
boolean find=false;	
	for(BankAccount b:accounts){
	if (id==(b.getId()))	{
		System.out.printf("id: %d; Количество денег: %.2f; Блокировка счета: %b \n",b.getId(),b.getMoney(),b.isFrozen());
		find=true;	
	}
	}
	if(!find)System.out.printf("Cчет id: %d не найден\n",id);
}


public void printTotal(){
	for(BankAccount b:accounts){
		totalMoney+=b.getMoney();
		if (b.getMoney()>0) plusMoney+=b.getMoney();
		else minusMoney+=abs(b.getMoney());
	}
System.out.printf("Общая сумма: %.2f \n",totalMoney);
System.out.printf("Положительный баланс: %.2f \n",plusMoney);	
System.out.printf("Отрицательный баланс: %.2f \n",minusMoney);		
}


public void print(){
	for(BankAccount b:accounts){
	System.out.printf("id: %d; Количество денег: %.2f; Блокировка счета: %b \n",b.getId(),b.getMoney(),b.isFrozen());	
	}
}


public static void main (String [] args) {
BankAccount b1=new BankAccount(1,120,true);
BankAccount b2=new BankAccount(2,100,false);
BankAccount b3=new BankAccount(3,500,false);
BankAccount b4=new BankAccount(4,-10,true);
Client a=new Client("Клиент1",b1,b2,b3,b4);
a.print();
a.function();
a.print();
a.function1();
a.print();
a.function2();
a.print();
a.search(1);
a.printTotal();
}
}
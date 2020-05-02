//������� ����� Payment � ���������� �������, � ������� �������� �������� ����� ������������ ������� �� 
//���������� �������.
package com.artempvn.task_2;
import java.util.*;
import java.nio.file.*;
import java.io.BufferedWriter;
import static java.lang.Math.*;

public class Payment {
private int id;
private ArrayList<Item> items=new ArrayList<Item>();

public Payment(int id){
this.id=id;	
}

public int getId(){
	return id;
}
public ArrayList<Item> getItems(){
	return items;
}

public void add (Item item){
items.add(item);
}

public void delete (int id){
	for(Item i:items){
		if(i.getId()==id)	{
			items.remove(items.indexOf(i));
			return;
		}
	}
}

public void print(){
	double sum=0;
for(Item i:items){
	System.out.printf("id: %d; �����: %s; ����: %.2f\n", i.getId(),i.getName(),i.getCost());
	sum+=i.getCost();
	}
System.out.printf("����� ���������: %.2f\n", sum);	
}

class Item{
private int id;
private String name;
private double cost;

public Item (int id, String name,double cost){
this.id=id;
this.name=name;
this.cost=cost;
Payment.this.add(this);	
}

public int getId(){
	return id;
}
public String getName(){
	return name;
}
public double getCost(){
	return cost;
}
}

public static void main (String [] args) {
Payment p1=new Payment(1);	
Payment.Item i1=p1.new Item(1,"������",1.49d);
Payment.Item i2=p1.new Item(2,"������",6.55d);
Payment.Item i3=p1.new Item(3,"���",1.99d);
Payment.Item i4=p1.new Item(4,"��������",2.01d);
Payment.Item i5=p1.new Item(5,"������",1.88d);
p1.print();
}
}





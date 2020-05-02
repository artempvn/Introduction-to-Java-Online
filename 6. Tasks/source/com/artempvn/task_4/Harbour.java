/*
���������������.  ����.  �������  �������  �  ����  ��� 
���������/��������  �����������. ����� �����������, ����������� � ������� ������ 
�  �����  �  ��  �������,  ������  ����  ���������������  �  �����������  �������� 
���������������� ����� � ����������� �����. � ����� �������� ��������� ��������. 
� ������ ������� ����� ������ ���� �������. ������� ����� ����������� � ������� 
��� ������������.
*/
package com.artempvn.task_4;
import java.util.*;
import static java.lang.Math.*;

public class Harbour {
private Warehouse warehouse;
private	Ship ship;
private	int numberOfDocks;

public Harbour(Warehouse warehouse, int numberOfDocks){
	this.warehouse=warehouse;
	this.numberOfDocks=numberOfDocks;
}

public Warehouse getWarehouse(){
	return warehouse;
}

public int getNumberOfDocks(){
	return numberOfDocks;
}
public Ship getShip(){
	return ship;
}

public void leavePort (){
	numberOfDocks++;
}
	
public synchronized void checkStatus(){ 
	while (numberOfDocks==0){
try{
	Thread.sleep(500);
} catch (Exception ex){}	
	
}
numberOfDocks--;	
}

public static void start(){
boolean check=false;
int numberOfDocks=0;
int cargo=0;
int capacity=0;
int numberOfExportShips=0;
int numberOfImportShips=0;
Scanner in=new Scanner(System.in);
System.out.println("����� ���������� � ��������� �����");
System.out.print("������� ���������� �������� ");
do{
check=false;
String s=in.next();	
try{
numberOfDocks=Integer.parseInt(s);
if(numberOfDocks<=0) check=true;
}catch (NumberFormatException ex){check=true;}
}while (check);
System.out.print("������� ����������� (������������ ���������� �����������) ��������� ������ ");
do{
check=false;
String s=in.next();	
try{
capacity=Integer.parseInt(s);
if(capacity<=0) check=true;
}catch (NumberFormatException ex){check=true;}
}while (check);
System.out.print("������� ��������� ���������� ����������� �� ������(�� ����� �����������) ");
do{
check=false;
String s=in.next();	
try{
cargo=Integer.parseInt(s);
if(cargo<0||cargo>capacity) check=true;
}catch (NumberFormatException ex){check=true;}
}while (check);
System.out.print("������� ���������� �������� ��� ������� ����������� �� ����� ����� ");
do{
check=false;
String s=in.next();	
try{
numberOfImportShips=Integer.parseInt(s);
if(numberOfImportShips<0) check=true;
}catch (NumberFormatException ex){check=true;}
}while (check);
System.out.print("������� ���������� �������� ��� �������� ����������� �� ������ ����� ");
do{
check=false;
String s=in.next();	
try{
numberOfExportShips=Integer.parseInt(s);
if(numberOfImportShips<0) check=true;
}catch (NumberFormatException ex){check=true;}
}while (check);
Warehouse w1=new Warehouse(cargo,capacity);
Harbour h1=new Harbour(w1,numberOfDocks);
System.out.print("���� ������.  ������� ����� ����������� ������������ � ����. ������� ����� ������ ��� ������  ���������������� �����. ");
in.next();
System.out.println("---------------------------------");
for(int i=0;i<numberOfImportShips;i++){
(new Thread(new Ship("������� ������"+(i+1),h1,(int)(random()*3+2),(int)(random()*2+1),"import"))).start();	
}
for(int i=0;i<numberOfExportShips;i++){
(new Thread(new Ship("������� �������"+(i+1),h1,(int)(random()*3+2),(int)(random()*2),"export"))).start();	
}
}
		
public static void main (String [] args){
start();	

	}
}

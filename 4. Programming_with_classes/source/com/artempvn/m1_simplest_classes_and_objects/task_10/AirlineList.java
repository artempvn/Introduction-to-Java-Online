/*
*������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������,  set- � get- ������ 
*� �����  toString(). ������� ������ �����, ������������ ������ ����  Airline, � ����������� �������������� � 
*��������. ������ �������� ������ ������ � ������� ��� ������ �� �������. 
*Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������. 
*����� � �������: 
*a) ������ ������ ��� ��������� ������ ����������; 
*b) ������ ������ ��� ��������� ��� ������; 
*c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
*/
package com.artempvn.m1_simplest_classes_and_objects.task_10;
import java.util.*;
import static java.lang.Math.*;
public class AirlineList {
private ArrayList<Airline> arln;

public  void function (String destination){ //������ ������ ��� ������ ����������
System.out.println("������ ������ � "+destination+":");
for(Airline i:arln)	{
	if (i.getDestination().equals(destination)){
System.out.println(i.getNumber());
	}
}
}

public  void function1 (String days){ //������ ������ � ���� ������
System.out.println("������ ������ �� "+days+":");
for(Airline i:arln)	{
	if (i.getDays().contains(days)){
System.out.println(i.getNumber());
	}
}
}

public  void function2 (String days, String departureTime){ //������ ������ � ���� ������ ����� ���������� �������
System.out.println("������ ������ �� "+days+" ����� "+departureTime+":");
for(Airline i:arln)	{
	if (i.getDays().contains(days)&&i.getDepartureTime().compareTo(departureTime)>0){
System.out.println(i.getNumber());
	}
}
}

public static void main (String [] args) {
String b="������/B2 975/Boeing 737-300/07:50/�� ��\n�������/B2 783/Embraer 195/08:00/�� ��\n������/B2 957/Embraer 175/08:45/�� �� ��\n�������/B2 805/Embraer 175/10:30/��\n���������/B2 867/Embraer 175/10:30/�� �� ��\n";
String[] a=b.split("\n");
AirlineList c=new AirlineList();		
c.arln=new ArrayList<Airline>();
for (int i=0;i<a.length;i++){
	c.arln.add(new Airline(a[i]));
	System.out.println(c.arln.get(i));
}

Scanner in = new Scanner(System.in);
System.out.println("������� ����� ����������");
String destination=in.nextLine();
c.function(destination);
System.out.println("������� ���� ������");
String days=in.nextLine();
c.function1(days);
System.out.println("������� ���� ������");
days=in.nextLine();
System.out.println("������� �����");
String departureTime=in.nextLine();
c.function2(days,departureTime);
}
}


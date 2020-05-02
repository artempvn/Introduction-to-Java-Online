/*
*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,  set- и get- методы 
*и метод  toString(). Создать второй класс, агрегирующий массив типа  Airline, с подходящими конструкторами и 
*методами. Задать критерии выбора данных и вывести эти данные на консоль. 
*Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. 
*Найти и вывести: 
*a) список рейсов для заданного пункта назначения; 
*b) список рейсов для заданного дня недели; 
*c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/
package com.artempvn.m1_simplest_classes_and_objects.task_10;
import java.util.*;
import static java.lang.Math.*;
public class AirlineList {
private ArrayList<Airline> arln;

public  void function (String destination){ //Список рейсов для пункта назначения
System.out.println("Список рейсов в "+destination+":");
for(Airline i:arln)	{
	if (i.getDestination().equals(destination)){
System.out.println(i.getNumber());
	}
}
}

public  void function1 (String days){ //Список рейсов в день недели
System.out.println("Список рейсов по "+days+":");
for(Airline i:arln)	{
	if (i.getDays().contains(days)){
System.out.println(i.getNumber());
	}
}
}

public  void function2 (String days, String departureTime){ //Список рейсов в день недели после указанного времени
System.out.println("Список рейсов по "+days+" после "+departureTime+":");
for(Airline i:arln)	{
	if (i.getDays().contains(days)&&i.getDepartureTime().compareTo(departureTime)>0){
System.out.println(i.getNumber());
	}
}
}

public static void main (String [] args) {
String b="Москва/B2 975/Boeing 737-300/07:50/ПН ЧТ\nСтамбул/B2 783/Embraer 195/08:00/ВТ СБ\nМосква/B2 957/Embraer 175/08:45/СР ПТ ВС\nТаллинн/B2 805/Embraer 175/10:30/ВТ\nАмстердам/B2 867/Embraer 175/10:30/ПН ЧТ СБ\n";
String[] a=b.split("\n");
AirlineList c=new AirlineList();		
c.arln=new ArrayList<Airline>();
for (int i=0;i<a.length;i++){
	c.arln.add(new Airline(a[i]));
	System.out.println(c.arln.get(i));
}

Scanner in = new Scanner(System.in);
System.out.println("Введите пункт назначения");
String destination=in.nextLine();
c.function(destination);
System.out.println("Введите день недели");
String days=in.nextLine();
c.function1(days);
System.out.println("Введите день недели");
days=in.nextLine();
System.out.println("Введите время");
String departureTime=in.nextLine();
c.function2(days,departureTime);
}
}


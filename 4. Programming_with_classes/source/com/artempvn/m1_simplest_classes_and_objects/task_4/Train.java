/*Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
*Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
*номерам поездов. Добавьте  возможность вывода информации о поезде,  номер которого введен пользователем. 
*Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
*назначения должны быть упорядочены по времени отправления.*/
package com.artempvn.m1_simplest_classes_and_objects.task_4;
import java.util.*;
public class Train {
String arrivalStation;
String number;
String departureTime;

public Train(){};
public Train(String trn){  
String[] a=trn.split("/");	
this.arrivalStation=a[0];
this.number=a[1];
this.departureTime=a[2];		
}
public static void print (Train train){
System.out.printf("%-15s %-7s %-7s \n",train.arrivalStation,train.number,train.departureTime);	
}
public static void print (ArrayList<Train> trains){
for (int i=0;i<trains.size();i++){
print(trains.get(i));
	}
System.out.printf("--------\n");	
}

class NumberCompare implements Comparator<Train>{
	public int compare (Train one, Train two){
		return one.number.compareTo(two.number);
	}
}
public  void function (ArrayList<Train> trains){ 
System.out.println("Сортировка по номеру поезда");
NumberCompare numcom=new NumberCompare();
Collections.sort(trains,numcom);	
}

public static void function1 (ArrayList<Train> trains,String num){ 
boolean b=true;
for (int i=0;i<trains.size();i++){
	if(trains.get(i).number.equals(num)){
print(trains.get(i));
b=false;
	}
	}
if(b) System.out.printf("Поезд №%s не найден\n",num);
System.out.printf("--------\n");	
}


class ArrivalCompare implements Comparator<Train>{
	public int compare (Train one, Train two){
		if (one.arrivalStation.compareTo(two.arrivalStation)==0){
			return one.departureTime.compareTo(two.departureTime);
		} else
		
		return one.arrivalStation.compareTo(two.arrivalStation);
	}
}
public  void function2 (ArrayList<Train> trains){ 
System.out.println("Сортировка по пункту назначения");
ArrivalCompare arrcom=new ArrivalCompare();
Collections.sort(trains,arrcom);	
}

public static void main (String [] args) {
String b="Орша/137/19:53\nБрест/229/10:03\nОрша/216/13:06\nЛида/318/00:31\nОрша/069/13:05\n";
String[] a=b.split("\n");	
ArrayList<Train> trains=new ArrayList<Train>();
for (int i=0;i<a.length;i++){
	trains.add(new Train(a[i]));
}
print(trains);
new Train().function(trains);
print(trains);
Scanner in = new Scanner(System.in);
System.out.printf("Введите номер поезда\n");
String num=in.next();
function1(trains,num);
new Train().function2(trains);
print(trains);
}
}









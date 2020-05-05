/*Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и 
*изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
*недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на 
*заданное количество часов, минут и секунд.*/
package com.artempvn.m1_simplest_classes_and_objects.task_6;
import java.util.*;
public class Time {
int sec;
int min;
int hour;

public int function00(int count){ 
	if (count>59||count<0) return 0;
	return count;
}

public void setSec(int sec){
sec=function00(sec);	
this.sec=sec;
}
public void  setMin(int min){
min=function00(min);	
this.min=min;
}
public void  setHour(int hour){	
this.hour=hour;
}
public void setTime(int hour,int min, int sec){
setHour(hour);
setMin(min);
setSec(sec);
}
public void getTime(){
System.out.printf("%02dч:%02dмин:%02dс\n",hour,min,sec);
}

public int timeToSec(){
int timesec=hour*3600+min*60+sec;
return timesec;
}

public void secToTime(int sec){
if (sec<0){
hour=0;
min=0;
this.sec=0;
return;
}
hour=sec/3600;
min=(sec-hour*3600)/60;
this.sec=sec-hour*3600-min*60;
}

public void addSec(int sec){
secToTime(timeToSec()+sec);	
}
public void addMin(int min){
secToTime(timeToSec()+min*60);	
}
public void addHour(int hour){
secToTime(timeToSec()+hour*3600);	
}
public void addTime(int hour,int min,int sec){
secToTime(timeToSec()+hour*3600+min*60+sec);	
}


public static void main (String [] args) {
Time time=new Time();
time.setTime(1,15,3);
time.getTime();
time.addTime(1,5,30);
time.getTime();
}
}









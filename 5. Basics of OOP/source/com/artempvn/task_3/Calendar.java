//������� ����� ��������� � ���������� �������, � ������� �������� �������� ����� ������� ���������� � 
//�������� � ����������� ����.
package com.artempvn.task_3;
import java.util.*;
import java.nio.file.*;
import java.io.BufferedWriter;
import static java.lang.Math.*;

public class Calendar {
private int year;
private ArrayList<Holydays> holydays=new ArrayList<Holydays>();

public Calendar(int year){
	this.year=year;
}

public ArrayList<Holydays> getHolydays(){
	return holydays;
}
public int getYear(){
	return year;
}

public void add (Holydays holyday){
holydays.add(holyday);
}
public void print(){
System.out.printf("���: %d\n", year);	
for(Holydays hd:holydays){
	System.out.printf("�����: %-8s ����: %-3d %s\n",hd.getMonth(), hd.getDay(),hd.getHoliday());
	}
}


class Holydays{
private int day;
private String month;
private String holyday;

public Holydays (int day, String month,String holyday){
this.day=day;
this.month=month;
this.holyday=holyday;
Calendar.this.add(this);	
}

public int getDay(){
	return day;
}
public String getMonth(){
	return month;
}
public String getHoliday(){
	return holyday;
}
}

public static void main (String [] args) {
Calendar c1=new Calendar(2020);	
Calendar.Holydays h1=c1.new Holydays(1,"������","����� ���");
Calendar.Holydays h2=c1.new Holydays(4,"������","��������");
Calendar.Holydays h3=c1.new Holydays(5,"������","��������");
Calendar.Holydays h4=c1.new Holydays(7,"������","���������");
Calendar.Holydays h5=c1.new Holydays(11,"������","��������");
c1.print();
}
}





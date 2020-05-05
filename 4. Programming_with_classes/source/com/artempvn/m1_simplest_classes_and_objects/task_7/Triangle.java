//Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
//площади, периметра и точки пересечения медиан.
package com.artempvn.m1_simplest_classes_and_objects.task_7;
import java.util.*;
import static java.lang.Math.*;
public class Triangle {
double a;
double b;
double c;
double a1;
double b1;
double c1;
int create;
double squ;
double per;
double ma;
double mb;
double mc;

public  Triangle(double a2,double b2,double c2,int d){
switch(d){
	case(1): //создание треугольника по трем сторонам
	if (a2<b2+c2&&b2<a2+c2&&c2<a2+b2){
this.a=a2;
this.b=b2;
this.c=c2;
create=d;
}else {
System.out.printf("Треугольник не существует\n");
}
	break;
	case(2): //создание треугольника по двум сторонам и углу между ними
	if (c2<180&&c2>0){
this.a=a2;
this.b=b2;
this.c1=c2;
create=d;
}else {
System.out.printf("Введен неверный угол\n");
}
	break;
	case(3): //создание треугольника по двум углам и стороной между ними
	if (b2+c2<180){
this.a=a2;
this.b1=b2;
this.c1=c2;
create=d;
}else {
System.out.printf("Треугольник не существует\n");
}
	break;
	default:
	System.out.printf("Не выбран метод создания треугольника\n");
	break;
}
}

public void fuction(int create){ //нахождение неуказанных углов/сторон, периметра, площади
switch(create){
	case(1):fuction1();break;
	case(2):fuction2();break;
	case(3):fuction3();break;
}
perimeter();
square();	
med();
}

public void fuction1(){ 
a1=toDegrees(acos((pow(b,2)+pow(c,2)-pow(a,2))/(2*b*c)));	
b1=toDegrees(acos((pow(a,2)+pow(c,2)-pow(b,2))/(2*a*c)));
c1=180-a1-b1;		
}

public void fuction2(){
c=pow(pow(a,2)+pow(b,2)-2*a*b*cos(toRadians(c1)),0.5);
fuction1();		
}
public void fuction3(){
a1=180-b1-c1;
b=a*sin(toRadians(b1))/sin(toRadians(a1));
c=a*sin(toRadians(c1))/sin(toRadians(a1));
}

public void perimeter(){
per=a+b+c;
}
public void square(){
double p=per/2;
squ=pow((p* (p-a)*(p-b)*(p-c)),0.5);
}
public void med(){
ma=pow(2*pow(b,2)+2*pow(c,2)-pow(a,2),0.5)/2;
mb=pow(2*pow(a,2)+2*pow(c,2)-pow(b,2),0.5)/2;
mc=pow(2*pow(a,2)+2*pow(b,2)-pow(c,2),0.5)/2;
}

public void print(){ 
System.out.printf("%-10s %-5.2f %-5.2f %-5.2f\n%-10s %-5.2f %-5.2f %-5.2f\n","Стороны:",a,b,c,"Углы:",a1,b1,c1);
System.out.printf("%-10s %-5.2f\n","Периметр:",per);
System.out.printf("%-10s %-5.2f\n","Площадь:",squ);
System.out.printf("Точка пересечения медиан находится на следующих удалениях от вершин:\n%-10s %-5.2f %-5.2f %-5.2f\n","",(ma*2/3),(mb*2/3),(mc*2/3));
}

public static void main (String [] args) {
Scanner in = new Scanner(System.in);
int d=0;
do {
System.out.println("Выберите способ создания треугольника:\n1.По трем сторонам;\n2.По двум сторонам и углу между ними;\n3.По стороне и двум примыкающим углам.");
d=in.nextInt();	
} while(d<1||d>3);
switch(d){
	case(1):System.out.println("Введите длину сторон треугольника");break;
	case(2):System.out.println("Введите длину сторон треугольника и величину угла между ними");break;
	case(3):System.out.println("Введите длину стороны и величину примыкающих к ней углов");break;
}
double a3=in.nextDouble();
double b3=in.nextDouble();
double c3=in.nextDouble();
Triangle a=new Triangle(a3,b3,c3,d);
a.fuction(d);
a.print();
}
}









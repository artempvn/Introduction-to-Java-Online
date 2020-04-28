//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
//если угол между сторонами длиной X и Y— прямой
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_9 {
public static void print (double[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %.2f ",  n[i]);
		}
		System.out.println("\n");
				}
	
public static double function (double[] a,boolean b){ 
double xy=pow(pow(a[0],2)+pow(a[1],2),0.5);
double squ1=(a[0]*a[1])/2;
double p=(a[2]+a[3]+xy)/2;
double squ2=pow(p*(p-a[2])*(p-a[3])*(p-xy),0.5);
double c=0;
if (b){
	c=squ1+squ2;
} else {
	c=squ1-squ2;
}
return c;
	}	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	double[]a=new double[4];
	for(int i=0;i<4;i++){
	System.out.print("Введите длину стороны четырехугольника:  ");
	a[i]=in.nextDouble();	
	}
	System.out.print("Является ли четырехугольник выпуклым(true/false):  ");
	boolean b=in.nextBoolean(); 
System.out.printf("Площадь четырехугольника составляет %.2f \n",function(a,b));
	}
	
}
}

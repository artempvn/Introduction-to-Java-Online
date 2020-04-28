//Вычислить значения функции на отрезке [а,b] c шагом h:
// y=x,x>2  
//y=-x,x>=2
package com.artempvn.m_3_cycles;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_2 {	
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.print("Input a: ");
double a = in.nextDouble();
System.out.print("Input b: ");
double b = in.nextDouble();
System.out.print("Input h: ");
double h = in.nextDouble();	
System.out.println();
for (double x=a; x<(b+h);x+=h) {
	double y= x>2?x:-x;
	System.out.println(x+":"+y);
		if (h>abs(b-a)) {
break;
}
}
	}	
}
}

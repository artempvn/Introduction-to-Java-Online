//Вычислить значение функции: 
//F(x) = x²-3x+9, если x<=3 
//F(x) = 1/(x³ + 6), если x>3
package com.artempvn.branching;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_5 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.print("Input x: ");
double x = in.nextDouble();
System.out.println("");
double y;
if (x<=3){
y=pow(x,2)-3*x+9;	
} else {y=pow(pow(x,3)+6,-1);}
System.out.println("F("+x+")="+y);
	}	
}
}

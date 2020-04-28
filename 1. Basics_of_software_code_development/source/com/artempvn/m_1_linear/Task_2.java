//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
//z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
package com.artempvn.m_1_linear;
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
		System.out.print("Input c: ");
        double c = in.nextDouble();
		double z=((b+sqrt((pow(b,2))+4*a*c))/(2*a))-pow(a,3)*c+pow(b,-2);
        System.out.println("Your numbers: "+a+" "+b+" "+c);
    System.out.println("Your result: "+ z); 
	}
}
}

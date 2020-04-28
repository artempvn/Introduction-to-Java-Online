//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
//z = ((sin x + cos y) / (cos x - sin y)) * tg xy
package com.artempvn.m_1_linear;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_3 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
        System.out.print("Input y: ");
        double y = in.nextDouble();
		double z=((sin(x)+cos(y))/(cos(x)-sin(y)))*tan(x*y);
        System.out.println("Your numbers: "+x+" "+y);
    System.out.println("Your result: "+ z); 
	}
}
}

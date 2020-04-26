package com.artempvn.linear;
import java.util.Scanner;
public class Task_1 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
		System.out.print("Input c: ");
        double c = in.nextDouble();
		double z=((a-3)*b/2)+c;
        System.out.println("Your numbers: "+a+" "+b+" "+c);
    System.out.println("Your result: "+ z);   
	}
}
}

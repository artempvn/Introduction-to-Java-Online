//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
package com.artempvn.branching;
import java.util.Scanner;
public class Task_1 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.print("Input a: ");
        int a = in.nextInt();
System.out.print("Input b: ");
int b = in.nextInt();
String s;
        if (a+b<180&&a>0&&b>0){
			if(a+b==90||a==90||b==90) s="Треугольник является прямоугольным";
			else s="Треугольник существует";
		} else {s="Треугольник не существует";}
			
    System.out.println(s);

	}
}
}

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 
package com.artempvn.branching;
import java.util.Scanner;
public class Task_3 {
static	final float z=0.0001f;
public static void main (String [] args) {
	while (true){
float[] x=new float[3];
float[]y=new float[3];
Scanner in = new Scanner(System.in);
for (int i=0;i<3;i++) {
System.out.println("Point: "+(i+1));
System.out.print("Input x: ");
x[i] = in.nextFloat();
System.out.print("Input y: ");
y[i] = in.nextFloat();
System.out.println("");
}
float m=((y[1]-y[0])/(x[1]-x[0]));
float n=((y[2]-y[0])/(x[2]-x[0]));
String s=m-n<z?"Расположены на одной прямой":"Не расположены на одной прямой";
  System.out.println(s);
	}
}
}

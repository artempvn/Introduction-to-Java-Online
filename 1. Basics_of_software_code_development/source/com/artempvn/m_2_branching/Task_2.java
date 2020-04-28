//Найти max{min(a, b), min(c, d)}.
package com.artempvn.m_2_branching;
import java.util.Scanner;
public class Task_2 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.print("Input a: ");
int a = in.nextInt();
System.out.print("Input b: ");
int b = in.nextInt();
System.out.print("Input c: ");
int c = in.nextInt();
System.out.print("Input d: ");
int d = in.nextInt();
int min1=a<=b?a:b;
int min2=c<=d?c:d;	
int max	=min1>=min2?min1:min2;
    System.out.printf("max{min(%d,%d),min(%d,%d)}=%d \n",a,b,c,d,max);

	}
}
}

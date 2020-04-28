//Составить программу нахождения произведения квадратов первых двухсот чисел.
package com.artempvn.m_3_cycles;
import java.util.Scanner;
import java.math.*;
import static java.lang.Math.*;
public class Task_4 {
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	int a=200;
	BigDecimal sum = BigDecimal.valueOf(1);
for(int i=1;i<a+1;i++){
	BigDecimal id=BigDecimal.valueOf(pow(i,2));
	sum=sum.multiply(id);
}
	System.out.printf("Произведение квадратов первых двухсот чисел равно %e \n",sum);
	}	
}


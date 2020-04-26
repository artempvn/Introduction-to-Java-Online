//Найти сумму квадратов первых ста чисел.
package com.artempvn.cycles;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_3 {
public static void main (String [] args) {
	int sum=0;
for(int i=1;i<100+1;i++){
	sum+=pow(i,2);
}
	System.out.println("Сумма квадратов первых ста чисел равна "+sum);
	}	
}


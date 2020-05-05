//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_7 {
public static int function (int n){ 
int sum=0;
 	int fact=1;
for (int i=1;i<n+1;i+=2){
fact=i;
for (int j=1;j<i;j++){
fact*=j;	
}
sum+=fact;
}
return sum;
	}	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите число:  ");
	int n=in.nextInt();
	System.out.println("Сумма факториалов нечетных чисел до "+n+" составляет "+function(n));

	}
	
}
}

//ƒл¤ каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
//m и n ввод¤тс¤ с клавиатуры.
package com.artempvn.m_3_cycles;
import java.util.Scanner;
import java.math.*;
import static java.lang.Math.*;
public class Task_7 {
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("¬ведите m ");
	int m=in.nextInt();
	System.out.print("¬ведите n ");
	int n=in.nextInt();
	System.out.println();
	
for(int x=m;x<n+1;x++){
	System.out.printf("ƒл¤ числа %d делители: ",x);	
 for (int d=2; d<n;d++){
	 if ((x%d==0)&&(x!=d)){
	System.out.print(d+" ");	 
	 }
 }
 System.out.println();
	 
}	
	}	
	}	
}


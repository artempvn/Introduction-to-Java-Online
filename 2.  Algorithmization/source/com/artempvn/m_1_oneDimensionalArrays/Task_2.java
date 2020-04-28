//Дана последовательность действительных чисел  а1 ,а2 ,..., а(n).  Заменить все ее члены, большие данного Z, этим 
//числом. Подсчитать количество замен.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_2 {
static int Z;	
public static int total (double[] s){
	int sum=0;
for(int i=0;i<s.length;i++){
		if (s[i]>Z){
			s[i]=Z;
			sum++;
				}
}
		return sum;		
	}
	
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите n ");
	int n=in.nextInt();
	System.out.print("Введите Z ");
	Z=in.nextInt();
	System.out.println();
	double[]A=new double[n];
	for(int i=0;i<n;i++){
		A[i]=pow(2,i);
	}
	System.out.println(Arrays.toString(A));
		System.out.println("Число замен "+total(A));
		System.out.println(Arrays.toString(A));
	}
	
}
}
//Составить программу, которая в массиве  A[N] находит второе по величине число (вывести на печать число, 
//которое меньше максимального элемента массива, но больше всех других элементов).
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_5 {

public static void print (int[] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" %d ", a[i]);
		}
		System.out.println("\n");
				}			
		
	public static int[] massiveCreate (int n){ 
	int[]a=new int[n];
			for (int i=0; i<n;i++){
				
			a[i]=(int)(random()*20);
					}
		return a;
	}
	
public static int function (int[]a){ 
int max=0;
int maxprev=0;
for (int i=0; i<a.length;i++){
	if (max<a[i]){
		maxprev=max;
		max=a[i];
	}
	if (maxprev<a[i]&&a[i]!=max){
		maxprev=a[i];
	}
}
	return maxprev;
}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество элементов:  ");
	int n=in.nextInt();
	int[]a=massiveCreate(n);
print(a);
System.out.println("Второе по величине число в массиве "+function(a));
	}
	
}
}

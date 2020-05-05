//Даны две последовательности a(1)<=a(2)<=...<=a(n) и b(1)<=b(2)<=...<=b(m).
//Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
//Примечание. Дополнительный массив не использовать.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_2 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
			
public static int[] massiveCreate (int n){ 
	int[]a=new int[n];
			for (int i=0; i<n;i++){
			a[i]=(int)(random()*10);
					}
					Arrays.sort(a);
			return a;
	}
	public static int[] function (int[] a, int[] b){
		int[] x=new int [a.length+b.length];
		for(int i=0,l=0,m=0;i<x.length;i++){
		if (l==a.length&&m!=b.length){
		x[i]=b[m];
		m++;	
		} else if (m==b.length&&l!=a.length){
		x[i]=a[l];
		l++;	
		}	else if(a[l]<=b[m]) {
			x[i]=a[l];
			l++;
		} else {
		x[i]=b[m];
		m++;	
		}
		
		}
		return x;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество элементов:  ");
	int n=in.nextInt();
	int[]a=massiveCreate(n);
	System.out.print("Введите количество элементов:  ");
	int m=in.nextInt();
	int[]b=massiveCreate(m);
	print(a);
	print(b);
	print(function(a,b));
	System.out.println("-----------");
	
	}
		
}
}

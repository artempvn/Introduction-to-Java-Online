// Сортировка выбором. Дана последовательность чисел a(1)<=a(2)<=...<=a(n). Требуется переставить элементы так, 
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший 
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура 
//повторяется. Написать алгоритм сортировки выбором.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_3 {
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
	public static int[] function (int[] a, int m){
		int x=0;
		int l=m;
			for (int i=l;i<a.length;i++){
			boolean max=true;
			for (int j=l;j<a.length;j++){
				if (a[i]<a[j]){
					max=false;
					}
				}
				if (max) {
				x=a[i];
				a[i]=a[l];
				a[l]=x;
				}
			}
			return a;
	}
public static boolean check (int[] a){
	boolean x=false;
		for (int i=0;i<a.length-1;i++){
			if (a[i]<a[i+1]){
				x=true;
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
	print(a);
	int m=0;
	while(check(a)){
	function(a,m);
	m++;
	} 
	print(a);
	
	}
		
}
}

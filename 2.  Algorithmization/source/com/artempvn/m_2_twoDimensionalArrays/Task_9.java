//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой 
//столбец содержит максимальную сумму.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_9 {
public static void print (int[][] n){
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.print(n[i][j]+" ");
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (int n,int m){ 
	int [][]a=new int[n][m];
		for (int i=0; i<n;i++){
		for (int j=0;j<m;j++){
			a[i][j]=(int)(random()*10);
					}
	}
		return a;
	}
public static void function(int[][] n){
	int[] x=new int[n[0].length];
	for (int j=0; j<n[0].length;j++){
	for (int i=0;i<n.length;i++){
	x[j]+=n[i][j];
					}
	}
	int max=Integer.MIN_VALUE;
	for (int i=0;i<x.length;i++){
		if(max<x[i]) max=x[i];
	}
	System.out.print("Столбец, содержащий максимальную сумму: ");
	for(int i=0;i<x.length;i++){
		if (x[i]==max){
			System.out.print(i+" ");
		}
	}
	System.out.println("\n");
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите количество строк  ");
	int n=in.nextInt();
	System.out.print("Введите количество столбцов  ");
	int m=in.nextInt();
	int[][]a=massiveCreate2(n,m);
	print(a);
	System.out.println("-----------");
	function(a);
	System.out.println("-----------");
}	
}
}

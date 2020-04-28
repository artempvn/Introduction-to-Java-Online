//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_1 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.print(n[i][j]+" ");
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (int n, int m){ 
	int [][]a=new int[n][m];
	for(int i=0;i<n;i++){
		for (int j=0;j<m;j++){
		a[i][j]=(int)(random()*10);
		}
	}
	return a;
	}
public static void function(int[][] n){
	for(int i=0;i<n.length;i++){
	for (int j=0;j<n[0].length;j+=2){
		if(n[0][j]>n[n.length-1][j]){
				System.out.print(n[i][j]+" ");		
		}
	}
	System.out.println("\n");
	}
	}

public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите количество строк ");
	int n=in.nextInt();
	System.out.print("Введите количество столбцов ");
	int m=in.nextInt();
	System.out.println();
	int [][]a=massiveCreate2(n,m);
	print(a);
	System.out.println("-----------");
	function(a);
}	
}
}

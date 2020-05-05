//Найти положительные элементы главной диагонали квадратной матрицы.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_10 {
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
			a[i][j]=(int)(pow(-1,(int)(random()*10)))*((int)(random()*10));
					}
	}
		return a;
	}
public static void function(int[][] n){
	System.out.print("Положительные элементы главной диагонали: ");
	for (int i=0;i<n.length;i++){
		if (n[i][i]>0){
			System.out.print(n[i][i]+" ");
		}
	}
	System.out.println("\n");
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите порядок матрицы  ");
	int n=in.nextInt();
	int[][]a=massiveCreate2(n,n);
	print(a);
	System.out.println("-----------");
	function(a);
	System.out.println("-----------");
}	
}
}

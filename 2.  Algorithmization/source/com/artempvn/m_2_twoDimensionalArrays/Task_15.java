//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_15 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.printf(" %2d ",  n[i][j]);
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (int n,int m){ 
	int [][]a=new int[n][m];
		for (int i=0; i<n;i++){
		for (int j=0;j<m;j++){
			a[i][j]=((int)(random()*10));
					}
	}
		return a;
	}
		
public static int function(int[][] n){
	int max=Integer.MIN_VALUE;
	for (int i=0; i<n.length;i++){
	for (int j=0; j<n[i].length;j++){
		if(max<n[i][j]) max=n[i][j];
	}
	}
	return max;
	}
	
public static int[][] function1(int[][] n){ 
	for (int i=0; i<n.length;i+=2){
		for (int j=0;j<n[0].length;j+=2){
			n[i][j]=(function(n));
					}
	}
	return n;
	}	
	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество строк  ");
	int n=in.nextInt();
	System.out.print("Введите количество столбцов  ");
	int m=in.nextInt();
	int[][]a=massiveCreate2(n,m);
	print(a);
	System.out.println("-----------");
print(function1(a));
	}
}
}

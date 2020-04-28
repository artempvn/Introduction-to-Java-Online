// ќтсортировать строки матрицы по возрастанию и убыванию значений элементов.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_12 {
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
public static int[][] function(int[][] n){
	int[][]a=new int[n.length][];
	int max=0;
	for (int i=0; i<n.length;i++){
		a[i]=new int[n[i].length];
		for(int j=0; j<n[i].length;j++){
			a[i][j]=n[i][j];
		}
	}
for (int i=0; i<a.length;i++){
		for(int j=0; j<a[i].length-1;j++){
			if(a[i][j]>a[i][j+1]){
			max=a[i][j];
			a[i][j]=a[i][j+1];
			a[i][j+1]=max;
			if (j!=0) j-=2;
		}
	}	
}
	return a;
	}
	
public static int[][] function1(int[][] n){
int[][]a=new int[n.length][];
	int min=0;
	for (int i=0; i<n.length;i++){
		a[i]=new int[n[i].length];
		for(int j=0; j<n[i].length;j++){
			a[i][j]=n[i][j];
		}
	}
for (int i=0; i<a.length;i++){
		for(int j=0; j<a[i].length-1;j++){
			if(a[i][j]<a[i][j+1]){
			min=a[i][j];
			a[i][j]=a[i][j+1];
			a[i][j+1]=min;
			if (j!=0) j-=2;
		}
	}	
}
	return a;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("¬ведите количество строк  ");
	int n=in.nextInt();
	System.out.print("¬ведите количество столбцов  ");
	int m=in.nextInt();
	int[][]a=massiveCreate2(n,m);
	print(a);
	System.out.println("-----------");
	print(function(a));
	System.out.println("-----------");
	function1(a);
	print(function1(a));
	System.out.println("-----------");

	}
}
}

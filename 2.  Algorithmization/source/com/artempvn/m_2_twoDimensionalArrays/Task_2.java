//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_2 {
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
	for(int i=0, j=0;i<n.length;i++, j++){
		System.out.print(n[i][j]+" ");	
		}
		System.out.println();
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите количество строк и столбцов ");
	int n=in.nextInt();
	System.out.println();
	int [][]a=massiveCreate2(n,n);
	print(a);
	System.out.println("-----------");
	function(a);

}	
}
}

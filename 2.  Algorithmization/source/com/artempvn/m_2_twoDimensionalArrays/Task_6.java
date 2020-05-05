/*—формировать квадратную матрицу пор¤дка n по заданному образцу(n - четное):
 *               1 1 1 .... 1 1 1
 *               0 1 1 .... 1 1 0
 *               0 0 1 .... 1 0 0
 *               ................
 *               0 0 1 .... 1 0 0
 *               0 1 1 .... 1 1 0
 *               1 1 1 .... 1 1 1
 */
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_6 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.print(n[i][j]+" ");
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (int n){ 
	int [][]a=new int[n][n];
	int m=a.length;
	int l=0;
	for (int i=0; i<a.length;i++){
		for (int j=l;j<m;j++){
			a[i][j]=1;
		}
		if (i==a.length/2-1){} else {
		if (i>=a.length/2){
			l--;
			m++;
		} else {
		l++;
		m--;	
		}
		}
			}
	
	return a;
	}

public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("¬ведите пор¤док матрицы  ");
	int n=in.nextInt();
	int[][]a=massiveCreate2(n);
	print(a);
	System.out.println("-----------");
}	
}
}

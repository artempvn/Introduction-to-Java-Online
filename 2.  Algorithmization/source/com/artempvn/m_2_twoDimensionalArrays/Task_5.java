/*—формировать квадратную матрицу пор¤дка n по заданному образцу(n - четное):
 *             1 1 1 ...1 1 1
 *             2 2 2 ...2 2 0
 *             3 3 3 ...3 0 0
 *             ..............
 *             n 0 0 ...... 0
 */
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_5 {
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
	for (int i=0; i<a.length;i++){
		for (int j=0;j<m;j++){
			a[i][j]=i+1;
		}
		m--;
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

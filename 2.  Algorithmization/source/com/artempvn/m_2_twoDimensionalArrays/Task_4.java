/*—формировать квадратную матрицу пор¤дка n по заданному образцу(n - четное):
 *            1  2   3   .... n
 *            n  n-1 n-2 .... 1
 *            1  2   3   .... n
 *            n  n-1 n-2 .... 1
 *            .................
 *            n  n-1 n-2 .... 1
 */
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_4 {
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
	for(int i=0;i<n;i+=2){
		for (int j=0;j<n;j++){
		a[i][j]=j+1;
		}
	}
	for(int i=1;i<n;i+=2){
		for (int j=0;j<n;j++){
		a[i][j]=n-j;
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

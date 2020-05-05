//ћатрицу 10x20 заполнить случайными числами от 0 до 15. ¬ывести на экран саму матрицу и номера строк, в 
//которых число 5 встречаетс¤ три и более раз.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_11 {
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
			a[i][j]=((int)(random()*16));
					}
	}
		return a;
	}
public static void function(int[][] n){
	System.out.print("Ќомера строк, в которых число 5 встречаетс¤ 3 и более раза: ");
	for (int i=0; i<n.length;i++){
		int count=0;
		for (int j=0;j<n[0].length;j++){
			if (n[i][j]==5){
				count++;
			}
		}
		if (count>=3) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	}
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	int[][]a=massiveCreate2(10,20);
	print(a);
	System.out.println("-----------");
	function(a);
	System.out.println("-----------");
	in.next();
	}
}
}

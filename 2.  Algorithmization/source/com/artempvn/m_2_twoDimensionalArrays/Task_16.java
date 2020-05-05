/*Магическим квадратом порядка  n называется квадратная матрица размера nxn, 
*составленная из чисел 1, 2, 3, n^2 так, что суммы по каждому столбцу, 
*каждой строке и каждой из двух больших диагоналей равны между 
*собой. Построить такой квадрат.*/
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_16 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.printf(" %2d ",  n[i][j]);
		}
		System.out.println("\n");
	}
			}
public static boolean function (int[][] n){	
boolean magic=true;	
int x=(int)(n.length*(pow(n.length,2)+1)/2);
int [] sumcol=new int [n.length];
				for (int j=0; j<n.length;j++){
				for (int i=0; i<n.length;i++){
					sumcol[j]+=n[i][j];
				}
				
				}
				for (int i=0;i<sumcol.length;i++) {
							if (x!=sumcol[i]){
							return false;
							
							}
						}	
int [] sumrow=new int [n.length];
				for (int i=0; i<n.length;i++){
				for (int j=0; j<n.length;j++){
					sumrow[i]+=n[i][j];
				}
								}
							for (int i=0;i<n.length;i++) {
							if (x!=sumrow[i]){
							return false;		
							}
						}
				int sumdiag1=0;
				for (int i=0; i<n.length;i++){
				
					sumdiag1+=n[i][i];
				}
				
				if (x!=sumdiag1){
							return false;
							
							}
							
int sumdiag2=0;
				for (int i=0,j=n.length-1; i<n.length;i++,j--){
				
					sumdiag2+=n[i][j];
				}
				
				if (x!=sumdiag2){
							return false;
							
							}
			
		return magic;
}	
					
public static int[][] massiveCreate2 (int n){
	int [][]a=new int[n][n];
	int max=(int)pow(n,2);
		for (int i=0; i<max;){
			int xi=(int)(random()*a.length);
			int xj=(int)(random()*a[0].length);
			if (a[xi][xj]==0){
			
				a[xi][xj]=i+1;
				i++;
					}
					}

		return a;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите порядок матрицы:  ");
	int n=in.nextInt();
	int[][]a;
	 do{
	a=massiveCreate2(n);
	} while(function(a)==false);
		print(a);
	}
}
}

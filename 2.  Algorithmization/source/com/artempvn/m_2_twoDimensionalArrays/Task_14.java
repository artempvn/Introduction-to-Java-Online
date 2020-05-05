// —формировать случайную матрицу m  x  n, состо¤щую из нулей и единиц, причем в каждом столбце число 
//единиц равно номеру столбца.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_14 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.printf(" %2d ",  n[i][j]);
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (){
	int m=(int)(random()*5+1);
	int n=(int)(random()*3+m);
	int [][]a=new int[n][m];
		return a;
	}	
public static int[][] function(int[][] n){
	for (int j=0;j<n[0].length;j++){
					int count=j;
			if(count>n.length){count=n.length;}
			while (count>0){
				int x=(int)(random()*n.length);
				if (n[x][j]!=1){
				n[x][j]=1;
				count--;
			}
					}
		}
	return n;
	}
public static void main (String [] args) {
	int[][]a=massiveCreate2();
	print(function(a));	
}
}

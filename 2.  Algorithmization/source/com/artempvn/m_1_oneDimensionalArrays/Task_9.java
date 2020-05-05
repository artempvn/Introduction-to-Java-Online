//¬ массиве целых чисел с количеством элементов  n  найти наиболее часто встречающеес¤ число. ≈сли таких 
//чисел несколько, то определить наименьшее из них.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_9 {
public static int[] massiveCreate (int n){
	int []a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=(int)(random()*10);
	}
	return a;
	}
public static int function(int[] n){
	int[]m=new int[n.length];
	for (int i=0;i<n.length;i++){
		for (int j=0;j<n.length;j++){
			if (n[i]==n[j]&&i!=j){
				m[i]++;
				m[j]=0;
				}
		}
			}		
		int max=0;	
outterLoop: for (int i=n.length;i>-1;i--){
	for (int j=0;j<m.length;j++){
	if (i==m[j]){
	max=m[j];
break outterLoop;	
	}
}
}
int count=0;
for (int i=0,j=0;i<m.length;i++){
if(m[i]==max)	count++;
}

int[] maximum=new int[count];
for (int i=0,j=0;i<n.length;i++){
	if (m[i]==max){
	maximum[j]=n[i];
j++;	
	}
}
int minValue=Integer.MAX_VALUE;
for (int i=0;i<maximum.length;i++){
if(minValue>=maximum[i]) minValue=maximum[i];
}		
	return minValue;		
}	
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("¬ведите N ");
	int N=in.nextInt();
	System.out.println();
	int []A=massiveCreate(N);
	System.out.println(Arrays.toString(A));
	System.out.println(function(A));
}	
}
}

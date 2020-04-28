// Дана  последовательность  целых  чисел  а(1) ,а(2) ,..., а(n). 
//Образовать  новую  последовательность,  выбросив  из исходной те члены, которые равны min(а(1) ,а(2) ,..., а(n))
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_8 {
public static int[] massiveCreate (int n){
	int []a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=(int)(random()*10);
	}
	return a;
	}
public static int[] function(int[] n){	
int min=Integer.MAX_VALUE;
for (int i=0;i<n.length;i++){
if(min>=n[i]) min=n[i];
}	
		int count=0;
		for (int i=0;i<n.length;i++){
			if (n[i]==min){
				count++;
			}
			}
			int[] l=new int[n.length-count];
		for (int i=0,j=0;i<n.length;i++){
			if (n[i]!=min){
				l[j]=n[i];
				j++;
			}
			}	
		return l;
			}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	int []A=massiveCreate(N);
	System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(function(A)));
}	
}
}

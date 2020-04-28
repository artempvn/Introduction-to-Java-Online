//Даны целые числа а1 ,а2 ,..., а(n) . Вывести на печать только те числа, для которых аi > i.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_5 {
public static int[] massiveCreate (int n){
	int[]a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=(int)(random()*10);
	}
	return a;
	}
public static void invert(int[] n){
		for (int i=0;i<n.length;i++){
		if (n[i]>i ){
			 System.out.print(n[i]+" ");
			}
			}
				 System.out.println();
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	int []A=massiveCreate(N);
	System.out.println(Arrays.toString(A));
	invert(A);
}	
}
}

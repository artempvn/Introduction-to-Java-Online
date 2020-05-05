//Задана  последовательность  N  вещественных  чисел.  Вычислить  сумму  чисел,  порядковые  номера  которых 
//являются простыми числами.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_6 {

public static double[] massiveCreate (int n){
	double[]a=new double[n];
	for(int i=0;i<n;i++){
		a[i]=random()*10;
	}
	return a;
	}
public static int[] simple(int n){
	int x=0;
	boolean[] b=new boolean[n];
		for (int i=0;i<n;i++){
		if (i<2){
			b[i]=false;
		} else {b[i]=true;}
			for (int j=2; j<i;j++){
			if ((i%j==0&&i!=j) ){
			 b[i]=false;
			}
			}
		}	
	for (int i=0;i<n;i++){
			if (b[i]==true ){
			 x++;
			}
		}
		int[] a=new int[x];	
		for (int i=0,j=0;i<n;i++){
			if (b[i]==true ){
			 a[j]=i;
			 j++;
			}
		}
	return a;
}
public static double findSum(double[] n,int[]m){
	double sum=0;
		for (int i=0;i<m.length;i++){
		sum+=n[m[i]];
		}
			return sum;
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	double []A=massiveCreate(N);
	System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(simple(N)));
	System.out.println(findSum((A),simple(N)));
}	
}
}

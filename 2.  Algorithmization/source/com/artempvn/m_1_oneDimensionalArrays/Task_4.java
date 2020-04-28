//Даны действительные числа а1 ,а2 ,..., а(n) . Поменять местами наибольший и наименьший элементы.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_4 {

public static double[] massiveCreate (int n){
	double[]a=new double[n];
	for(int i=0;i<n;i++){
		a[i]=pow(2,i);
	}
	return a;
	}
public static double[] invert (double[] n)	{
double min=Double.MAX_VALUE;
int indMin=0;
double max=Double.MIN_VALUE;
int  indMax=0;
for (int i=0;i<n.length;i++){
if(min>=n[i]) {
	min=n[i];
	indMin=i;
}
if(max<=n[i]) {
	max=n[i];
	indMax=i;
}
}
n[indMax]=min;
n[indMin]=max;
return n;
}

public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	double []A=massiveCreate(N);
	System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(invert(A)));
}	
}
}

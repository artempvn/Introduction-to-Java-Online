//Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных, 
//положительных и нулевых элементов.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_3 {
public static String total (double[] s){
	int totalpos=0;
	int totalneg=0;
	int totalzero=0;
for(int i=0;i<s.length;i++){
		if (s[i]>0){
		totalpos++;
				}
				if (s[i]<0){
		totalneg++;
				}
				if (s[i]==0){
		totalzero++;
				}
}String a="Число отрицательных элементов: "+totalneg+"; положительных: "+totalpos+"; нулевых: "+totalzero;
		return a;	
	}	
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	double[]A=new double[N];
	for(int i=0;i<N;i++){
		A[i]=(pow(-1,(int)(random()*10)))*(random()*100);
	}
	System.out.println(Arrays.toString(A));
System.out.println(total(A));
	}
}
}
//Даны действительные числа а(1) ,а(2) ,..., а(n). 
//Найти max(a(1)+a(2n),a(2)+a(2n-1),...,a(n)+a(n+1))
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_7 {

public static double[] massiveCreate (int n){
	double[]a=new double[n];
	for(int i=0;i<n;i++){
		a[i]=(random()*10);
	}
	return a;
	}
	
public static double function(double[] n){
	double []m=new double[n.length/2];
			for (int i=0, j=n.length-1;i<m.length;i++,j--){
		m[i]=n[i]+n[j];
		}
	System.out.println(Arrays.toString(m));
double max=Double.MIN_VALUE;
for (int i=0;i<m.length;i++){
if(max<=n[i]) max=n[i];
}
return max;
}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	double []A=massiveCreate(N*2);
	System.out.println(Arrays.toString(A));
	System.out.println("Max= "+function(A));

}	
}
}

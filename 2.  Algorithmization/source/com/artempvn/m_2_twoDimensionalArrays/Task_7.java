/*������������ ���������� ������� ������� N �� �������: 
* A[I,J] = sin((I^2 - J^2) / N)
� ���������� ���������� ������������� ��������� � ���.*/
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_7 {
public static void print (double[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.printf("%.3f ",n[i][j]);
		}
		System.out.println("\n");
	}
			}
public static double[][] massiveCreate2 (int n){ 
	double [][]a=new double[n][n];
	int count=0;
	for (int i=0; i<n;i++){
		for (int j=0;j<n;j++){
			a[i][j]=sin((pow(i,2)-pow(j,2))/n);
			if (a[i][j]>0) {count++;}
		}
	}
	System.out.println("���������� ������������� ���������: "+count+"\n");
	return a;
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("������� ������� �������  ");
	int n=in.nextInt();
	double[][]a=massiveCreate2(n);
	print(a);
	System.out.println("-----------");
}	
}
}

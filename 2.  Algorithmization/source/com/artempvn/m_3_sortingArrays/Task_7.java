//�����  ����  ���  �����������  ������������������  ��������������  ����� 
//a(1)<=a(2)<=...<=a(n) � b(1)<=b(2)<=...<=b(m).��������� ������� �� �����, 
//�� ������� ����� ��������� �������� ������������������ b(1)<=b(2)<=...<=b(m)
//� ������  ������������������ ���, ����� ����� ������������������ ���������� ������������.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_7 {
public static void print (double[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2.2f ",  n[i]);
		}
		System.out.println("\n");
				}
			
public static double[] massiveCreate (int n){ 
	double[]a=new double[n];
			for (int i=0; i<n;i++){
			a[i]=(random()*10);
					}
					Arrays.sort(a);
		return a;
	}
	
public static double[] function (double[] a, double[] b){ 
double []x=new double[b.length];
for (int j=0;j<b.length;j++){
	for (int i=0;i<a.length;i++){
	if (b[j]<a[i]){
	x[j]=i-0.5;	
	break;
	} else {
		if (i==a.length-1){
			x[j]=i+0.5;
		}
	}	 
		
	
}
}
return x;
	}
	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ���������� ���������:  ");
	int n=in.nextInt();
	System.out.print("������� ���������� ���������:  ");
	int m=in.nextInt();
	double[]a=massiveCreate(n);
	double[]b=massiveCreate(m);
	print(a);
	print(b);
	System.out.println("�������� ������� ������� ���������� ����������� �� ��������� ������: ");
	print(function(a,b));
	
	}
}
}

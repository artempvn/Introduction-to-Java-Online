//������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� � 
//����  ������,  �������  ������  ������  �����  k-�  �  (k+1)  -  �  ����������  �������,  ���  ����  ��  ��������� 
//�������������� ������.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_1 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
			
public static int[] massiveCreate (int n){ 
	int[]a=new int[n];
			for (int i=0; i<n;i++){
			a[i]=(int)(random()*10);
					}
			return a;
	}
	public static int[] function (int[] a, int[] b, int k){
		int[] x=new int [a.length+b.length];
		System.arraycopy(a,0,x,0,k+1);
		System.arraycopy(b,0,x,k+1,b.length);
		System.arraycopy(a,k+1,x,k+1+b.length,a.length-(k+1));
		return x;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ���������� ���������:  ");
	int n=in.nextInt();
	int[]a=massiveCreate(n);
	System.out.print("������� ���������� ���������:  ");
	int m=in.nextInt();
	int[]b=massiveCreate(m);
	print(a);
	print(b);
	System.out.print("������� ������ ��������:  ");
	int k=in.nextInt();
	print(function(a,b,k));
	System.out.println("-----------");
	}
}
}

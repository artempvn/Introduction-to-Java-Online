//����������  ��������.  ����  ������������������  ����� a(1),a(2),...,a(n). ���������  �����������  �����  � 
//�������  �����������.  ���  �����  ������������  ���  ��������  ����� a(i) � a(i+1). ���� a(i)>a(i+1), ��  �������� 
//������������. ��� ������������ �� ��� ���, ���� ��� �������� �� ������ ����������� � ������� �����������. 
//��������� �������� ����������, ����������� ��� ���� ���������� ������������.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_4 {
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
public static int[] function (int[] a){
		int x=0;
		
			for (int i=0;i<a.length-1;i++){
			if (a[i]>a[i+1]){
				x=a[i];
				a[i]=a[i+1];
				a[i+1]=x;
				return a;
			}
			}
			return a;
	}
public static boolean check (int[] a){
	boolean x=false;
		for (int i=0;i<a.length-1;i++){
			if (a[i]>a[i+1]){
				x=true;
			}
		}
			return x;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ���������� ���������:  ");
	int n=in.nextInt();
	int[]a=massiveCreate(n);
	print(a);
	int count=0;
	while(check(a)){
	function(a);
	count++;
	} 
	print(a);
	System.out.println("���������� ������������: "+count);
	
	}	
}
}

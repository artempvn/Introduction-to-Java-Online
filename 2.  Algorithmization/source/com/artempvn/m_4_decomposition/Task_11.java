//�������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_11 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
	
public static int function (int a){ 
int n=1;
int m=10;
 while(a/m!=0){
	 n++;
	 m*=10;
 }
return n;
	}
	public static String function1 (int a, int b){ 
int a1=function(a);
int b1=function(b);
String c="";
if(a1>b1){
	c="������, ��� ";
} else {
	if (a1<b1){
		c="������, ��� ";
	} else {
	c="����� ���������� ���� ";	
	}
}
return c;
	}
		
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	System.out.print("������� ������ �����:  ");
	int a=in.nextInt();	
	System.out.print("������� ������ �����:  ");
	int b=in.nextInt();
	System.out.printf("� ����� %d ���������� ���� %s � ����� %d \n", a,function1(a,b),b);
	
	}	
}
}

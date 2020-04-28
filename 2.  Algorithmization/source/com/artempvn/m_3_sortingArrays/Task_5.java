//���������� ���������. ���� ������������������ ����� a(1), a(2),...,a(n). ��������� ����������� ����� � ������� 
//�����������.  ��������  ���  ���������  �������.  ����� a(1), a(2),...,a(i)-  �������������  ������������������,
// �.�. a(1)<=a(2)<=...<=a(i). �������  ���������  ����� a(i+1) �  �����������  �  ������������������  ���,  �����  
//����� ������������������ ���� ���� ������������. ������� ������������ �� ��� ���, ���� ��� �������� ��  i+1 �� n
//�� ����� ���������. ����������. ����� ��������� ���������� �������� � ��������������� ����� ����������� 
//� ������� ��������� ������. �������� ����� �������� � ���� ��������� �������.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_5 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
			
public static int[] massiveCreate (int n,int m){ 
	int[]a=new int[n];
	int[]b=new int[m+1];
			for (int i=0; i<m+1;i++){
			b[i]=(int)(random()*10);
					}
				Arrays.sort(b);
			System.arraycopy(b,0,a,0,b.length);
			for (int i=b.length; i<a.length;i++){
			a[i]=(int)(random()*10);
					}
		return a;
	}
	public static int function (int[] a,int m){ //�������� �����
		int first=0;
		int last=m;
		int i2=0;
		if (a[m+1]<=a[first]){
		i2=0;
		} else if (a[m+1]>=a[last]) {
		i2=m+1;	
		} else {
		while ((last-first)/2>0){
		i2=(last-first)/2+first;
		if (a[m+1]<a[i2]){
				last=i2;
			} else {
				first=i2;
					}
					}
		if ((last-first)/2==0){
			i2=a[m+1]<a[i2]?i2:i2+1;
		}
		}
			return i2;
	}
public static int[] function1 (int[] a,int m, int n){ 
int x=a[m+1];
for (int i=m;i>n-1;i--){
	a[i+1]=a[i];
	}
	a[n]=x; 
return a;
	}
	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ���������� ���������:  ");
	int n=in.nextInt();
	System.out.print("������� ����� ��������:  ");
	int m=in.nextInt();
	int[]a=massiveCreate(n,m);
	print(a);
	while (m<n-1){
	function1(a,m,function(a,m));
	m++;
	}
	print(a);
	}
}
}

// ����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//���������. ���������  �����(������)  ��� ���������� ����� ���� ��������������� ������������� ��������� 
//������� � �������� �� k �� m.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_8 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
	
	public static int[] massiveCreate (int n){ 
	int[]a=new int[n];
	for(int i=0;i<a.length;i++){
        a[i]=(int)(random()*10);
		
    }
		return a;
	}
	
public static int[] function (int[] a,int k,int m){ 
int[] b=new int[m-k-1];
for(int i=0;i<b.length;i++){
	for(int j=k;j<k+3;j++){
	b[i]+=a[j];
}
k++;
}
	System.out.println("C���� ���� ���������������� ��������� ����� ����������:  ");
print(b);

return b;
	}
		
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ���������� ��������� �������:  ");
	int n=in.nextInt();
		int[]a=massiveCreate(n);
			print(a);
System.out.print("������� k:  ");
	int k=in.nextInt();
	System.out.print("������� m:  ");
	int m=in.nextInt();

function(a,k,m);
	}
}
}

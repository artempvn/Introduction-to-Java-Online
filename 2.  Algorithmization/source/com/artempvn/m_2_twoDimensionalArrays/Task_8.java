//� �������� ������� �������� ������� ��� �������  ����� �������, �. �. ��� �������� ������ ������� ��������� 
//�� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. ������ �������� ������ 
//������������ � ����������.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_8 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.print(n[i][j]+" ");
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (int n,int m){ 
	int [][]a=new int[n][m];
		for (int i=0; i<n;i++){
		for (int j=0;j<m;j++){
			a[i][j]=(int)(random()*20);
					}
	}
		return a;
	}
public static void function(int[][] n,int x, int y){
	int[] x1=new int[n.length];
	for (int i=0,j=x; i<n.length;i++){
	x1[i]=n[i][j];
					}
	for (int i=0; i<n.length;i++){
	n[i][x]=n[i][y];
					}
	for (int i=0; i<n.length;i++){
	n[i][y]=x1[i];
					}
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("������� ���������� �����  ");
	int n=in.nextInt();
	System.out.print("������� ���������� ��������  ");
	int m=in.nextInt();
	int[][]a=massiveCreate2(n,m);
	print(a);
	System.out.println("-----------");
	System.out.print("������� ����� ������� �������  ");
	int k=in.nextInt();
	System.out.print("������� ����� ������� �������  ");
	int l=in.nextInt();
	System.out.println("-----------");
	function(a,k,l);
	print(a);
	System.out.println("-----------");
}	
}
}

//���� �������. ������� k-� ������ � p-� ������� �������.
package com.artempvn.m_2_twoDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_3 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		for (int j=0;j<n[0].length;j++){
		System.out.print(n[i][j]+" ");
		}
		System.out.println("\n");
	}
			}
public static int[][] massiveCreate2 (int n, int m){ 
	int [][]a=new int[n][m];
	for(int i=0;i<n;i++){
		for (int j=0;j<m;j++){
		a[i][j]=(int)(random()*10);
		}
	}
	return a;
	}
public static void function(String s, int[][] n, int x){
	if (s=="row"){
		for (int j=0;j<n[0].length;j++){
		System.out.print(n[x][j]+" ");
		}
		System.out.println("\n");
	}
	if (s=="column"){
		for (int i=0;i<n.length;i++){
		System.out.print(n[i][x]+"\n");
		}
		System.out.println("\n");
	}	
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("������� ���������� ����� ");
	int n=in.nextInt();
	System.out.print("������� ���������� �������� ");
	int m=in.nextInt();
	System.out.println();
	int [][]a=massiveCreate2(n,m);
	print(a);
	System.out.print("������� ����� ������ ");
	int k=in.nextInt();
	function("row",a,k);
	System.out.print("������� ����� ������� ");
	int p=in.nextInt();
	function("column",a,k);
	System.out.println();
	System.out.println("-----------");

}	
}
}

//Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого 
//являются цифры числа N.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_10 {
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
	public static int[] function1 (int a){ 
int n=function(a);
int []b=new int[n];
int c=1;
for (int i=n,k=0;i>0;i--,k++){
	c=((int)(a/pow(10,i-1)))-((int)(a/pow(10,i))*10);
	for(int j=1;j<10;j++){
		if (c/j==1){
			b[k]=j;	
		}
	}
}
print(b);
return b;
	}
		
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	System.out.print("Введите число:  ");
	int a=in.nextInt();	
	function1(a);
	}
}
}

//Из заданного числа вычли сумму его  цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_17 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
	
public static int function0(int a){ 
int n=1;
int m=10;
 while(a/m!=0){
	 n++;
	 m*=10;
 }
return n;
	}	

	public static int[] function1 (int a){ 
int n=function0(a);
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
return b;
	}
			
public static int function2 (int n){ 
int[] b=function1(n);
int sum=0;
for (int i=0;i<b.length;i++){
	sum+=b[i];
		}
	return sum;
	}	

public static int function3 (int n){ 
int count =0;
int a=n;
while (a!=0){
	a-=function2(a);
	count++;
}
return count;
	}	
		
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	System.out.print("Введите число:  ");
	int n=in.nextInt();
System.out.println("Необходимое количество вычитаний сумм цифр числа: "+function3(n));

	}	
}
}

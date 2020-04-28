//Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. 
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_16 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
	
public static int[] function00 (int n){ 
int length=(int)(pow(10,n)-pow(10,n-1));
int[]a=new int[length];
for (int i=0, j=(int)(pow(10,n-1));i<length;j++,i++){
	a[i]=j;
}
return a;
	}
	public static int[] function1 (int a,int n){ 
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
	public static int[] function0 (int n){ 
int[] a=function00(n);
int[] b=new int[a.length];
int count=0;
for (int i=0,j=0;i<a.length;i++){
	if (function(function1(a[i],n))){
		count++;
		b[j]=a[i];
		j++;
	}
}
int[] c=new int[count];
System.arraycopy(b,0,c,0,count);
return c;
	}	

	public static boolean function (int[] b){ 
	for (int i=0;i<b.length;i++){
	if (b[i]%2==0){
		return false;
	}
}
return true;
	}	
	public static int function2 (int n){ 
int[] b=function0(n);
int sum=0;
for (int i=0;i<b.length;i++){
	sum+=b[i];
		}
	return sum;
	}	
	public static int function3 (int sum){ 
int a=function2(sum);
int n=1;
int m=10;
 while(a/m!=0){
	 n++;
	 m*=10;
 }
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
int count=0;
for (int i=0;i<b.length;i++){
	if(b[i]%2==0){
		count++;
	}
}
	return count;
	}			
	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	System.out.print("Введите порядок числа:  ");
	int n=in.nextInt();

System.out.println("Сумма "+n+"-значных чисел, содержащих нечетные цифры равна: "+function2(n));
System.out.println("Количество четных цифр в сумме: "+function3(n));

	}
	
}
}

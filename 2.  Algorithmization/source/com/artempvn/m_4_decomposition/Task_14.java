//Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, 
//возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи 
//использовать декомпозицию.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_14 {
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
return b;
	}
	
	public static int function0 (int a){ 
int[] b=function1(a);
int sum=0;
for (int i=0;i<b.length;i++){
	sum+=b[i];
		}

	sum=(int)pow(sum,function(a));
	return sum;
	}	
	
public static int[] function2 (int k){ 
int count=0;
int []a1=new int[k];
for(int i=k,j=0;i>0;i--){
	if (function0(i)==i){
		a1[j]=i;
		count++;
		j++;
	}
}
int []a=new int[count];
System.arraycopy(a1,0,a,0,count);

return a;
	}	
				
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
	System.out.print("Введите максимальное число:  ");
	int k=in.nextInt();
	print(function2(k));
	}
}
}

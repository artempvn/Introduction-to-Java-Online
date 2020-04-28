//Даны дроби (p(1)/q(1)), (p(2)/q(2)),...,(p(n)/q(n)) (p(i) и q(i)- натуральные). 
//Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
package com.artempvn.m_3_sortingArrays;
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
public static void optim (int[] n,int[] m){ 
	for(int i=0;i<n.length;i++){
		if (n[i]==m[i]){
			n[i]=1;
			m[i]=1;
		}
		if (n[i]%m[i]==0){
			n[i]=n[i]/m[i];
			m[i]=1;
		}
	}
}
public static void print (int[] n,int[] m){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d/%2d",  n[i],m[i]);
		}
		System.out.println("\n");
				}			

	public static int[] massiveCreate (int n){ 
	int[]a=new int[n];
			for (int i=0; i<n;i++){
			a[i]=(int)(random()*9+1);
					}
		return a;
	}
	
	public static int[] simple(int[] q){ 
		int n=0;
		for (int i=0; i<q.length;i++){
			if (n<q[i]){
				n=q[i];
			}
		}
		n++;
		int x=0;
	boolean[] b=new boolean[n];
		for (int i=0;i<n;i++){
		if (i<2){
			b[i]=false;
		} else {b[i]=true;}
			for (int j=2; j<i;j++){
			if ((i%j==0&&i!=j) ){
			 b[i]=false;
			}
			}
		}
		
	for (int i=0;i<n;i++){
			if (b[i]==true ){
			 x++;
			}
		}
		int[] a=new int[x];	
		for (int i=0,j=0;i<n;i++){
			if (b[i]==true ){
			 a[j]=i;
			 j++;
			}
		}
	return a;
}

public static int function (int[] b,int[] simple){ 
int []c=new int [b.length];
int [][] x=new int [b.length][simple.length];
for (int i=0; i<b.length;i++){
	c[i]=b[i];
	for (int j=0; j<simple.length;j++){
		if (b[i]%simple[j]==0){
				while (c[i]/simple[j]>=1&&c[i]%simple[j]==0){
				x[i][j]++;
					c[i]=c[i]/simple[j];
				} 
			
		} else {
			x[i][j]=0;
				}	
	}
	}
	int nok=1;
	for (int j=0;j<simple.length;j++){
		int max=0;
		for (int i=0;i<b.length;i++){
			if (max<x[i][j]){
				max=x[i][j];
			}
			
		}
		if(max!=0){
			max=(int)pow(simple[j],max);
		nok*=max;
		
		}
		
	}
			
return nok;
	}

		
public static void function1 (int[] a,int[] b,int nok){ 
for (int i=0; i<b.length;i++){
	a[i]*=(nok/b[i]);
	b[i]=nok;
			}		
	}	

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество дробей:  ");
	int n=in.nextInt();
	int[]a=massiveCreate(n);
	int[]b=massiveCreate(n);
	print(a,b);
	optim(a,b);
System.out.println("НОК: "+function(b,simple(b)));
function1(a,b,function(b,simple(b)));
Arrays.sort(a);
print(a,b);
	}
	
}
}

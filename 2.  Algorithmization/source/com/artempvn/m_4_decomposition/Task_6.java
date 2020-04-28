//Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно простыми.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_6 {
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ",  n[i]);
		}
		System.out.println("\n");
				}
	
	public static int[] massiveCreate (int ... args){ 
	int n=0;
	for(int x : args){
        n ++;
    }
	int i=0;
	int[]a=new int[n];
	for(int x : args){
        a[i]=x;
		i++;
    }
		return a;
	}
	
	public static int[] simpleMas(int[] q){ 
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

public static int[][] function0 (int[] a,int[] simple){ 
int []c=new int [a.length];
int [][] x=new int [a.length][simple.length];
for (int i=0; i<a.length;i++){
	c[i]=a[i];
	for (int j=0; j<simple.length;j++){
		if (a[i]%simple[j]==0){
				while (c[i]/simple[j]>=1&&c[i]%simple[j]==0){
				x[i][j]++;
					c[i]=c[i]/simple[j];
				} 
					} else {
			x[i][j]=0;
				}	
	}
	}
	return x;
}

public static int function (int[] a){ 
int []simple=simpleMas(a);
int [][]x=function0(a,simple);
	int nod=1;
	for (int j=0;j<simple.length;j++){
			int min=Integer.MAX_VALUE;
			for (int i=0;i<a.length;i++){
			if (min>x[i][j]){
				min=x[i][j];
			}
			}		
		min=(int)pow(simple[j],min);
		nod*=min;
		 
			}
return nod;
	}
		
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("¬ведите первое число:  ");
	int n=in.nextInt();
System.out.print("¬ведите второе число:  ");
	int m=in.nextInt();
	System.out.print("¬ведите третье число:  ");
	int l=in.nextInt();
	int[]a=massiveCreate(n,m,l);
	print(a);
if (function(a)!=1) {
	System.out.println("„исла не взаимно простые");
} else {
	System.out.println("„исла взаимно простые");
}
	}
	
}
}

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где  n  -  заданное натуральное число больше 2.  Для 
//решения задачи использовать декомпозицию.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_13 {
public static void print (int[][] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" (%2d и %2d) ",  n[i][0],n[i][1]);
		}
		System.out.println("\n");
				}
public static void print (int[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2d ", n[i]);
		}
		System.out.println("\n");
				}	

	
	public static int[] simpleMas(int n){ 
		int x=0;
	boolean[] b=new boolean[2*n+1];
		for (int i=n;i<2*n+1;i++){
		if (i<2){
			b[i]=false;
		} else {b[i]=true;}
			for (int j=2; j<i;j++){
			if ((i%j==0&&i!=j) ){
			 b[i]=false;
			}
			}
		}
		
	for (int i=n;i<2*n+1;i++){
			if (b[i]==true ){
			 x++;
			}
		}
		int[] a=new int[x];	
		for (int i=n,j=0;i<2*n+1;i++){
			if (b[i]==true ){
			 a[j]=i;
			 j++;
			}
		}
	return a;
}


public static int[][] function (int n){ 
int[] simple=simpleMas(n);
int count=0;
for (int i=0; i<simple.length-1;i++){
	if (simple[i+1]-simple[i]==2){
		count++;
	}
}
int[][] b=new int[count][2];
for (int i=0,j=0; i<simple.length-1;i++){
	if (simple[i+1]-simple[i]==2){
		b[j][0]=simple[i];
		b[j][1]=simple[i+1];
		j++;
	}
}
return b;
	}
		
public static void main (String [] args) {
	while (true){
		int n=0;
	Scanner in = new Scanner(System.in);
do {System.out.print("Введите n>2:  ");
n=in.nextInt();
} while(n<=2);
System.out.print("Пары чисел-близнецов на отрезке от "+n+" до "+(2*n)+": ");
print(function(n));
	}
	
}
}

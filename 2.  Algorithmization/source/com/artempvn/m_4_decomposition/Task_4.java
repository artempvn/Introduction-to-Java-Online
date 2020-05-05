//Ќа плоскости заданы своими координатами  n  точек.  Ќаписать метод(методы), определ¤ющие, между какими 
//из пар точек самое большое рассто¤ние. ”казание.  оординаты точек занести в массив.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_4 {

public static void print (int[][] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" (%d;%d) ",  a[i][0],a[i][1]);
		}
		System.out.println("\n");
				}			
public static void print (double[][] a){ 
	for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){	
		System.out.printf(" (%.2f) ",  a[i][j]);
		}
		System.out.println("\n");
				}	
}	
				
				
	public static int[][] massiveCreate (int n){ 
	int[][]a=new int[n][2];
			for (int i=0; i<n;i++){
				for (int j=0; j<2;j++){
			a[i][j]=(int)(random()*10);
					}
			}
		return a;
	}
	
public static double[][] function (int[][]a){ 
int l=a.length-1;
int m=0;
double[][] length=new double[l][];

for (int i=0; i<a.length-1;i++){
	length[i]=new double[l];
for (int j=m,h=0; j<a.length-1;j++,h++){	
	
length[i][h]=pow(pow(a[j+1][0]-a[i][0],2)+pow(a[j+1][1]-a[i][1],2),0.5);

}
	m++;
	l--;
	}
	return length;
}

public static void function1 (double[][] length, int[][] a){ 
double max=0;
int [] point=new int[2];
for (int i=0; i<length.length;i++){
for (int j=0; j<length[i].length;j++){	
	if (max<length[i][j]){
		max=length[i][j];
		point[0]=i;
		point[1]=j;
	}

}
}
point[1]+=point[0]+1;
System.out.printf("—амое большое рассто¤ние между точками (%d;%d) и (%d;%d): %.2f \n ",  a[point[0]][0],a[point[0]][1],a[point[1]][0],a[point[1]][1], max);	
}
	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("¬ведите количество точек:  ");
	int n=in.nextInt();
	int[][]a=massiveCreate(n);
print(a);
function1(function(a),a);
	}
	
}
}

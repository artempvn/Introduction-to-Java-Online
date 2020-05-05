//Сортировка  Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию. 
//Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1). Если a(i)<=a(i+1),
//то продвигаются на  один  элемент  вперед.  Если a(i)>a(i+1), то  производится  перестановка  и  сдвигаются  
//на  один  элемент  назад. Составить алгоритм этой сортировки.
package com.artempvn.m_3_sortingArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_6 {
public static void print (double[] n){ 
	for(int i=0;i<n.length;i++){
		System.out.printf(" %2.2f ",  n[i]);
		}
		System.out.println("\n");
				}
			
public static double[] massiveCreate (int n){ 
	double[]a=new double[n];
			for (int i=0; i<n;i++){
			a[i]=(random()*10);
					}
		return a;
	}
	
public static double[] function (double[] a){ 
double x=0;
for (int i=0;i<a.length-1;i++){
	if (a[i]<=a[i+1]){
		} else {
		x=a[i];
		a[i]=a[i+1];
		a[i+1]=x;
		if (i>0){
		i-=2;
		}
	}
}
return a;
	}
	
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество элементов:  ");
	int n=in.nextInt();
	double[]a=massiveCreate(n);
	print(a);
	function(a);
	print(a);
	
	}
	
}
}

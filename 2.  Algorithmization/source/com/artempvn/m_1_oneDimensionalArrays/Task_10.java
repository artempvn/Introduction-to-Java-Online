//Дан  целочисленный  массив  с  количеством  элементов  п.  Сжать  массив,  выбросив  из  него  каждый  второй 
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_10 {

public static int[] massiveCreate (int n){
	int []a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=(int)(random()*10);
	}
	return a;
	}
public static int[] function(int[] n){
	for (int i=1;i<n.length;i+=2){
		n[i]=0;
	}
return n;	
}	
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите N ");
	int N=in.nextInt();
	System.out.println();
	int []A=massiveCreate(N);
	System.out.println(Arrays.toString(A));
	function(A);
	System.out.println(Arrays.toString(A));
}	
}
}

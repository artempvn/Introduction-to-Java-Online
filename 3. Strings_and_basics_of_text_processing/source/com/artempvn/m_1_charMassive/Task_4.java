//В строке найти количество чисел.
package com.artempvn.m_1_charMassive;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_4 {
public static void print (String[] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" %s ",  a[i]);
		}
		System.out.println("\n");
				}	
public static void print (String a){ 
	System.out.println(a);
				}				
public static String massiveCreate (int n){  
	String a="";
		int prev=0;
	int rand=0;
	for (int l=0;l<n;l++){	
	prev=rand;
	rand =(int)(random()*3);
	if (prev==0) {
		rand =(int)(random()*2+1);
	}
	if (prev==1) {
		rand =0;
	}
	if (prev==2) {
		rand =0;
	}
	
	switch (rand){
		case 0: 
		a+=" ";
		break;
		case 1: 
		int r=(int)(random()*3+2);
		char[]ch=new char[r];
			for (int i=0;i<r;i++){
	ch[i]=(char)((int)(random()*26)+97);
	a+=ch[i];
}	
break;
		case 2: 
		r=(int)(random()*2+2);
		char[]ch1=new char[r];
			for (int i=0;i<r;i++){
	ch1[i]=(char)((int)(random()*10)+48);
	a+=ch1[i];
}
		break;
	}
	}
		return a;
	}
	
public static void function (String a){ 
char[] ch=a.toCharArray();
int count=0;
for (int i=1;i<ch.length;i++){
	if ((ch[i]>=48&&ch[i]<=57)&&(ch[i-1]<48||ch[i-1]>57)){  
		count++;
	}
}
	if ((ch[0]>=48&&ch[0]<=57)){
	count++;
}
System.out.println("Количество чисел в строке: "+count);
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество элементов строки:  ");
	int n=in.nextInt();
	String a=massiveCreate(n);
print(a);
function(a);
	}	
}
}

﻿// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых 
//длинных слов может быть несколько, не обрабатывать.
package com.artempvn.m_2_String;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_8 {

public static void print (String[] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" %s ",  a[i]);
		}
		System.out.println("\n");
				}	
public static void print (String a){ 
	System.out.println(a);
				}	
public static void print (int a){ 
	System.out.println(a);
				}					
public static String massiveCreate (int n){ 
	String a="";
int rand=0;
	for (int l=0;l<n;l++){	
	rand =(int)(random()*3);
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
	
public static int function (String a){ 
char ch=' ';
int n=0;
int count=0;
int max=0;
int premax=0;
int ind=0;
int nprev=-1;
if (a.indexOf(ch,n)==-1) {ind=0;max=a.length();}
while (a.indexOf(ch,n)!=-1){
count=a.indexOf(ch,n)-nprev-1;
if (max<count){premax=max;max=count;ind=n;} else if (premax<count){premax=count;}
count=0;
nprev=a.indexOf(ch,n);
n=a.indexOf(ch,n)+1;
if(a.indexOf(ch,n)==-1){
	count=a.length()-nprev-1;
	if (max<count){premax=max; max=count;ind=n;} else if (premax<count){premax=count;}
	}
	}
	if (max!=premax){
	print(a.substring(ind,ind+max));		
	} else {print("В строке несколько самых длинных слов");} 
return max;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество элементов строки:  ");
	int n=in.nextInt();
	String a=massiveCreate(n);
	
print(a);
System.out.println("Самое длинное слово:  ");
function(a);
	}	
}
}

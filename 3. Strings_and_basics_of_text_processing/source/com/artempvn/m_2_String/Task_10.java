//—трока X состоит из нескольких предложений, каждое из которых кончаетс€ точкой, восклицательным или вопросительным 
//знаком. ќпределить количество предложений в строке X.
package com.artempvn.m_2_String;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_10 {

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
		
	a+=". ";
		break;
	}
	}
		return a;
	}
	
public static void function (String a){ 
int count=0;
int n=0;
for (int i=0;i<a.length();){
	int point1=a.indexOf('.',i);
	if (point1==-1){point1=a.length();}
	int point2=a.indexOf('!',i);
	if (point2==-1){point2=a.length();}
	int point3=a.indexOf('?',i);
	if (point3==-1){point3=a.length();}	
	n=min(min(point1,point2),point3);
	if(n!=a.length()){
		count++;
		i=n+1;
	} else break;
}
print(" оличество предложений: "+count);
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("¬ведите количество элементов строки:  ");
	int n=in.nextInt();
	String a=massiveCreate(n);
print(a);
function(a);
	}	
}
}

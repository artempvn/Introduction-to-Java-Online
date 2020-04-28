//”далить  в  строке  все  лишние  пробелы,  то  есть  серии  подр€д  идущих  пробелов  заменить  на  одиночные  пробелы. 
// райние пробелы в строке удалить.
package com.artempvn.m_1_charMassive;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_5 {

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

public static String function (String a){ // 
char[] ch=a.toCharArray();
a="";
if (ch[0]!=' '){
	a+=ch[0];
}
int length=ch.length;
if (ch[length-1]==' '){
for (int i=ch.length-1;i>-1;i--){
	if (ch[i]==' ') {length--;}
	else break;	
}
}
for (int i=1;i<length;i++){
	if (ch[i]==' ') {
	if (ch[i-1]==' '){} else a+=ch[i];
	} else a+=ch[i];
}
print(a);
return a;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("¬ведите количество элементов строки:  ");
	int n=in.nextInt();
	String a=massiveCreate(n);
print(a);
System.out.println("—трока после удалени€ лишних пробелов:  ");
function(a);
	}
}
}

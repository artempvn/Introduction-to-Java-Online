//�� �������� ������ �������� �����, �������� ������ ������ ������.
package com.artempvn.m_2_String;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_6 {
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
	
public static String function (String a){ 
String b="";
for (int i=0;i<a.length();i++){
	b=b.concat(String.valueOf(a.charAt(i))).concat(String.valueOf(a.charAt(i)));
}
print(b);
return a;
	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ���������� ��������� ������:  ");
	int n=in.nextInt();
	String a=massiveCreate(n);
print(a);
System.out.println("���������� ������: ");
function(a);
	}	
}
}

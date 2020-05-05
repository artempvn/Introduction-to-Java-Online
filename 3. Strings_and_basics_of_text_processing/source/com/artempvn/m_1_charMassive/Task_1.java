//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
package com.artempvn.m_1_charMassive;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_1 {
public static void print (String[] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" %s ",  a[i]);
		}
		System.out.println("\n");
				}			
	public static String[] massiveCreate (int n){ 
	String[]a=new String[n];
	Arrays.fill(a,"");
	char c=0;
			for (int i=0,jl=0; i<n;i++){
				jl=(int)(random()*4)+2;
				for (int j=0; j<jl;j++){
			c=(char)((int)(random()*26)+97);
			a[i]+=c;
					}		
			c=(char)((int)(random()*26)+65);
			a[i]+=c;
				jl=(int)(random()*4)+2;
				for (int j=0; j<jl;j++){
			c=(char)((int)(random()*26)+97);
			a[i]+=c;
					}		
			}
		return a;
	}
	
public static void function (String []a){ 
char[] ch;
for (int i=0;i<a.length;i++){
	ch = a[i].toCharArray();
	a[i]="";
	for (int j=0,n=0;j<ch.length;j++){
	if (ch[j]>=65&&ch[j]<=90){
		n=(int)ch[j];
		n+=32;
		ch[j]=(char)n;
		a[i]+='_';
	}	
	a[i]+=ch[j];		
	}
}
print(a);

	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество строк:  ");
	int n=in.nextInt();
	String []a=massiveCreate(n);
	System.out.print("camelCase:  ");
print(a);
System.out.print("snake_case:  ");
function(a);
	}
	
}
}

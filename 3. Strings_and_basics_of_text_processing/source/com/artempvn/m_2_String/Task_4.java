//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
package com.artempvn.m_2_String;
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
public static void print (int a){ 
	System.out.println(a);
				}					

public static void function (String a){ 
String b="";
String c="торт";
int begin=0;
char[] save;
int end=c.length();
while (b.length()!=c.length()){
for (int i=begin;i<end;){
	if (a.indexOf(c.substring(begin,end))>-1){
		save=new char[c.substring(begin,end).length()];
		a.getChars((a.indexOf(c.substring(begin,end))),((a.indexOf(c.substring(begin,end)))+(c.substring(begin,end)).length()),save,0);
	b=b.concat(String.valueOf(save));
	begin+=c.substring(begin,end).length();
	end=c.length();
	print(b);
break;	
	} else {
	end--;	
	}	
}
}

	}

public static void main (String [] args) {
String a="информатика";
function(a);
	
	
}
}




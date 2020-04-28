//Проверить, является ли заданное слово палиндромом.
package com.artempvn.m_2_String;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_3 {

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

public static boolean function (String a){
StringBuilder b = new StringBuilder(a);
b.reverse();
String a1=b.toString();
boolean pal=false;
if (a.compareToIgnoreCase(a1)==0){
	pal=true;
}
if (pal){
System.out.printf("Слово %s является палиндромом \n", a);	
} else System.out.printf("Слово %s не является палиндромом \n", a);	
return pal;
	}
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите слово:  ");
	String a=in.nextLine();
function(a);
	}
	
}
}

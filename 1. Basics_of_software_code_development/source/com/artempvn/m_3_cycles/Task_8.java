//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
package com.artempvn.m_3_cycles;
import java.util.Scanner;
import java.math.*;
import static java.lang.Math.*;
public class Task_8 {
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("Введите m ");
	int m=in.nextInt();
	System.out.print("Введите n ");
	int n=in.nextInt();
	System.out.println();
String ms=Integer.toString(m);
String ns=Integer.toString(n);
boolean[] mb=new boolean[10];
boolean[] nb=new boolean[10];
for (int i=0;i<ms.length();i++)	{
	for (int j=0; j<10;j++){
		if (Integer.parseInt(String.valueOf(ms.charAt(i)))== j){
		mb[j]=true;	
		}
	} 
}
for (int i=0;i<ns.length();i++)	{
	for (int j=0; j<10;j++){
		if (Integer.parseInt(String.valueOf(ns.charAt(i)))== j){
		nb[j]=true;	
		}
	}  
}
	for (int i=0; i<10;i++){
	if(mb[i]&&nb[i])	{
		System.out.println(i);
		} 
}	
	}
	}	
}


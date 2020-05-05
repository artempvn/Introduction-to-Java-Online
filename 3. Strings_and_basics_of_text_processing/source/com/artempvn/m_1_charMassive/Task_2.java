//Замените в строке все вхождения 'word' на 'letter'.
package com.artempvn.m_1_charMassive;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_2 {
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
		a+="word";	
		break;
	}
	}
		return a;
	}
	
public static void function (String a){ 
char[] ch=a.toCharArray();
	a="";
	String word="word";
	char[] chw=word.toCharArray();
	String letter="letter";
	char[] chl=letter.toCharArray();
	for (int i=0;i<ch.length;i++){
		boolean isWord=false;
	if (ch[i]==chw[0]&&i<ch.length-chw.length+1){
		 isWord=true;
		for (int j=0,n=i;j<chw.length;j++,n++){
		if (ch[n]!=chw[j]){
			isWord=false;
			break;
		}		
		}		
	}	
	if (isWord){
		for (int j=0;j<chl.length;j++){
		a+=chl[j];	
		}
		i+=chw.length-1;
	} else{
	a+=ch[i];
	}	
	}

print(a);

	}

public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("Введите количество элементов строки:  ");
	int n=in.nextInt();
	String a=massiveCreate(n);
print(a);
System.out.println("После замены word на letter:  ");
function(a);
	}
	
}
}

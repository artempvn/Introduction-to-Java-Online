//Напишите  анализатор,  позволяющий последовательно возвращать  содержимое  узлов xml-документа  и  его  тип  (открывающий 
//тег,  закрывающий  тег,  содержимое  тега,  тег  без  тела).  Пользоваться  готовыми  парсерами  XML  для  решения  данной  задачи 
//нельзя. 
package com.artempvn.m_3_regex;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.regex.*;
public class Task_2 {

public static void print (String[] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" %s \n",  a[i]);
		}
		System.out.println("\n");
}

public static void print (String[][] a){ 
	for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
		System.out.printf(" %s \n",  a[i][j]);
		}
		System.out.printf(" ------ \n");
}
}

public static void print (int[][] a){ 
	for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
		System.out.printf(" %d \n",  a[i][j]);
		}
		System.out.printf(" ------ \n");
}
}
	
public static void print (String a){ 
	System.out.println(a);
				}	
public static void print (int a){ 
	System.out.println(a);
				}	
public static void print (int[] a){ 
	for(int i=0;i<a.length;i++){
	System.out.printf(" %2d ",  a[i]);
		}
		System.out.println("\n");
				}				

public static String function00 (String a){ 
Pattern ptrn1 = Pattern.compile("\n");
Matcher m1 = ptrn1.matcher(a);
a=m1.replaceAll("");
return a;	
} 					
				
								
public static String[] function (String a){ 			
Pattern ptrn1 = Pattern.compile("<[^/].*?>");
Matcher m1 = ptrn1.matcher(a);
String[] s=new String[99];
int count=0;
 while (m1.find()){
	  s[count]=a.substring(m1.start(), m1.end());
	  count++;
 }
String[] b=new String[count];
System.arraycopy(s,0,b,0,count);
return b;
}
				

public static String[] function01 (String a){ 			
String[]b=function(a);
Pattern ptrn1 = Pattern.compile("(?<=<).*?(?=>|\\s)");
for( int i=0;i<b.length;i++){
Matcher m1 = ptrn1.matcher(b[i]);
if (m1.find()){
	  b[i]=b[i].substring(m1.start(), m1.end());
 }
}
return b;
}

public static String[] function02 (String a){ 			
String[]b=function01(a);
String[]c=new String[b.length];
for( int i=0;i<b.length;i++){
Pattern ptrn1 = Pattern.compile("<"+b[i]+".+?</"+b[i]+">");
Matcher m1 = ptrn1.matcher(a);
Pattern ptrn2 = Pattern.compile("<"+b[i]+".*?>");
Pattern ptrn3 = Pattern.compile("</"+b[i]+">");
int count=0;
int end=0;
int start=0;
if (m1.find()){
	  c[i]=a.substring(m1.start(), m1.end());
	  end=m1.end();
	  start=m1.start();
	  int prev=0;
label1:	  while (true){
		  count=0;
			Matcher m2 = ptrn2.matcher(c[i]);
			while (m2.find()){
				count++;
			}
			if(prev==count) break label1;
			prev=count;
			if(count>1){
			Matcher m3 = ptrn3.matcher(a);
	  while (m3.find(end)&&count!=1){
				count--;
			c[i]=a.substring(start, m3.end());
			end=m3.end();
			
			}
			}
			}  
	  a=a.substring(m1.start()+1, a.length()-1); 
 } else {
	 ptrn1 = Pattern.compile("<"+b[i]+".*?>");
	 m1 = ptrn1.matcher(a);
	 if (m1.find()){
	  c[i]=a.substring(m1.start(), m1.end());
	  a=a.substring(m1.start()+1, a.length()-1);
	 }
 }
}
return c;
}
public static String[] function03 (String a){ 			
String[]b=function02(a);
for( int i=0;i<b.length;i++){
Pattern ptrn1 = Pattern.compile("(<.+?>)(.*)(</.+>)");
Matcher m1 = ptrn1.matcher(b[i]);
if (m1.find()){
	print("---------------");
	  print("Открывающий тэг: "+m1.group(1));
	  print("Закрывающий тэг: "+m1.group(3));
	  print("Содержимое тэга: "+m1.group(2));
 } else {
	 ptrn1 = Pattern.compile("<.+?>");
	 m1 = ptrn1.matcher(b[i]);
	 if (m1.find()){
	print("---------------");
	  print("Тег без тела: "+m1.group(0));

 }
}
	Scanner in = new Scanner(System.in);
}
return b;
}


public static void main (String [] args) {
 	String a="<notes>\n<note id = \"1\">\n<to>Вася</to>\n<from>Света</from>\n<heading>Напоминание</heading>\n<body>Позвони мне завтра!</body>\n</note>\n<note id = \"2\">\n<to>Петя</to>\n<from>Маша</from>\n<heading>Важное напоминание</heading>\n<body/>\n</note>\n</notes>"; 
	print(a);
a=function00(a);

function03(a);
}
}


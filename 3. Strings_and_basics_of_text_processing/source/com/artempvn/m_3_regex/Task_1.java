/*Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом  три  различных 
*операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать  слова  по  длине; 
*отсортировать  лексемы  в  предложении  по  убыванию  количества  вхождений  заданного  символа,  а  в  случае  равенства  –  по 
*алфавиту.*/
package com.artempvn.m_3_regex;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.regex.*;
public class Task_1 {

public static void print (String[] a){ 
	for(int i=0;i<a.length;i++){
		System.out.printf(" %s ",  a[i]);
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

public static int[] function0 (String a){ 			
	 String pattern0 = "(\n)"; 
  String pattern1 = "([.!?]\\s*)";
  String[] aM=a.split(pattern0);
   int[] count=new int[aM.length];
Pattern ptrn1 = Pattern.compile(pattern1);
Matcher matcher1;
for (int i=0;i<aM.length;i++){
matcher1 = ptrn1.matcher(aM[i]);	
 while (matcher1.find()){
      count[i]++;
	  }
  }	
return count;  
}				

public static String function (String a,boolean up){ 
 String b="";
 	 String pattern0 = "(\n)"; 
  String[] aM=a.split(pattern0);
 int[]count=function0(a);
 int[] ind=new int[count.length]; 
  int minInd=0;
 for (int i=0;i<count.length;i++){ 
int min= Integer.MAX_VALUE;
for (int j=0;j<count.length;j++){
	if (min>count[j]&&count[j]>0){
		min=count[j];
		minInd=j;
	}
}
count[minInd]=-1;
ind[i]=minInd;
}   
if (up){
for (int i=0;i<count.length;i++){
	b=b.concat(aM[ind[i]]).concat("\n");
}  
} else {
for (int i=count.length-1;i>-1;i--){
	b=b.concat(aM[ind[i]]).concat("\n");
}
}
print(b);
return b;
	}
	
public static String function1 (String a,boolean up){ 
String b="";
 String pattern0 = "([.!?]\\s*)";
  String pattern1 = "\\P{L}+";
  String[] aM;  
   aM=a.split(pattern0);
   String[][] aM1=new String[aM.length][]; 
Matcher matcher1;
Pattern ptrn1 = Pattern.compile(pattern1);
  for (int i=0;i<aM.length;i++){

	  aM1[i]=aM[i].split(pattern1);  
  }
  
  int[][] len=new int[aM1.length][];
  for (int i=0;i<aM1.length;i++){
	  len[i]=new int[aM1[i].length];
	 for (int j=0;j<aM1[i].length;j++){ 
	  len[i][j]=aM1[i][j].length();
	 }
  }

int[][] ind=new int[len.length][]; 
  int minInd=0;
  for (int i=0;i<len.length;i++){ 
  ind[i]=new int[len[i].length];
 for (int j=0;j<len[i].length;j++){ 
int min= Integer.MAX_VALUE;
for (int l=0;l<len[i].length;l++){
	if (min>len[i][l]&&len[i][l]>0){
		min=len[i][l];
		minInd=l;
	}
}
len[i][minInd]=-1;
ind[i][j]=minInd;
}  	
  }  		
int[]count=function0(a);
int num=0;	
if (up){
for (int i=0,m=0;i<ind.length;i++){
	for (int j=0;j<ind[i].length;j++){
	b=b.concat(aM1[i][ind[i][j]]).concat(" ");
	}
	b=b.concat(". ");
	if (count[m]+num==i+1)	{
	b=b.concat("\n");
	num+=count[m];
	m++;
	}	
 
}	
	}else  {
	for (int i=0,m=0;i<ind.length;i++){
	for (int j=ind[i].length-1;j>-1;j--){
	b=b.concat(aM1[i][ind[i][j]]).concat(" ");
	}
	b=b.concat(". "); 
	if (count[m]+num==i+1)	{
	b=b.concat("\n");
	num+=count[m];
	if(m<count.length-1) m++;	
} 
}		
	}
b=function00(b);
  print(b); 
  return b;  
}	
		
public static String function2 (String a, String c){ 
String b="";
 String pattern0 = "([.!?]\\s*)";
  String pattern1 = "\\P{L}+";
  String[] aM; 
   aM=a.split(pattern0);
   String[][] aM1=new String[aM.length][];  
Pattern ptrn1 = Pattern.compile(pattern1);
String [][]d=new String[aM.length][];
  for (int i=0;i<aM.length;i++){

	  aM1[i]=aM[i].split(pattern1);  
  }
  
  Pattern ptrn2 = Pattern.compile(c);
  Matcher matcher1;
  int[][] len=new int[aM1.length][];
  for (int i=0;i<aM1.length;i++){
	  len[i]=new int[aM1[i].length];
	 for (int j=0;j<aM1[i].length;j++){
				matcher1 = ptrn2.matcher(aM1[i][j]);
	 while (matcher1.find()) {
	  len[i][j]++;
	 }
	 }
  }

  int[]countl=new int[aM1.length];
  for (int i=0;i<aM1.length;i++){
	 for (int j=0;j<aM1[i].length-1;j++){	
	 boolean tr=true;
		for (int l=j+1;l<aM1[i].length;l++){
			
	  if (len[i][j]==len[i][l]){
		  tr=false;
	  }
	  
		}
		if(tr){
		  countl[i]++;
	  }
	  
	 }
	 countl[i]++;
  }
	
String[][] ind=new String[len.length][]; 
  
  for (int i=0;i<len.length;i++){ 
  ind[i]=new String[countl[i]];
 for (int j=0;j<ind[i].length;j++){ 
 ind[i][j]="";
 
int min= Integer.MAX_VALUE;
for (int l=0;l<len[i].length;l++){  
	if (min>len[i][l]&&len[i][l]>-1){
		min=len[i][l];
		
	}	
}

 int count2=0;           
for (int m=0;m<len[i].length;m++){    
	if (min==len[i][m]){
	count2++;	
	}	
}

String[] abc=new String[count2];
for (int m=0,k=0;m<len[i].length;m++){     
	if (min==len[i][m]){
	abc[k]=aM1[i][m];
k++;	
	}
}
Arrays.sort(abc,String::compareToIgnoreCase);
for (int q=0;q<abc.length;q++){
ind[i][j]=ind[i][j].concat(abc[q]).concat(" ");
}
for (int q=0;q<len[i].length;q++){
	if(min==len[i][q]){
		len[i][q]=-1;
	}
}
}
	
  } 

int[]count=function0(a);
int num=0;	

	for (int i=0,m=0;i<ind.length;i++){
	for (int j=ind[i].length-1;j>-1;j--){
	b=b.concat(ind[i][j]).concat(" ");
	}
	b=b.concat(". "); 
	if (count[m]+num==i+1)	{
	b=b.concat("\n");
	num+=count[m];
	m++;	
} 
}		

b=function00(b);
  print(b); 
  
  return b;
  
}		
		
public static String function00 (String a){ 
Pattern ptrn1 = Pattern.compile("\\s*\\.");
Pattern ptrn2 = Pattern.compile("\\s*\n");
Matcher m1 = ptrn1.matcher(a);
a=m1.replaceAll(".");
Matcher m2 = ptrn2.matcher(a);
a=m2.replaceAll("\n");
return a;	
} 	

public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	String a="Тошнота осталась там, в желтом свете. Я счастлив: этот холод так чист, так чиста эта ночь, разве и сам я - не волна ледяного воздуха? Не иметь ни крови, ни лимфы, ни плоти. И течь по этому длинному каналу к бледному пятну вдали. Быть - просто холодом.\nНо вот люди. Две тени. Что им здесь понадобилось?\nНизенькая женщина тянет за рукав мужчину. И говорит дробной скороговоркой. Из-за ветра я не могу разобрать слов.\n"; 
print(a);
boolean b=true;
print("Выполнять все операции с исходным текстом?(true/false)");
boolean c=in.nextBoolean();
while(true){

print("-----------\nВыберите способ сортировки:\n1. Отсортировать абзацы по количеству предложений;\n2. Отсортировать в каждом предложении слова по длине;\n3. Отсортировать лексемы в предложении по убыванию количества вхождений символа (в случае равенства по алфавиту).");
int i=in.nextInt();
print("-----------");
switch (i){
		case 1: 
		print("Сортировать по возрастанию?(true/false)");
		b=in.nextBoolean();
		print("-----------");
		if(c)function(a,b); else a=function(a,b);
	break;
	case 2: 
		print("Сортировать по возрастанию?(true/false)");
		b=in.nextBoolean();
		print("-----------");
		if(c)function1(a,b); else a=function1(a,b);
	break;
	case 3: 
		print("Введите символ для сортировки");
		String s=in.next();
		print("-----------");
		if(c)function2(a,s); else a=function2(a,s);
	break;
}	

}
}

}


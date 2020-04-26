//Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен 
//заданному е. Общий член ряда имеет вид: a(n)=(1/(2^n))+(1/(3^n))
package com.artempvn.cycles;
import java.util.Scanner;
import java.math.*;
import static java.lang.Math.*;
public class Task_5 {
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
		double sum=0;
double e=0;
do {
	System.out.print("Input e>0: ");
	e = in.nextDouble();
} while (e<=0);
for (int n=1;;n++){
	double a= (pow(2,-n)+pow(3,-n));
	if (e<=abs(a)) {
	sum+=a;
} else {
	System.out.printf("Сумма равна %f \n",sum);
	break;}

}
	}
	}	
}


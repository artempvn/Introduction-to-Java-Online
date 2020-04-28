//Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
package com.artempvn.m_1_linear;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_5 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.print("Input T: ");
        int T = in.nextInt();
		int h=T/3600;
		int m=(T-h*3600)/60;
		int s=T-h*3600-m*60;
    System.out.printf("%02dч %02dмин %02dс \n",h,m,s); 

	}
}
}

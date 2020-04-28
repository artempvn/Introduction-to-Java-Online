//Дано действительное число R  вида nnn.ddd  (три цифровых разряда в дробной и целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.
package com.artempvn.m_1_linear;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_4 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
		double integ=(int) x;
		double fract=(x*1000-integ*1000)/1000;
		double integ1 =(int) (fract*1000);
		double fract1=integ/1000;
	double z=integ1+fract1;
    System.out.printf("result: %07.3f \n", z); 

	}
}
}

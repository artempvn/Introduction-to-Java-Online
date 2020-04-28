//Для  данной  области  составить  линейную  программу,  которая  печатает  true,  если  точка  с  координатами  (х,  у) 
//принадлежит закрашенной области, и false — в противном случае (область: при y=[0;4] x=[-2;2], при y=[-3;0] x=[-4;4])
package com.artempvn.m_1_linear;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_6 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.print("Input x: ");
        int x = in.nextInt();
System.out.print("Input y: ");
        int y = in.nextInt();		
		boolean a=((y>=0)&&(y<=4)&&(x>=-2)&&(x<=2));
		boolean b=((y>=-3)&&(y<=0)&&(x>=-4)&&(x<=4));
		boolean c=a||b;
    System.out.println(c); 

	}
}
}

//���������  �������  �����������  ��������������  ��  ��������  �,  ���������  �����  ����������  ������� 
//������������.
package com.artempvn.m_4_decomposition;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_3 {

public static double function (int a){ 
double sqt=pow(a,2)*pow(3,0.5)/4;
return sqt;
	}
	public static double function1 (int a){ 
double sq6=function(a)*6;

return sq6;
	}
public static void main (String [] args) {
	while (true){
	Scanner in = new Scanner(System.in);
System.out.print("������� ����� ������� �������������:  ");
	int a=in.nextInt();

System.out.printf("������� �������������� �� �������� %d ����������: %.3f \n",a, function1(a));
	}
	
}
}

//��������  ���������,  ���  ������������  ������ �����  �����  �������������  �����. 
//� ���������  ��������� ��� ����� �� 1 �� ���������� ������������� �����.
package com.artempvn.m_3_cycles;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task_1 {
public static void main (String [] args) {
	while (true){
		int x=0;
		int sum=0;
Scanner in = new Scanner(System.in);
while (x<=0) {
System.out.print("Input x: ");
x = in.nextInt();	
}
for (int i=1; i<(x+1);i++) {
	 sum += i;
}
System.out.printf("����� ����� �� 1 �� %d ����� %d \n",x, sum);
	}	
}
}

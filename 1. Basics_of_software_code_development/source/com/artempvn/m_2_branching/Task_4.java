//������ ������� �, � �������������� ��������� � ������� �, �, z  �������. ����������, ������� �� ������ ����� ���������.
package com.artempvn.m_2_branching;
import java.util.Scanner;
public class Task_4 {
public static void main (String [] args) {
	while (true){
Scanner in = new Scanner(System.in);
System.out.println("������� ���������: ");
System.out.print("Input A: ");
float A = in.nextFloat();
System.out.print("Input B: ");
float B = in.nextFloat();
System.out.println("");
System.out.println("������� �������: ");
System.out.print("Input x: ");
float x = in.nextFloat();
System.out.print("Input y: ");
float y = in.nextFloat();
System.out.print("Input z: ");
float z = in.nextFloat();
System.out.println("");
if (((x<=A)&&(y<=B))||((y<=A)&&(x<=B))||((x<=A)&&(z<=B))||((z<=A)&&(x<=B))||((z<=A)&&(y<=B))||((y<=A)&&(z<=B))){
	System.out.println("������ �������");
} else {System.out.println("������ �� �������");}


	}
}
}

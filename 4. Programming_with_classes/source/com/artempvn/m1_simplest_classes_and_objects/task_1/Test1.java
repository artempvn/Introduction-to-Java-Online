//��������  �����  Test1  �����  �����������.  ��������  �����  ������  ��  �����  �  ������  ���������  ���� 
//����������.  ��������  �����,  �������  �������  �����  ��������  ����  ����������,  �  �����,  �������  ������� 
//���������� �������� �� ���� ���� ����������.
package com.artempvn.m1_simplest_classes_and_objects.task_1;
public class Test1 {
static int x;
static int y;

public static void print(){
	System.out.printf("����������: x=%d; y=%d \n",x,y);
}

public static void set(int x, int y){
Test1.x=x;
Test1.y=y;
}
public static int sum(){
System.out.println("����� �����: "+(x+y));
return x+y;
}
public static int max(){
int max=0;
if(x!=y){
max=x>y?x:y;
System.out.println("���������� ��������: "+max);
} else {System.out.println("���������� �����"); max=x;}
return max;
}

public static void main (String [] args) {
set(5,4);
print();
sum();
max();
}
}









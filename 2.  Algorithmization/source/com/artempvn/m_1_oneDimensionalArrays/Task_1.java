//� ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
package com.artempvn.m_1_oneDimensionalArrays;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
public class Task_1 {
static int[]A;	
static int K;
public static int total (int[] s){
	int sum=0;
for(int i=0;i<s.length;i++){
		if (s[i]%K==0){
			sum+=s[i];
		}
}
		return sum;	
	}
public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	while(true){
	System.out.print("������� N ");
	int N=in.nextInt();
	System.out.print("������� K ");
	K=in.nextInt();
	System.out.println();	
	A=new int[N];
	for(int i=0;i<N;i++){
		A[i]=(int)(random()*100);
	}
	System.out.println(Arrays.toString(A));
		System.out.println("����� ���������, ������� ������ "+K+" ���������� "+total(A));
	}
	
}
}
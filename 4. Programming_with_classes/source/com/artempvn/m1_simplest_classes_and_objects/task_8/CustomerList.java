/*
*������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ 
*� �����  toString(). ������� ������ �����, ������������ ������ ����  Customer, � ����������� �������������� 
*� ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������. 
*����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����. 
*����� � �������: 
*a) ������ ����������� � ���������� �������; 
*b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
*/
package com.artempvn.m1_simplest_classes_and_objects.task_8;
import java.util.*;
import static java.lang.Math.*;
public class CustomerList {
private ArrayList<Customer> cst;
class NameCompare implements Comparator<Customer>{
	public int compare (Customer one, Customer two){
		if (one.getSurname().compareTo(two.getSurname())==0){
			if (one.getName().compareTo(two.getName())==0){
			return one.getSecondName().compareTo(two.getSecondName());
			} else return one.getName().compareTo(two.getName());
		} else return one.getSurname().compareTo(two.getSurname());	
	}
}
public  void function1 (){ 
System.out.println("������ ����������� � ���������� �������");
NameCompare namcom=new NameCompare();
Collections.sort(cst,namcom);
for(Customer i:cst)	{
	System.out.println(i.getSurname()+" "+i.getName()+" "+i.getSecondName());
}
}

public  void function2 (int start, int end){ 
System.out.println("������ �����������, � ������� ����� ��������� �������� ��������� � ��������� �� "+start+ " �� "+end+":");
for(Customer i:cst)	{
	if (i.getCreditNum()>=start&&i.getCreditNum()<=end){
System.out.println(i.getSurname()+" "+i.getName()+" "+i.getSecondName());
	}
}
}



public static void main (String [] args) {
String b="1/������/����/��������/�. �����, ��. ����������, 5/123/415979\n2/������/����/��������/�. �����, ��. ����������, 6/147/4849\n66/�������/�����/���������/�. �����, ��. �������, 12/741/4148484\n";
String[] a=b.split("\n");
CustomerList c=new CustomerList();		
c.cst=new ArrayList<Customer>();
for (int i=0;i<a.length;i++){
	c.cst.add(new Customer(a[i]));
	System.out.println(c.cst.get(i));
}
c.function1();
Scanner in = new Scanner(System.in);
System.out.println("������� �������� ������� ��������� ��������.");
int start=in.nextInt();
int end=in.nextInt();
c.function2(start,end);

}
}


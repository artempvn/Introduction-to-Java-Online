/*
*������� �����  Book, ������������ �������� ��������� ����. ���������� ������������,  set-  �  get-  ������ � 
*�����   toString().  �������  ������  �����,  ������������  ������  ����  Book,  �  �����������  ��������������  � 
*��������. ������ �������� ������ ������ � ������� ��� ������ �� �������. 
*Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������. 
*����� � �������: 
*a) ������ ���� ��������� ������; 
*b) ������ ����, ���������� �������� �������������; 
*c) ������ ����, ���������� ����� ��������� ����.
*/
import java.util.*;
import static java.lang.Math.*;
public class BookList {
private ArrayList<Book> books;

public  void function (String author){ //������ ���� ������
System.out.println("������ ���� ������ "+author+":");
for(Book i:books)	{
	if (i.getAuthor().equals(author)){
System.out.println(i.getTitle());
	}
}
}

public  void function1 (String publisher){ //������ ���� ������������
System.out.println("������ ���� ������������ "+publisher+":");
for(Book i:books)	{
	if (i.getPublisher().equals(publisher)){
System.out.println(i.getTitle());
	}
}
}

public  void function2 (String year){ //������ ����, �������� ����� ���������� ����
System.out.println("������ ����, �������� ����� "+year+" ����:");
for(Book i:books)	{
	if (i.getYear().compareTo(year)>0){
System.out.println(i.getTitle());
	}
}
}

public static void main (String [] args) {
String b="1/����/������ ����/���/2019/384/15,65/�������\n2/�������/���-���� �����/���/2019/320/11,60/������\n3/���������/��� �������/���/2014/320/17,64/�������\n4/���������/��� �������/���/2019/320/10,46/������\n5/��������� Java/���� ������/�����/2019/1168/70,30/�������\n";
String[] a=b.split("\n");
BookList c=new BookList();		
c.books=new ArrayList<Book>();
for (int i=0;i<a.length;i++){
	c.books.add(new Book(a[i]));
	System.out.println(c.books.get(i));
}

Scanner in = new Scanner(System.in);
System.out.println("������� ������");
String author=in.nextLine();
c.function(author);
System.out.println("������� ������������");
String publisher=in.nextLine();
c.function1(publisher);
System.out.println("������� ��� �������");
String year=in.nextLine();
c.function2(year);
}
}


/*
*Создать класс  Book, спецификация которого приведена ниже. Определить конструкторы,  set-  и  get-  методы и 
*метод   toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и 
*методами. Задать критерии выбора данных и вывести эти данные на консоль. 
*Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
*Найти и вывести: 
*a) список книг заданного автора; 
*b) список книг, выпущенных заданным издательством; 
*c) список книг, выпущенных после заданного года.
*/
package com.artempvn.m1_simplest_classes_and_objects.task_9;
import java.util.*;
import static java.lang.Math.*;
public class BookList {
private ArrayList<Book> books;

public  void function (String author){ //Список книг автора
System.out.println("Список книг автора "+author+":");
for(Book i:books)	{
	if (i.getAuthor().equals(author)){
System.out.println(i.getTitle());
	}
}
}

public  void function1 (String publisher){ //Список книг издательства
System.out.println("Список книг издательства "+publisher+":");
for(Book i:books)	{
	if (i.getPublisher().equals(publisher)){
System.out.println(i.getTitle());
	}
}
}

public  void function2 (String year){ //Список книг, изданных после указанного года
System.out.println("Список книг, изданных после "+year+" года:");
for(Book i:books)	{
	if (i.getYear().compareTo(year)>0){
System.out.println(i.getTitle());
	}
}
}

public static void main (String [] args) {
String b="1/Чума/Альбер Камю/АСТ/2019/384/15,65/твердый\n2/Тошнота/Жан-Поль Сартр/АСТ/2019/320/11,60/мягкий\n3/Невидимки/Чак Паланик/АСТ/2014/320/17,64/твердый\n4/Уцелевший/Чак Паланик/АСТ/2019/320/10,46/мягкий\n5/Философия Java/Брюс Эккель/Питер/2019/1168/70,30/твердый\n";
String[] a=b.split("\n");
BookList c=new BookList();		
c.books=new ArrayList<Book>();
for (int i=0;i<a.length;i++){
	c.books.add(new Book(a[i]));
	System.out.println(c.books.get(i));
}

Scanner in = new Scanner(System.in);
System.out.println("Введите автора");
String author=in.nextLine();
c.function(author);
System.out.println("Введите издательство");
String publisher=in.nextLine();
c.function1(publisher);
System.out.println("Введите год издания");
String year=in.nextLine();
c.function2(year);
}
}


//Создйте  класс  Test2  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
//класса.
package com.artempvn.m1_simplest_classes_and_objects.task_2;
public class Test2 {
private int x;
private int y; 

Test2(int x,int y){
this.x=x;
this.y=y;	
}


public void setX(int x){
this.x=x;
}
public void setY(int y){
this.y=y;
}
public int getX(){
return x;
}
public int getY(){
return y;
}

public static void main (String [] args) {
Test2 a=new Test2(5,4);
a.setX(9);
System.out.println(a.getX()+" "+a.getY());
}
}









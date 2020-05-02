//Создайте  класс  Test1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих 
//переменных.  Добавьте  метод,  который  находит  сумму  значений  этих  переменных,  и  метод,  который  находит 
//наибольшее значение из этих двух переменных.
package com.artempvn.m1_simplest_classes_and_objects.task_1;
public class Test1 {
static int x;
static int y;

public static void print(){
	System.out.printf("Переменные: x=%d; y=%d \n",x,y);
}

public static void set(int x, int y){
Test1.x=x;
Test1.y=y;
}
public static int sum(){
System.out.println("Сумма равна: "+(x+y));
return x+y;
}
public static int max(){
int max=0;
if(x!=y){
max=x>y?x:y;
System.out.println("Наибольшее значение: "+max);
} else {System.out.println("Переменные равны"); max=x;}
return max;
}

public static void main (String [] args) {
set(5,4);
print();
sum();
max();
}
}









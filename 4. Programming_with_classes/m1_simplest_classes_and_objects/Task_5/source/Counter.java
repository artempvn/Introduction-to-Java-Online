/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
*на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
*произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод
*позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/
import java.util.*;
import static java.lang.Math.*;
public class Counter {
int count;
public Counter(){}
public Counter(String s){
	this.count=(int)(random()*10);
}

public int function00(int count){ 
	if (count>9) return 0;
	if (count<0) return 9;
	return count;
}

public int up(Counter c){
	c.count++;
	c.count=function00(c.count);
	return count;
}
public int down(Counter c){
	c.count--;
	c.count=function00(c.count);
	return count;
}
public int get(Counter c){
	return c.count;
}

public static void main (String [] args) {
Counter c=new Counter();	
System.out.println("Значение счетчика по умолчанию");
System.out.println(c.get(c));	
c=new Counter("");
System.out.println("Произвольное значение счетчика");
System.out.println(c.count);
System.out.println("Увеличение счетчика на единицу 15 раз");
for (int i=0;i<15;i++){
	c.up(c);	
System.out.println(c.get(c));
}
System.out.println("Уменьшение счетчика на единицу 15 раз");
for (int i=15;i>0;i--){
	c.down(c);	
System.out.println(c.get(c));
}
}
}









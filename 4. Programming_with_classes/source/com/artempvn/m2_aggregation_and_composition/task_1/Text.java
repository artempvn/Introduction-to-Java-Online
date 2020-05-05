// Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
//консоль текст, заголовок текста. 
package com.artempvn.m2_aggregation_and_composition.task_1;
import java.util.*;
import static java.lang.Math.*;
public class Text {
private String title;
private String mainText="";

public Text(Sentence...sentences){
for (Sentence s: sentences){
mainText=mainText.concat(s.getSentense()+" ");
}
}

public void addText(Sentence...sentences){	
for (Sentence s: sentences){
mainText=mainText.concat(s.getSentense()+" ");
}
}

public void print(){
System.out.println(mainText);
}

public void printTitle(){
System.out.println(title);	
}

public void setTitle(String title){
this.title=title;	
}

public static void main (String [] args) {
Word a=new Word("Hello");
Word b=new Word("World");
Word c=new Word("Good");
Word d=new Word("news");
Word e=new Word("everyone");
Sentence a1=new Sentence(a,b);
Sentence b1=new Sentence(c,d,e);
Text a2=new Text(a1,b1);
a2.setTitle("My Text");
a2.printTitle();
a2.print();
a2.addText(new Sentence(new Word("New"),new Word("text"),new Word("was"),new Word("added")));
a2.print();
}
}


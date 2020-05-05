//ƒракон и его сокровища.  —оздать программу, позвол¤ющую обрабатывать сведени¤ о 100 сокровищах в пещере 
//дракона.  –еализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и 
//выбора сокровищ на заданную сумму.
package com.artempvn.task_4;
import java.util.*;
import java.nio.file.*;
import java.io.BufferedWriter;
import static java.lang.Math.*;

public class DragonLair {
private String name;
private Treasure topTreasure;
private ArrayList<Treasure> treasures=new ArrayList<Treasure>();
private ArrayList<Treasure> treasuresOnAmount;

public String getName(){
	return name;
}
public ArrayList<Treasure> getTreasures(){
	return treasures;
}
public Treasure getTopTreasure(){
	return topTreasure;
}
public ArrayList<Treasure> getTreasuresOnAmount(){
	return treasuresOnAmount;
}

public DragonLair(String name){
	this.name=name;
}


public void add (Treasure treasure){
treasures.add(treasure);
}

public void explore(){
	System.out.printf("ѕещера: %s\n", name);	
for(Treasure tr:treasures){
	System.out.printf("%-4d сокровище: %-10s стоимость: %-5d\n",tr.getId(), tr.getName(),tr.getCost());
	}
}

public void takeTop(){
topTreasure=treasures.get(0);	
for(Treasure tr:treasures){
	if(topTreasure.getCost()<tr.getCost()) topTreasure=tr;
	}
System.out.printf("—амое ценное сокровище: %d  %s стоимость: %d\n",topTreasure.getId(), topTreasure.getName(),topTreasure.getCost());	
}

public void takeOnAmount(int amount){
int max=0;	
for(Treasure tr:treasures){
	max+=tr.getCost();
}
if (max<amount)	{
	System.out.println("—окровищ на указанную сумму нет.");
	return;
}
int sum=0;
int i1=1;
		treasuresOnAmount=new ArrayList<Treasure>();
int count=0;	
boolean b=false;
aa: for (int i=0;i<treasures.size();i++){
	count=0;
do {
	sum=0;
	
	int[] rand=new int[i+1];
	for (int j=0;j<rand.length;j++){
		do{
		 b=false;
		rand[j]=(int)(random()*treasures.size());
		for (int k=0;k<j;k++){
			if (rand[j]==rand[k]) b=true;
		}
		}while (b);
		
	}

	for (int j=0;j<rand.length;j++){
		treasuresOnAmount.add(treasures.get(rand[j]));
		sum+=treasures.get(rand[j]).getCost();
	}
	count++;
	if (sum==amount) break aa;
	if (sum!=amount)treasuresOnAmount=new ArrayList<Treasure>();
	
} while(count<9000);

}
if (treasuresOnAmount.size()==0){
System.out.printf("Ќа такую стоимость сокровищ не набрать\n");	
} else{
System.out.printf("—окровища на сумму %d: \n", amount);	
for(Treasure tr:treasuresOnAmount){
	System.out.printf("%-4d сокровище: %-10s стоимость: %-5d\n",tr.getId(), tr.getName(),tr.getCost());
	}
}
}


public static void main (String [] args) {
DragonLair d1=new DragonLair("Ћогово ƒревнего ƒракона");
for (int i=0;i<100;i++){
d1.add(Treasure.create());	
}
	
Scanner in = new Scanner(System.in);
System.out.printf("ћы нашли пещеру: %s\n∆елаете ее исследовать?(y/n) ",d1.getName());
String choise=in.next();
if(choise.equals("y")) d1.explore();
System.out.printf("¬з¤ть самое ценное сокровище или же набрать сокровищ на определенную сумму?(1/2) ");
choise=in.next();
if(choise.equals("1")) d1.takeTop();
if(choise.equals("2")) {
System.out.printf("Ќа какую сумму набрать сокровищ? ");	
choise=in.next();
	d1.takeOnAmount(Integer.parseInt(choise));

	}

}
}

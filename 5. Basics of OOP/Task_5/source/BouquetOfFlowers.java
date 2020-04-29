//¬ариант A. ÷веточна€ композици€. –еализовать приложение, позвол€ющее создавать цветочные композиции
//(объект, представл€ющий собой цветочную композицию). —оставл€ющими цветочной композиции €вл€ютс€ цветы 
//и упаковка.
import java.util.*;
import java.nio.file.*;
import java.io.BufferedWriter;
import static java.lang.Math.*;
import java.util.regex.*;

public class BouquetOfFlowers {
private String name;
private ArrayList<Flower> flowers=new ArrayList<Flower>();
private Packaging packaking;

public String getName(){
	return name;
}
public ArrayList<Flower> getFlowers(){
	return flowers;
}
public Packaging getPackaging(){
	return packaking;
}

public BouquetOfFlowers(String name){
	this.name=name;
}
public BouquetOfFlowers(){}

public void add (Flower flower){
flowers.add(flower);
}

public void check(){
Scanner in = new Scanner(System.in);
System.out.printf("¬ведите желаемые цветы ");

do{
String s=in.nextLine();		
String[] flowers1=s.split(",| |;"); 
Flower[] fl = Flower.values();
for(String s1:flowers1){
	for (Flower f1:fl){
		if(s1.equalsIgnoreCase(f1.getName())){
			flowers.add(f1);
		}
	}
}
if (flowers.size()<1) Flower.print();
} while(flowers.size()<1);
}

public void checkPackaging(){ 
Scanner in = new Scanner(System.in);
System.out.printf("¬ведите желаемую упаковку ");

Packaging[] p = Packaging.values();
boolean isCorrect=false;
do{
	String s=in.next();
for(Packaging p1:p){
		if(s.equalsIgnoreCase(p1.getName())){
			packaking=p1;
			isCorrect=true;	
	}  
}
if (!isCorrect) Packaging.print();
}while(!isCorrect);
}

public void addFlowers(){
Scanner in = new Scanner(System.in);
int i=0;
int[] amountOfFlowers=new int[flowers.size()];
for(Flower flower:flowers){
	String amount="";
System.out.printf("—колько цветов (%s) добавить в цветочную композицию? ",flower.getName());	
boolean isNumber=false;
do {
amount=in.next();
 try {
        Integer.parseInt(amount);
        isNumber=true;
    } catch (NumberFormatException e) {
        System.err.println("¬ведите число");
    }
}while (!isNumber);
amountOfFlowers[i]=Integer.parseInt(amount);
i++;
}
for (int j=0;j<amountOfFlowers.length;j++){
	for (int k=0;k<amountOfFlowers[j];k++){
		flowers.add(flowers.get(j));
	}
}
for (int j=0;j<amountOfFlowers.length;j++){
	flowers.remove(0);
}
}

public void print (){
System.out.printf("÷веточна€ композици€:\n");
System.out.printf("”паковка %s\n",packaking.getName());
		int count=1;
for (int i=0;i<flowers.size();i++){
	for (int j=i+1;j<flowers.size();j++){
if (flowers.get(i).getName()==flowers.get(j).getName()) count++;	
}
System.out.printf("%s %dшт\n",flowers.get(i).getName(),count);
i+=count-1;
count=1;
}

}

public static void main (String [] args) {
BouquetOfFlowers b1=new BouquetOfFlowers();

b1.check();
b1.addFlowers();
b1.checkPackaging();
b1.print();

}
}

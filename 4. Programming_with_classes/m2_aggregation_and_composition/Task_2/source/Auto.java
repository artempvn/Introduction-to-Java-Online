//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
//менять колесо, вывести на консоль марку автомобиля. 
import java.util.*;
import static java.lang.Math.*;
public class Auto {
private String model;
private Engine engine;
private double mileage;
private double fuelTank;
private Wheel[] wheels=new Wheel[4];
public Auto(String model,Engine engine, Wheel[] wheels){
this.model=model;
this.engine=engine;
this.wheels=wheels;
}

public double getMileage(){
	return mileage;
}
public double getFuelTank(){
	return fuelTank;
}
public void drive (double mile){
	if (fuelTank-8*mile/100<0){
		mile=(fuelTank/8)*100;
		fuelTank=0;
System.out.printf("Закончилось топливо\n");		
	} else fuelTank-=8*mile/100;
mileage+=mile;	
System.out.printf("Автомобиль проехал %.1f км\n",mile);	
	 
	
}

public void addFuel (double fuel){
	double prev=fuelTank;
	fuelTank+=fuel;
	if (fuelTank>80) fuelTank=80;
	System.out.printf("Автомобиль заправлен на %.1f л\n",(fuelTank-prev));
}

public void print(){
System.out.println("Марка: "+model);
System.out.println("Двигатель: "+engine.getCapacity()+" "+engine);
System.out.println("Колеса: ");
for (int i=0;i<wheels.length;i++){
System.out.print(wheels[i].getTyreSize()+" "+wheels[i]+" ");
}	
System.out.println();
System.out.println("Пробег: "+mileage);	
System.out.println("Уровень топлива: "+fuelTank);	
}
public void printModel(){
System.out.println("Марка: "+model);	
}

public void changeWheel (int wheel, Wheel newWheel){
System.out.println("Замена колеса "+wheels[wheel].getTyreSize()+" "+wheels[wheel]+" на колесо "+newWheel.getTyreSize()+" "+newWheel);
wheels[wheel]=newWheel;	
}


public static void main (String [] args) {
Wheel[] wheels=new Wheel[4];
for (int i=0;i<wheels.length;i++){
	wheels[i]=new Wheel("586");
}
Engine engine=new Engine("2.4");
Auto a=new Auto("Audi",engine,wheels);
a.printModel();
a.print();
Wheel w=new Wheel("586");
a.addFuel(1);
a.drive(80);
a.addFuel(80);
a.drive(100);
a.changeWheel(0,w);
a.print();
}
}

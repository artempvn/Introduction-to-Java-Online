// Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
//столицу, количество областей, площадь, областные центры. 
import java.util.*;
import static java.lang.Math.*;
public class Country {
private String name;
private double square;
private City capital;
private ArrayList<Region> regions=new ArrayList<Region>();

public String getName(){
	return name;
}
public City getCapital(){
	return capital;
}
public ArrayList<Region> getRegions(){
	return regions;
}
public double getSquare(){
	return square;
}

public Country(String name, Region...regions){ 
	this.name=name;
	for(Region r:regions){
	this.regions.add(r);	
	square+=r.getSquare();
	}
capital=this.regions.get(0).getAreas().get(0).getCities().get(0);
}

public void printCapital(){
	System.out.println("Столица: "+capital.getName());
}
public void countRegions(){
	System.out.println("Количество областей: "+regions.size());
}
public void printSquare(){
	System.out.printf("Площадь: %.2f \n",square);
}
public void printCapitals(){
	System.out.print("Областные центры: ");
	for(Region r:regions){
	System.out.print(r.getCapital().getName()+" ");
	}
	System.out.println("");
}


public static void main (String [] args) {
Area a1=new Area("Минский район",1902.66d,new City("Минск"),new City("Большевик"),new City("Жуковка"),new City("Зацень"));
Area a2=new Area("Вилейский район",12453.81d,new City("Вилейка"),new City("Любань"));
Region r1=new Region("Минская область",a1,a2);
a1=new Area("Витебский район",2737.85d,new City("Витебск"),new City("Вороны"),new City("Сураж"),new City("Руба"));
a2=new Area("Вилейский район",1707.7d,new City("Оршв"),new City("Лисуны"),new City("Копысь"),new City("Барань"));
Region r2=new Region("Витебская область",a1,a2);
Country c1=new Country("Белар",r1,r2);

c1.printCapital();
c1.countRegions();
c1.printSquare();
c1.printCapitals();
}
}




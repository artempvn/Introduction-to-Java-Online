// ������� ������ ������ �����������, ��������� ������ �������, �����, �����. ������: ������� �� ������� 
//�������, ���������� ��������, �������, ��������� ������. 
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
	System.out.println("�������: "+capital.getName());
}
public void countRegions(){
	System.out.println("���������� ��������: "+regions.size());
}
public void printSquare(){
	System.out.printf("�������: %.2f \n",square);
}
public void printCapitals(){
	System.out.print("��������� ������: ");
	for(Region r:regions){
	System.out.print(r.getCapital().getName()+" ");
	}
	System.out.println("");
}


public static void main (String [] args) {
Area a1=new Area("������� �����",1902.66d,new City("�����"),new City("���������"),new City("�������"),new City("������"));
Area a2=new Area("��������� �����",12453.81d,new City("�������"),new City("������"));
Region r1=new Region("������� �������",a1,a2);
a1=new Area("��������� �����",2737.85d,new City("�������"),new City("������"),new City("�����"),new City("����"));
a2=new Area("��������� �����",1707.7d,new City("����"),new City("������"),new City("������"),new City("������"));
Region r2=new Region("��������� �������",a1,a2);
Country c1=new Country("�����",r1,r2);

c1.printCapital();
c1.countRegions();
c1.printSquare();
c1.printCapitals();
}
}




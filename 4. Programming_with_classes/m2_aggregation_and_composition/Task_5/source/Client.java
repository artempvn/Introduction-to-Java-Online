//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
import java.util.*;
import static java.lang.Math.*;
public class Client {
	
private String name;
private ArrayList<Voucher> vouchers=new ArrayList<Voucher>();	
private ArrayList<Voucher> chosenVouchers=new ArrayList<Voucher>();

public Client(String name){
	this.name=name;
}
public Client(String name,Voucher...vouchers){
	this(name);
	for(Voucher v:vouchers){
	this.vouchers.add(v);	
	}
	for(Voucher v:vouchers){
	this.chosenVouchers.add(v);	
	}
}

class IdCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return new Integer(one.getId()).compareTo(two.getId());
	}
}
public  void function (ArrayList<Voucher> v){ //—ортировка по id
System.out.println("—ортировка по id путевки");
IdCompare idcom=new IdCompare();
Collections.sort(v,idcom);	
}
class TypeCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return one.getType().compareTo(two.getType());
	}
}
public  void function1 (ArrayList<Voucher> v){ //—ортировка по типу
System.out.println("—ортировка по типу путевки");
TypeCompare typcom=new TypeCompare();
Collections.sort(v,typcom);	
}
class TransportCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return one.getTransport().compareTo(two.getTransport());
	}
}
public  void function2 (ArrayList<Voucher> v){ //—ортировка по транспорту
System.out.println("—ортировка по типу транспорта");
TransportCompare trcom=new TransportCompare();
Collections.sort(v,trcom);	
}
class MealCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return one.getMeal().compareTo(two.getMeal());
	}
}
public  void function3 (ArrayList<Voucher> v){ //—ортировка по питанию
System.out.println("—ортировка по типу питани€");
MealCompare mlcom=new MealCompare();
Collections.sort(v,mlcom);	
}
class DaysCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return new Integer(one.getDays()).compareTo(two.getDays());
	}
}
public  void function4 (ArrayList<Voucher> v){ //—ортировка по дн€м
System.out.println("—ортировка по количеству дней");
DaysCompare dcom=new DaysCompare();
Collections.sort(v,dcom);	
}

public void search(){
	Scanner in=new Scanner(System.in);
	function1(vouchers);
	print(vouchers);
	System.out.printf("¬ведите тип путевки: \n");
	String t=in.next();
	for(Voucher v:vouchers){
	if (!v.getType().equals(t)) chosenVouchers.remove(v);
	}
	if (chosenVouchers.size()==0){
		System.out.println("ѕутевки не найдены");
		return;
	}
	function2(chosenVouchers);
	print(chosenVouchers);
	if (vouchers.size()==1)return;
	System.out.printf("¬ведите тип транспорта: \n");
	String t2=in.next();
	vouchers=new ArrayList<Voucher>();
	for(Voucher v:chosenVouchers){
	if (v.getTransport().equals(t2))vouchers.add(v);
	}
	if (vouchers.size()==0){
		System.out.println("ѕутевки не найдены");
		return;
	}

	function3(vouchers);
	print(vouchers);
		if (vouchers.size()==1)return;
	System.out.printf("¬ведите тип питани€: \n");
	t=in.next();
	chosenVouchers=new ArrayList<Voucher>();
	for(Voucher v:vouchers){
	if (v.getMeal().equals(t))chosenVouchers.add(v);
	}
	if (chosenVouchers.size()==0){
		System.out.println("ѕутевки не найдены");
		return;
	}
	function4(chosenVouchers);
	print(chosenVouchers);
	if (vouchers.size()==1)return;
	System.out.printf("¬ведите число дней: \n");
	t=in.next();
	vouchers=new ArrayList<Voucher>();
	for(Voucher v:chosenVouchers){
	if (v.getDays()==(Integer.parseInt(t))) vouchers.add(v);
	}
	if (vouchers.size()==0){
		System.out.println("ѕутевки не найдены");
		return;
	}
	print(vouchers);
}


public void print(ArrayList<Voucher> vo){
	for(Voucher v:vo){
	System.out.printf("id: %s; “ип путевки: %s; “ранспорт: %s; ѕитание: %s; „исло дней: %d; \n",v.getId(),v.getType(),v.getTransport(),v.getMeal(),v.getDays());	
	}
}


public static void main (String [] args) {
Voucher v1=new Voucher(1,"отдых","поезд","завтраки",5);
Voucher v2=new Voucher(2,"отдых","самолет","полное",9);
Voucher v3=new Voucher(3,"экскурсии","поезд","завтраки",4);
Voucher v4=new Voucher(4,"экскурсии","автобус","нет",6);
Voucher v5=new Voucher(5,"лечение","автобус","полное",14);
Voucher v6=new Voucher(6,"лечение","самолет","обеды",13);
Voucher v7=new Voucher(7,"шопинг","поезд","нет",2);
Voucher v8=new Voucher(8,"шопинг","автобус","нет",3);
Voucher v9=new Voucher(9,"круиз","лайнер","полное",10);
Voucher v10=new Voucher(10,"круиз","лайнер","полное",8);
Voucher v11=new Voucher(11,"отдых","самолет","обеды",13);
Client a=new Client(" лиент 1",v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11);
a.search();

}
}


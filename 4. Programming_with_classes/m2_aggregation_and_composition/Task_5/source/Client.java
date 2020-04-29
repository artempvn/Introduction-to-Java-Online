//������������� �������. ������������ ����� ����������� ������� �� ������ ������������� ������� 
//���������� ���� (�����, ���������, �������, ������, ����� � �. �.) ��� ������������ ������. ��������� 
//����������� ������ ����������, ������� � ����� ����. ����������� ����� � ���������� �������.
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
public  void function (ArrayList<Voucher> v){ //���������� �� id
System.out.println("���������� �� id �������");
IdCompare idcom=new IdCompare();
Collections.sort(v,idcom);	
}
class TypeCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return one.getType().compareTo(two.getType());
	}
}
public  void function1 (ArrayList<Voucher> v){ //���������� �� ����
System.out.println("���������� �� ���� �������");
TypeCompare typcom=new TypeCompare();
Collections.sort(v,typcom);	
}
class TransportCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return one.getTransport().compareTo(two.getTransport());
	}
}
public  void function2 (ArrayList<Voucher> v){ //���������� �� ����������
System.out.println("���������� �� ���� ����������");
TransportCompare trcom=new TransportCompare();
Collections.sort(v,trcom);	
}
class MealCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return one.getMeal().compareTo(two.getMeal());
	}
}
public  void function3 (ArrayList<Voucher> v){ //���������� �� �������
System.out.println("���������� �� ���� �������");
MealCompare mlcom=new MealCompare();
Collections.sort(v,mlcom);	
}
class DaysCompare implements Comparator<Voucher>{
	public int compare (Voucher one, Voucher two){
		return new Integer(one.getDays()).compareTo(two.getDays());
	}
}
public  void function4 (ArrayList<Voucher> v){ //���������� �� ����
System.out.println("���������� �� ���������� ����");
DaysCompare dcom=new DaysCompare();
Collections.sort(v,dcom);	
}

public void search(){
	Scanner in=new Scanner(System.in);
	function1(vouchers);
	print(vouchers);
	System.out.printf("������� ��� �������: \n");
	String t=in.next();
	for(Voucher v:vouchers){
	if (!v.getType().equals(t)) chosenVouchers.remove(v);
	}
	if (chosenVouchers.size()==0){
		System.out.println("������� �� �������");
		return;
	}
	function2(chosenVouchers);
	print(chosenVouchers);
	if (vouchers.size()==1)return;
	System.out.printf("������� ��� ����������: \n");
	String t2=in.next();
	vouchers=new ArrayList<Voucher>();
	for(Voucher v:chosenVouchers){
	if (v.getTransport().equals(t2))vouchers.add(v);
	}
	if (vouchers.size()==0){
		System.out.println("������� �� �������");
		return;
	}

	function3(vouchers);
	print(vouchers);
		if (vouchers.size()==1)return;
	System.out.printf("������� ��� �������: \n");
	t=in.next();
	chosenVouchers=new ArrayList<Voucher>();
	for(Voucher v:vouchers){
	if (v.getMeal().equals(t))chosenVouchers.add(v);
	}
	if (chosenVouchers.size()==0){
		System.out.println("������� �� �������");
		return;
	}
	function4(chosenVouchers);
	print(chosenVouchers);
	if (vouchers.size()==1)return;
	System.out.printf("������� ����� ����: \n");
	t=in.next();
	vouchers=new ArrayList<Voucher>();
	for(Voucher v:chosenVouchers){
	if (v.getDays()==(Integer.parseInt(t))) vouchers.add(v);
	}
	if (vouchers.size()==0){
		System.out.println("������� �� �������");
		return;
	}
	print(vouchers);
}


public void print(ArrayList<Voucher> vo){
	for(Voucher v:vo){
	System.out.printf("id: %s; ��� �������: %s; ���������: %s; �������: %s; ����� ����: %d; \n",v.getId(),v.getType(),v.getTransport(),v.getMeal(),v.getDays());	
	}
}


public static void main (String [] args) {
Voucher v1=new Voucher(1,"�����","�����","��������",5);
Voucher v2=new Voucher(2,"�����","�������","������",9);
Voucher v3=new Voucher(3,"���������","�����","��������",4);
Voucher v4=new Voucher(4,"���������","�������","���",6);
Voucher v5=new Voucher(5,"�������","�������","������",14);
Voucher v6=new Voucher(6,"�������","�������","�����",13);
Voucher v7=new Voucher(7,"������","�����","���",2);
Voucher v8=new Voucher(8,"������","�������","���",3);
Voucher v9=new Voucher(9,"�����","������","������",10);
Voucher v10=new Voucher(10,"�����","������","������",8);
Voucher v11=new Voucher(11,"�����","�������","�����",13);
Client a=new Client("������ 1",v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11);
a.search();

}
}


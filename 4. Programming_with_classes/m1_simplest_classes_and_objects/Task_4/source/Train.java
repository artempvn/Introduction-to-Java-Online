/*��������  �����  Train,  ����������  ����:  ��������  ������  ����������,  �����  ������,  �����  �����������. 
*�������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� 
*������� �������. ��������  ����������� ������ ���������� � ������,  ����� �������� ������ �������������. 
*��������  �����������  ����������  ������  ��  ������  ����������,  ������  ������  �  �����������  �������� 
*���������� ������ ���� ����������� �� ������� �����������.*/
import java.util.*;
public class Train {
String arrivalStation;
String number;
String departureTime;

public Train(){};
public Train(String trn){  
String[] a=trn.split("/");	
this.arrivalStation=a[0];
this.number=a[1];
this.departureTime=a[2];		
}
public static void print (Train train){
System.out.printf("%-15s %-7s %-7s \n",train.arrivalStation,train.number,train.departureTime);	
}
public static void print (ArrayList<Train> trains){
for (int i=0;i<trains.size();i++){
print(trains.get(i));
	}
System.out.printf("--------\n");	
}

class NumberCompare implements Comparator<Train>{
	public int compare (Train one, Train two){
		return one.number.compareTo(two.number);
	}
}
public  void function (ArrayList<Train> trains){ 
System.out.println("���������� �� ������ ������");
NumberCompare numcom=new NumberCompare();
Collections.sort(trains,numcom);	
}

public static void function1 (ArrayList<Train> trains,String num){ 
boolean b=true;
for (int i=0;i<trains.size();i++){
	if(trains.get(i).number.equals(num)){
print(trains.get(i));
b=false;
	}
	}
if(b) System.out.printf("����� �%s �� ������\n",num);
System.out.printf("--------\n");	
}


class ArrivalCompare implements Comparator<Train>{
	public int compare (Train one, Train two){
		if (one.arrivalStation.compareTo(two.arrivalStation)==0){
			return one.departureTime.compareTo(two.departureTime);
		} else
		
		return one.arrivalStation.compareTo(two.arrivalStation);
	}
}
public  void function2 (ArrayList<Train> trains){ 
System.out.println("���������� �� ������ ����������");
ArrivalCompare arrcom=new ArrivalCompare();
Collections.sort(trains,arrcom);	
}

public static void main (String [] args) {
String b="����/137/19:53\n�����/229/10:03\n����/216/13:06\n����/318/00:31\n����/069/13:05\n";
String[] a=b.split("\n");	
ArrayList<Train> trains=new ArrayList<Train>();
for (int i=0;i<a.length;i++){
	trains.add(new Train(a[i]));
}
print(trains);
new Train().function(trains);
print(trains);
Scanner in = new Scanner(System.in);
System.out.printf("������� ����� ������\n");
String num=in.next();
function1(trains,num);
new Train().function2(trains);
print(trains);
}
}









enum Flower {
f1("����"),	f2("�������"),	f3("�������"),	f4("������������"),	f5("����"),	f6("�������"),	f7("����������"),	f8("���������"),	f9("�������"),	f10("�������");

private String name;

Flower(String name){
this.name=name;
}
public String getName() {
       return name;
}
public static void print (){
	System.out.print("��������� ��������: ");
	for (Flower f:Flower.values()){
		System.out.print(f+" ");
	}
	System.out.println(" ");
}

public String toString() {
       return name;
}
}

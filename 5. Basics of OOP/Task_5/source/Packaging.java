enum Packaging {
p1("������"),	p2("�����"),	p3("������"),	p4("�������"),	p5("�����");

private String name;

Packaging(String name){
this.name=name;
}
public String getName() {
       return name;
}
public String toString() {
       return name;
}
public static void print (){
	System.out.print("��������� ��������: ");
	for (Packaging p:Packaging.values()){
		System.out.print(p+" ");
	}
	System.out.println(" ");
}
}

// �������� �����  � ������ Student, ����������  ����: ������� � ��������, ����� ������, ������������ (������ 
//�� ���� ���������). �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������ ������� � 
//������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.
public class Student {
String name;
String group;
int[] points=new int[5];

public Student(){};
public Student(String stud){  
String[] a=stud.split("/");	
this.name=a[0];
this.group=a[1];
for (int i=0;i<this.points.length;i++){
this.points[i]=Integer.parseInt(a[i+2]);
}		
}

public static void function (Student[] students){ 
	System.out.println("�������� � �������� �� ���� 9:");
	for (int j=0;j<students.length;j++){
		boolean tr=true;
	for (int i=0;i<students[j].points.length;i++){
		if (students[j].points[i]<9){
			tr=false;
		}
	}
	if(tr)System.out.printf("%-15s %-7s \n",students[j].name, students[j].group);
	}	
}

public static void main (String [] args) {
	String b="������ �.�./112121/9/9/9/10/9\n������� �.�./112121/9/6/9/7/9\n������� �.�./112122/7/9/9/3/4\n�������� �.�./112123/10/9/9/10/9\n������ �.�./112123/9/9/9/10/9\n������� �.�./112124/9/10/9/10/9\n������ �.�./112125/4/6/8/5/7\n�������� �.�./112125/3/4/7/6/6\n������� �.�./112123/7/9/9/8/9\n�������� �.�./112123/10/9/9/10/9\n";
	String[] a=b.split("\n");
Student[] students=new Student[10];
for (int i=0;i<students.length;i++){
	students[i]=new Student(a[i]);	
}
	function(students);

}
}









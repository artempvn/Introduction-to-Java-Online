enum Flower {
f1("Роза"),	f2("Гвозика"),	f3("Эустома"),	f4("Альстромерия"),	f5("Ирис"),	f6("Гербера"),	f7("Хризантема"),	f8("Гипсофила"),	f9("Статица"),	f10("Тюльпан");

private String name;

Flower(String name){
this.name=name;
}
public String getName() {
       return name;
}
public static void print (){
	System.out.print("Возможные варианты: ");
	for (Flower f:Flower.values()){
		System.out.print(f+" ");
	}
	System.out.println(" ");
}

public String toString() {
       return name;
}
}

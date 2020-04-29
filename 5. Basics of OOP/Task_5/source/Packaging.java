enum Packaging {
p1("Пленка"),	p2("Ткань"),	p3("Бумага"),	p4("Корзина"),	p5("Лента");

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
	System.out.print("Возможные варианты: ");
	for (Packaging p:Packaging.values()){
		System.out.print(p+" ");
	}
	System.out.println(" ");
}
}

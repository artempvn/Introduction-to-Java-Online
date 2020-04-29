class Warehouse {
private	int cargo;
private	int capacity;	

public Warehouse(int cargo,int capacity){
this.capacity=capacity;
this.cargo=cargo;	
}
public int getCargo(){
	return cargo;
}
public int getCapacity(){
	return capacity;
}	


public synchronized boolean tryLoadCargo(){
boolean isCargo=false;
	if(cargo>0){
		isCargo=true;
		cargo--;
		System.out.println("Контейнер отправлен на корабль. На складе осталось "+cargo+" контейнеров");	
	} 	
	return isCargo;
}	

public synchronized boolean tryUnLoadCargo(){
boolean isCargo=false;
	if(cargo<capacity){
		isCargo=true;
		cargo++;
		System.out.println("Контейнер получен. На складе "+cargo+" контейнеров");	
	} 	
	return isCargo;
}
}

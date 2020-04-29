class Customer {
private int id;
private String surname;
private String name;
private String secondName;
private String adress;
private int creditNum;
private int bankAcc;
public Customer(){} 
public Customer(String cst){  //Test
String[] a=cst.split("/");	
this.id=Integer.parseInt(a[0]);
this.surname=a[1];
this.name=a[2];	
this.secondName=a[3];
this.adress=a[4];
this.creditNum=Integer.parseInt(a[5]);
this.bankAcc=Integer.parseInt(a[6]);	
}
public Customer(int id, String surname, String name, String secondName, String adress, int creditNum, int bankAcc){  	
this.id=id;
this.surname=surname;
this.name=name;	
this.secondName=secondName;
this.adress=adress;
this.creditNum=creditNum;
this.bankAcc=bankAcc;	
}


public void setId(int id){
	this.id=id;
}
public void setSurname(String surname){
	this.surname=surname;
}
public void setName(String name){
	this.name=name;
}
public void setSecondname(String secondName){
	this.secondName=secondName;
}
public void setAdress(String adress){
	this.adress=adress;
}
public void setCreditNum(int creditNum){
	this.creditNum=creditNum;
}
public void setBankAcc(int bankAcc){
	this.bankAcc=bankAcc;
}
public int getId(){
	return id;
}
public String getSurname(){
	return surname;
}
public String getName(){
	return name;
}
public String getSecondName(){
	return secondName;
}
public String getAdress(){
	return adress;
}
public int getCreditNum(){
	return creditNum;
}
public int getBankAcc(){
	return bankAcc;
}
 public String toString() {
        return "id "+id+"; ФИО: "+surname+" "+name+" "+secondName+"; адрес: "+adress+"; номер кредитной карточки: "+creditNum+"; номер банковского счета: "+bankAcc+"\n";
    }
}






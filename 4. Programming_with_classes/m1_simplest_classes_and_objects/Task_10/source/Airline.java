class Airline {
private String destination;
private String number;
private String plane;
private String departureTime;
private String days;
public Airline(){} 
public Airline(String arln){ 
String[] a=arln.split("/");	
this.destination=a[0];
this.number=a[1];
this.plane=a[2];	
this.departureTime=a[3];
this.days=a[4];
	
}
public Airline(String destination, String number, String plane, String departureTime, String days){  	
this.destination=destination;
this.number=number;
this.plane=plane;	
this.departureTime=departureTime;
this.days=days;
}

public void setDestination(String destination){
	this.destination=destination;
}
public void setNumber(String number){
	this.number=number;
}
public void setPlane(String plane){
	this.plane=plane;
}
public void setDepartureTime(String departureTime){
	this.departureTime=departureTime;
}
public void setDays(String days){
	this.days=days;
}

public String getDestination(){
	return destination;
}
public String getNumber(){
	return number;
}
public String getPlane(){
	return plane;
}
public String getDepartureTime(){
	return departureTime;
}
public String getDays(){
	return days;
}
 public String toString() {
        return "Пункт назначения: "+destination+"; номер рейса: "+number+"; тип самолета: "+plane+"; время вылета: "+departureTime+"; дни недели: "+days+"\n";
    }
}






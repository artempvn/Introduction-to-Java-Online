class Case implements Comparable<Case>{
private String name;
private String secondName;
private String surname;
private String faculty;
private String group;
private String dormitoryStatus;

public Case(String name,String secondName, String surname, String faculty, String group, String dormitoryStatus){
this.name=name;
this.secondName=secondName;
this.surname=surname;
this.faculty=faculty;
this.group=group;
this.dormitoryStatus=dormitoryStatus;	
}

public String getName(){
	return name;
}
public String getSecondName(){
	return secondName;
}
public String getSurname(){
	return surname;
}
public String getFaculty(){
	return faculty;
}
public String getGroup(){
	return group;
}
public String getDormitoryStatus(){
	return dormitoryStatus;
}

public void setName(String name){
	this.name=name;
}
public void setSecondName(String secondName){
	this.secondName=secondName;
}
public void setSurname(String surname){
	this.surname=surname;
}
public void setFaculty(String faculty){
	this.faculty=faculty;
}
public void setGroup(String group){
	this.group=group;
}
public void setDormitoryStatus(String dormitoryStatus){
	this.dormitoryStatus=dormitoryStatus;
}


public int compareTo(Case o) {
int result=this.faculty.compareTo(o.faculty);
if (result==0) result=this.group.compareTo(o.group);
if (result==0) result=this.surname.compareTo(o.surname);
if (result==0) result=this.name.compareTo(o.name);
if (result==0) result=this.secondName.compareTo(o.secondName);
return result;
}
}

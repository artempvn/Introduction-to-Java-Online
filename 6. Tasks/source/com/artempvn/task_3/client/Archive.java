/*
*создайте клиент-серверное приложение “Архив”.
*Общие требования к заданию:
•  В архиве хранятся Дела (например, студентов). Архив находится на сервере.
•  Клиент, в зависимости от прав, может запросить дело на просмотр, внести в 
*него изменения, или создать новое дело.
*Требования к коду лабораторной работы:
•  Для реализации сетевого соединения используйте сокеты.
•  Формат хранения данных на сервере – xml-файлы.
*/
package com.artempvn.task_3.client;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.regex.*;
import java.net.*;

public class Archive {
private User currentUser;
private ArrayList<User> usersList=new ArrayList<User>();
private ArrayList<Case> casesList=new ArrayList<Case>();
private Scanner in=new Scanner(System.in);
public Archive(){
readUsersXml();	
readCasesXml();
}

public String getUserList(){
String message="";	
	try{
Socket archiveSocket=new Socket("127.0.0.1",5004);
InputStreamReader stream=new InputStreamReader(archiveSocket.getInputStream());
BufferedReader reader=new BufferedReader(stream);
message=reader.readLine();
reader.close();
	}catch (IOException ex){ex.printStackTrace();}
return message;	
}

public void sendUserList(String message){	
	try{
Socket archiveSocket=new Socket("127.0.0.1",5006);
PrintWriter writer=new PrintWriter(new OutputStreamWriter(archiveSocket.getOutputStream()));
writer.println(message);
writer.close();
	}catch (IOException ex){ex.printStackTrace();}	
}

public void sendCasesList(String message){	
	try{
Socket archiveSocket=new Socket("127.0.0.1",5007);
PrintWriter writer=new PrintWriter(new OutputStreamWriter(archiveSocket.getOutputStream()));
writer.println(message);
writer.close();
	}catch (IOException ex){ex.printStackTrace();}	
}

public String getCasesList(){
String message="";	
	try{
Socket archiveSocket=new Socket("127.0.0.1",5005);
InputStreamReader stream=new InputStreamReader(archiveSocket.getInputStream());
BufferedReader reader=new BufferedReader(stream);
message=reader.readLine();
reader.close();
	}catch (IOException ex){ex.printStackTrace();}
return message;	
}

public void readUsersXml(){
usersList=new ArrayList<User>();	
Pattern ptrn1 = Pattern.compile("(?<=<user>).*?(?=</user>)");
Pattern ptrn2 = Pattern.compile("(?<=<login>).*?(?=</login>)");
Pattern ptrn3 = Pattern.compile("(?<=<password>).*?(?=</password>)");
Pattern ptrn4 = Pattern.compile("(?<=<isAdmin>).*?(?=</isAdmin>)");
String s=getUserList();
Matcher m1 = ptrn1.matcher(s);
while (m1.find()){
	  String s1=s.substring(m1.start(), m1.end());
	  Matcher m2 = ptrn2.matcher(s1);
	  Matcher m3 = ptrn3.matcher(s1);
	  Matcher m4 = ptrn4.matcher(s1);
	  String login="";
	  if (m2.find()) login=s1.substring(m2.start(), m2.end());
	  String password="";
	  if (m3.find()) password=s1.substring(m3.start(), m3.end());
	  String isAdmin="";
	  if (m4.find()) isAdmin=s1.substring(m4.start(), m4.end());
	  usersList.add(new User(login,password,isAdmin));
 }
}


public void writeUsersXml(){
String message="";
message=message.concat("<?xml version=\"1.0\" encoding=\"Windows-1251\"?>");
message=message.concat("<Users>");
for (User u:usersList){
message=message.concat("<user>");
message=message.concat("<login>"+u.getLogin()+"</login>"+"<password>"+u.getPassword()+"</password>"+"<isAdmin>"+u.getAdmin()+"</isAdmin>");	
message=message.concat("</user>");
}
message=message.concat("</Users>");
sendUserList(message);
}


public void readCasesXml(){
casesList=new ArrayList<Case>();
Pattern ptrn1 = Pattern.compile("(?<=<Faculties).*?(?=</Faculties>)");
Pattern namePtrn = Pattern.compile("(?<=name=\").*?(?=\")");
Pattern ptrn2 = Pattern.compile("(?<=<Groups).*?(?=</Groups>)");
Pattern ptrn3 = Pattern.compile("(?<=<case>).*?(?=</case>)");
Pattern ptrn4 = Pattern.compile("(?<=<name>).*?(?=</name>)");
Pattern ptrn5 = Pattern.compile("(?<=<secondName>).*?(?=</secondName)");
Pattern ptrn6 = Pattern.compile("(?<=<surname>).*?(?=</surname)");
Pattern ptrn7 = Pattern.compile("(?<=<dormitoryStatus>).*?(?=</dormitoryStatus)");
String s=getCasesList();
Matcher m1 = ptrn1.matcher(s);
while (m1.find()){
	String faculty="";
	  String s1=s.substring(m1.start(), m1.end());
	  Matcher name1=namePtrn.matcher(s1);
	  if (name1.find()) faculty=s1.substring(name1.start(), name1.end()); 
	  Matcher m2 = ptrn2.matcher(s1);
	  while (m2.find()){
	  String group="";
	   String s2=s1.substring(m2.start(), m2.end());
	   name1=namePtrn.matcher(s2);
	  if (name1.find()) group=s2.substring(name1.start(), name1.end());
	Matcher m3 = ptrn3.matcher(s2);	  
	   while (m3.find()){
	 String s3=s2.substring(m3.start(), m3.end());
	  Matcher m4 = ptrn4.matcher(s3);
	  Matcher m5 = ptrn5.matcher(s3);
	  Matcher m6 = ptrn6.matcher(s3);
	  Matcher m7 = ptrn7.matcher(s3);	  
	  String name="";
	  if (m4.find()) name=s3.substring(m4.start(), m4.end());
	  String secondName="";
	  if (m5.find()) secondName=s3.substring(m5.start(), m5.end());
	  String surname="";
	  if (m6.find()) surname=s3.substring(m6.start(), m6.end());
	  String dormitoryStatus="";
	  if (m7.find()) dormitoryStatus=s3.substring(m7.start(), m7.end());
	  casesList.add(new Case(name,secondName,surname,faculty,group,dormitoryStatus));
	   } 
}
 }
}


public void writeCasesXml(){
HashSet<String> faculties=new HashSet<String>();
for (Case c:casesList){
	faculties.add(c.getFaculty());
}	
HashSet<String> groups=new HashSet<String>();		
for (Case c:casesList){
	groups.add(c.getGroup());
}
String[][] facultiesGroups=new String[faculties.size()][groups.size()+1];
int it=0;
for(String s:faculties){
int j=0;
facultiesGroups[it][j]=s;
	for(String s1:groups){
	for(Case c:casesList){
	if(c.getFaculty().equals(s)){
	if (c.getGroup().equals(s1)){
		j++;
		facultiesGroups[it][j]=s1;
		break;
	}
	}
	}		
	}
	it++;
}
String[][] facultiesGroupsNew=new String[faculties.size()][];
for (int i=0;i<facultiesGroups.length;i++){
	int count=0;
for (int j=0;j<facultiesGroups[i].length;j++){	
if (facultiesGroups[i][j]!=null) count++;
}
facultiesGroupsNew[i]=new String[count];	
}

for (int i=0;i<facultiesGroups.length;i++){
	int count=0;
for (int j=0;j<facultiesGroupsNew[i].length;j++){	
facultiesGroupsNew[i][j]=facultiesGroups[i][j];
}	
}
String message="";
message=message.concat("<?xml version=\"1.0\" encoding=\"Windows-1251\"?>");
message=message.concat("<Cases>");
for (int i=0;i<facultiesGroupsNew.length;i++){
message=message.concat("<Faculties name=\""+facultiesGroupsNew[i][0]+"\">");	
for (int j=1;j<facultiesGroupsNew[i].length;j++ ){
message=message.concat("<Groups name=\""+facultiesGroupsNew[i][j]+"\">");
for (Case c:casesList){
	if (c.getFaculty().equals(facultiesGroupsNew[i][0])&&c.getGroup().equals(facultiesGroupsNew[i][j])){
message=message.concat("<case>");
message=message.concat("<name>"+c.getName()+"</name>"+"<secondName>"+c.getSecondName()+"</secondName>"+"<surname>"+c.getSurname()+"</surname>"+"<dormitoryStatus>"+c.getDormitoryStatus()+"</dormitoryStatus>");	
message=message.concat("</case>");
	}
}
message=message.concat("</Groups>");
}
message=message.concat("</Faculties>");
}
message=message.concat("</Cases>");
sendCasesList(message);
}

public void login(){
clear();
System.out.println("Архив дел студентов");
List<String> l=new ArrayList<String>();
	String next="";
	boolean findUser=false;
	boolean pass=false;
	do{
	do{
	if (usersList.size()==0){
	System.out.println("Создание нового администратора");
	addUser("true");
	}	
	System.out.printf("1.Авторизация\n2.Создание нового пользователя\n");
	next=in.next();
	}while (!next.equals("1")&&!next.equals("2"));
	if (next.equals("1")){
		System.out.printf("Введите логин\n");
		next=in.next();
		for (User u:usersList){
			if(u.getLogin().equals(next)) {
				findUser=true;
				System.out.printf("Введите пароль\n");
				next=in.next();
				if(u.getPassword().equals(next)){
				pass=true;
				currentUser=u;
				System.out.printf("Добро пожаловать\n");
                break;				
				} else System.out.printf("Введен неверный пароль\n");
			}
		}
		if (!findUser) System.out.printf("Такого пользователя не существует\n");	
	} else addUser("false");
} while(!pass);
clear();
mainMenu();
}

public void addUser(String isAdmin){  
System.out.println("Введите желаемый логин");
boolean incorrectLogin=false;
String login=null;
do {
incorrectLogin=false;
login=in.next();
for (User user:usersList){
if(user.getLogin().equals(login)){
	System.out.println("Такой пользователь уже создан. Введите другой логин");
	incorrectLogin=true;
}
}
}while(incorrectLogin);
System.out.println("Введите желаемый пароль");
String password=in.next();
User u=new User(login,password,isAdmin);
usersList.add(u);
writeUsersXml();	
System.out.printf("Пользователь %s успешно создан\n",login);
}


public void mainMenu(){
clear();
System.out.println("0.Обновить данные");
System.out.println("1.Просмотр дел");	
System.out.println("2.Смена пользователя");	
if (currentUser.getAdmin().equals("true")){
System.out.println("3.Добавить дело");
System.out.println("4.Добавить нового администратора");
}
int choise=in.nextInt();
switch(choise){
	case 0:
	readUsersXml();	
	readCasesXml();
	mainMenu();
	break;
	case 1:
	casesViewer();
	break;
	case 2:
	login();
	break;
	case 3 :
	if (currentUser.getAdmin().equals("true")) addCase();
	mainMenu();
	break;
	case 4 :
	if (currentUser.getAdmin().equals("true")) addUser("true");
	mainMenu();
	break;
	default:
	mainMenu();
	break;
}
}

public void addCase(){ 
clear(); 
System.out.println("Введите факультет");
String faculty=in.nextLine();
faculty=in.nextLine();
System.out.println("Введите группу");
String group=in.nextLine();
System.out.println("Введите фамилию");
String surname=in.nextLine();
System.out.println("Введите имя");
String name=in.nextLine();
System.out.println("Введите отчество");
String secondName=in.nextLine();
System.out.println("Введите статус общежития (нуждается/не нуждается/проживает)");
String dormitoryStatus="";
do{
dormitoryStatus=in.nextLine();	
} while(!dormitoryStatus.equals("нуждается")&&!dormitoryStatus.equals("не нуждается")&&!dormitoryStatus.equals("проживает"));
Case c=new Case(name,secondName,surname,faculty,group,dormitoryStatus);
System.out.printf("Дело успешно добавлено в архив. Введите любой символ для продолжения.\n");
casesList.add(c);
Collections.sort(casesList);
writeCasesXml();
String s=in.next();
clear();
}

public void casesViewer(){
clear();
if (casesList.size()==0){
System.out.println("Архив пуст. Введите любой символ для продолжения.");
String s=in.next();
mainMenu();
return;	
}
int count=1;
Collections.sort(casesList);
for(Case c:casesList){
	System.out.printf("%d. %-8s %-8s %-8s %-8s %-8s\n",count,c.getFaculty(),c.getGroup(),c.getSurname(),c.getName(),c.getSecondName());
	count++;
}
casesViewerMenu();
}

public void casesViewerMenu(){
System.out.println("----------------");
System.out.println("Выберите дело или вернитесь назад(0)");
String choise="";	
int choiseInt=0;
boolean check=false;
do{
check=false;	
choise=in.nextLine();	
try{
choiseInt=Integer.parseInt(choise);
}catch (NumberFormatException e) {check=true;}
if(choiseInt<0||choiseInt>casesList.size()) check=true;
}while(check);
if (choiseInt==0) {
	mainMenu();
} else caseViewer(choiseInt-1);
}

public void caseViewer(int number){
	clear();
Case c=casesList.get(number);
System.out.printf("%-12s %s\n%-12s %s\n%-12s %s %s %s\n%-12s %s\n","Факультет:",c.getFaculty(),"Группа:",c.getGroup(),"ФИО:",c.getSurname(),c.getName(),c.getSecondName(),"Общежитие:",c.getDormitoryStatus());
System.out.println("--------");
System.out.println("Вернуться в каталог(0)");
if (currentUser.getAdmin().equals("true")){
System.out.println("Удалить дело из архива(1)");
System.out.println("Изменить факультет(2)");
System.out.println("Изменить группу(3)");
System.out.println("Изменить фамилию(4)");
System.out.println("Изменить имя(5)");
System.out.println("Изменить отчество(6)");
System.out.println("Изменить статус общежития(7)");	
} 
String choise=in.nextLine();
switch(choise){
	case "0":
	casesViewer();
	break;
	case "1":
	if (currentUser.getAdmin().equals("true")){
	casesList.remove(c);
	writeCasesXml();
	System.out.println("Дело удалено. Введите любой символ для продолжения.");
	String title=in.nextLine();		
	}
	casesViewer();
	break;
	case "2":
	if (currentUser.getAdmin().equals("true")){
	System.out.println("Введите название факультета");
	String faculty=in.nextLine();
	c.setFaculty(faculty);
	writeCasesXml();	
	}
	caseViewer(number);
	break;
		case "3":
	if (currentUser.getAdmin().equals("true")){
	System.out.println("Введите номер группы");
	String group=in.nextLine();
	c.setGroup(group);
	writeCasesXml();	
	}
	caseViewer(number);
	break;
		case "4":
	if (currentUser.getAdmin().equals("true")){
	System.out.println("Введите фамилию");
	String surname=in.nextLine();
	c.setSurname(surname);
	writeCasesXml();	
	}
	caseViewer(number);
	break;
		case "5":
	if (currentUser.getAdmin().equals("true")){
	System.out.println("Введите имя");
	String name=in.nextLine();
	c.setName(name);
	writeCasesXml();	
	}
	caseViewer(number);
	break;
		case "6":
	if (currentUser.getAdmin().equals("true")){
	System.out.println("Введите отчество");
	String secondName=in.nextLine();
	c.setSecondName(secondName);
	writeCasesXml();	
	}
	caseViewer(number);
	break;
		case "7":
	if (currentUser.getAdmin().equals("true")){
	System.out.println("Введите статус общежития (нуждается/не нуждается/проживает)");
	String dormitoryStatus="";
	do{
	dormitoryStatus=in.nextLine();	
	} while(!dormitoryStatus.equals("нуждается")&&!dormitoryStatus.equals("не нуждается")&&!dormitoryStatus.equals("проживает"));
	c.setDormitoryStatus(dormitoryStatus);
	writeCasesXml();	
	}
	caseViewer(number);
	break;
	default:
	casesViewer();
	break;
}	
}

public void clear(){
try{
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} catch (Exception ex){}	
}

public static void main (String [] args) {
Archive a=new Archive();
a.login();
}
}

/*создать консольное приложение “Учет книг в домашней библиотеке”.
*Общие требования к заданию:
•  Система учитывает книги как в электронном, так и в бумажном варианте.
•  Существующие роли: пользователь, администратор.
•  Пользователь может просматривать книги в каталоге книг, осуществлять поиск 
книг в каталоге. 
•  Администратор может модифицировать каталог.
•  *При добавлении описания книги в каталог оповещение о ней рассылается на 
e-mail всем пользователям
•  **При просмотре каталога желательно реализовать постраничный просмотр
•  ***Пользователь может предложить добавить книгу в библиотеку, переслав её 
администратору на e-mail.
•  Каталог книг хранится в текстовом файле.
•  Данные аутентификации пользователей хранятся в текстовом файле. Пароль 
*не хранится в открытом виде
*/
package com.artempvn.task_1;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class HomeLibrary {
private String path="D:\\Java\\Git\\Introduction-to-Java-Online\\Introduction-to-Java-Online\\6. Tasks\\Task_1";
private Path users=Paths.get(path+"\\users.txt");
private Path catalog=Paths.get(path+"\\catalog.txt");
private User currentUser;
private ArrayList<User> usersList=new ArrayList<User>();
private ArrayList<Book> catalogList=new ArrayList<Book>();
private ArrayList<Book> bookList;
private Scanner in=new Scanner(System.in);

public HomeLibrary(){
	try{
Files.createDirectories(Paths.get(path));
	} catch (IOException e){e.printStackTrace();}
try {
Files.createFile(users);
	} catch (Exception ex){}
try {
Files.createFile(catalog);
	} catch (Exception ex){}
readUsers();
readCatalog();	
}

public void readUsers(){
	try{
List<String> l=Files.readAllLines(users);
for (String s:l){
String[] user=s.split("/");
usersList.add(new User(user[0],decoder(user[1]),user[2],user[3]));
}
	} catch (Exception ex) {System.err.println("Файл не найден");}
}

public void writeUsers(){
	try{
BufferedWriter writer=Files.newBufferedWriter(users);
writer.write("");
writer.close();
writer=Files.newBufferedWriter(users,StandardOpenOption.APPEND);
for (User u:usersList){
writer.write(u.getLogin()+"/"+coder(u.getPassword())+"/"+u.getEmail()+"/"+u.getAdmin());
writer.newLine();	
}
writer.close();
	} catch (Exception ex) {System.err.println("Файл не найден");}
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
System.out.println("Введите вашу почту");
String email=in.next();
User u=new User(login,password,email,isAdmin);
usersList.add(u);
writeUsers();	
System.out.printf("Пользователь %s успешно создан\n",login);
}

public void start(){
clear();
login();
}

public void login(){
clear();
System.out.println("Учет книг в домашней библиотеке");
List<String> l=new ArrayList<String>();
	String next="";
	boolean findUser=false;
	boolean pass=false;
	do{
	do{
try{
l=Files.readAllLines(users);
}catch (Exception ex) {System.err.println("Файл не найден");}
	if (l.size()==0){
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

public void readCatalog(){
	try{
List<String> l=Files.readAllLines(catalog);
for (String s:l){
String[] book=s.split("/");
catalogList.add(new Book(book[0],book[1],book[2]));
}
if(l.size()==0) System.out.println("Каталог пуст");
	} catch (Exception ex) {ex.printStackTrace();}
}

public void writeCatalog(){
	try{
BufferedWriter writer=Files.newBufferedWriter(catalog);
writer.write("");
writer.close();
writer=Files.newBufferedWriter(catalog,StandardOpenOption.APPEND);
for (Book b:catalogList){
writer.write(b.getInfo());
writer.newLine();	
}
writer.close();
	} catch (Exception ex) {System.err.println("Файл не найден");}
}

public void addBook(){ 
clear(); 
System.out.println("Введите название");
String title=in.nextLine();
title=in.nextLine();
System.out.println("Введите автора");
String author=in.nextLine();
String type="";
do{
System.out.println("Введите тип (электронный/бумажный)");
type=in.next();
}while (!type.equals("электронный")&&!type.equals("бумажный"));
String choise="";
String description="";
do{
System.out.println("Ввести описание сейчас?(да/нет)");
choise=in.next();
}while (!choise.equals("да")&&!choise.equals("нет"));
Book b=null;
if (choise.equals("да")){
System.out.println("Введите описание");
description=in.nextLine();
description=in.nextLine();	
b=new Book(title,author,type,description);
} else b=new Book(title,author,type);
System.out.printf("Книга %s успешно добавлена в каталог. Введите любой символ для продолжения.\n",title);
catalogList.add(b);
Collections.sort(catalogList);
writeCatalog();
String s=in.next();
clear();
}

public void mainMenu(){
clear();
System.out.println("1.Просмотр каталога книг");	
System.out.println("2.Смена пользователя");	
if (currentUser.getAdmin().equals("true"))System.out.println("3.Редактирование каталога");
int choise=in.nextInt();
switch(choise){
	case 1:
	catalogMenu();
	break;
	case 2:
	login();
	break;
	case 3 :
	if (currentUser.getAdmin().equals("true")) adminPanel();
	else mainMenu();
	break;
	default:
	mainMenu();
	break;
}
}

public void adminPanel(){
clear();
System.out.println("1.Добавление книги");	
System.out.println("2.Добавление нового администратора");
System.out.println("3.Предыдущее меню");
String choise=in.next();
switch(choise){
	case "1":
	addBook();
	adminPanel();
	break;
	case "2" :
	addUser("true");
	adminPanel();
	case "3":
	mainMenu();
	break;
	default:
	adminPanel();
	break;
}		
}

public void catalogMenu(){
clear();
System.out.println("1.Показать все книги");	
System.out.println("2.Показать книги только в бумажном варианте");	
System.out.println("3.Показать книги только в электронном варианте");
System.out.println("4.Поиск книги");
System.out.println("5.Предыдущее меню");	
String choise=in.next();
switch(choise){
	case "1":
	catalogViewer("all");
	break;
	case "2":
	catalogViewer("бумажный");
	break;
	case "3" :
	catalogViewer("электронный");
	case "4":
	bookFinder();
	break;
	case "5":
	mainMenu();
	break;
	default:
	adminPanel();
	break;
}
}

public void catalogViewerMenu(){
System.out.println("----------------");
System.out.println("Выберите книгу или вернитесь назад(0)");
String choise="";	
int choiseInt=0;
boolean check=false;
do{
check=false;	
choise=in.next();	
try{
choiseInt=Integer.parseInt(choise);
}catch (NumberFormatException e) {check=true;}
if(choiseInt<0||choiseInt>bookList.size()) check=true;
}while(check);
if (choiseInt==0) {
	mainMenu();
} else bookViewer(choiseInt-1);
}


public void catalogViewer(String choise){
	clear();
bookList=new ArrayList<Book>();
int count=1;
for(Book b:catalogList)	{
	if (choise.equals(b.getType())||choise.equals("all")){
	System.out.printf("%d. %s\n",count,b.getTitle());
	count++;
	bookList.add(b);
	}
}
if (bookList.size()==0){
System.out.println("Книг не найдено. Введите любой символ для продолжения.");
String s=in.next();
catalogMenu();	
} else catalogViewerMenu();
}

public void bookFinder(){
	clear();
bookList=new ArrayList<Book>();
System.out.println("Введите название или автора");
String title=in.nextLine();
title=in.nextLine();
int count=1;
boolean find=false;
for(Book b:catalogList)	{
	if (b.getTitle().contains(title)||b.getAuthor().contains(title)){
	System.out.printf("%d. %s\n",count,b.getTitle());
	find=true;
	count++;
	bookList.add(b);
	}
}
if(!find) {
System.out.println("Данная книга не найдена. Введите любой символ для продолжения.");
title=in.next();
mainMenu();
} else catalogViewerMenu();
}

public void bookViewer(int number){
	clear();
Book b=bookList.get(number);
System.out.printf("%s\n%s\n%s\n%s\n",b.getTitle(),b.getAuthor(),b.getType(),b.getDescription());
System.out.println("--------");
System.out.println("Вернуться в каталог(0)");
if (currentUser.getAdmin().equals("true")) System.out.println("Удалить книгу из каталога(1)");
String choise=in.next();
switch(choise){
	case "0":
	catalogMenu();
	break;
	case "1":
	if (currentUser.getAdmin().equals("true")){
	delBook(number);	
	}
	catalogMenu();
	break;
	default:
	catalogMenu();
	break;
}	
}

public void delBook(int number){
Book b=bookList.get(number);
catalogList.remove(b);
writeCatalog();
System.out.println("Книга удалена из каталога. Введите любой символ для продолжения.");
String title=in.next();	
}

public void clear(){
try{
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} catch (Exception ex){}	
}

private String coder(String password){
char[]ch=password.toCharArray();
String newpass="";
for(char c:ch){
c+=174;
newpass=newpass.concat(Character.toString(c));
}
return newpass;
}

private String decoder(String newpass){
char[]ch=newpass.toCharArray();
String password="";
for(char c:ch){
c-=174;
password=password.concat(Character.toString(c));
}
return password;
}

public static void main (String [] args) {
HomeLibrary h=new HomeLibrary();
h.start();

}
}

/*
*Блокнот.  Разработать консольное приложение, работающее с Заметками
*в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение). 
*Общие пояснения к практическому заданию.
•  В  начале  работы  приложения  данные  должны  считываться  из  файла,  в  конце
работы – сохраняться в файл.
•  У  пользователя  должна  быть  возможность  найти  запись  по  любому  параметру 
*или  по  группе  параметров  (группу  параметров  можно  определить 
*самостоятельно),  получить  требуемые  записи  в  отсортированном  виде,  найти 
*записи,  текстовое  поле  которой  содержит  определенное  слово,  а  также 
*добавить новую запись.
•  Особое  условие:  поиск,  сравнение  и  валидацию  вводимой  информации 
*осуществлять с использованием регулярных выражений.
•  Особое  условие:  проверку  введенной  информации  на  валидность  должен 
*осуществлять код, непосредственно добавляющий информацию.
*/
import java.util.*;
import java.io.*;
import java.nio.file.*;
import static java.lang.Math.*;
import java.util.regex.*;

public class Notepad {
private String path="D:\\Java\\Git\\Introduction-to-Java-Online\\Introduction-to-Java-Online\\6. Tasks\\Task_2";
private Path notepad=Paths.get(path+"\\notepad.txt");
private ArrayList<Note> notesList=new ArrayList<Note>();
private ArrayList<Note> notesSpList;
private Scanner in=new Scanner(System.in);
private String sortChoise;

public Notepad(){
	try{
Files.createDirectories(Paths.get(path));
	} catch (IOException e){e.printStackTrace();}
try {
Files.createFile(notepad);
	} catch (Exception ex){}
readNotes();	
}

public void start(){
clear();
mainMenu();
}

public void readNotes(){
	try{
List<String> l=Files.readAllLines(notepad);
for (String s:l){
String[] note=s.split("/");
notesList.add(new Note(note[0],note[1],note[2],note[3]));
}
if(l.size()==0) System.out.println("Заметок нет.");
	} catch (Exception ex) {ex.printStackTrace();}
}

public void writeNotes(){
	try{
BufferedWriter writer=Files.newBufferedWriter(notepad);
writer.write("");
writer.close();
writer=Files.newBufferedWriter(notepad,StandardOpenOption.APPEND);
for (Note n:notesList){
writer.write(n.getTitle()+"/"+n.getDate()+"/"+n.getEmail()+"/"+n.getMessage());
writer.newLine();	
}
writer.close();
	} catch (Exception ex) {System.err.println("Файл не найден");}
}

public void addNote(){
clear(); 
System.out.println("Введите тему");
String title=in.nextLine();
title=in.nextLine();
System.out.println("Введите дату создания в формате дд.мм.гггг");
String date="";
do{
date=in.nextLine();
}while (!checkDate(date));
System.out.println("Введите e-mail");
String email="";
do{
email=in.nextLine();
}while(!checkEmail(email));
System.out.println("Введите сообщение");
String message=in.nextLine();
Note n=new Note(title,date,email,message);
notesList.add(n);
System.out.printf("Заметка успешна добавлена в блокнот. Введите любой символ для продолжения.\n",title);
String s=in.next();
mainMenu();
}

public void mainMenu(){
clear();
System.out.println("1.Просмотр заметок");	
System.out.println("2.Добавить заметку");	
System.out.println("3.Выйти из приложения");
String choise=in.next();
switch(choise){
	case "1":
	viewMenu();
	break;
	case "2":
	addNote();
	break;
	case "3" :
	writeNotes();
	break;
	default:
	mainMenu();
	break;
}
}

public void viewMenu(){ 
clear();
System.out.println("1.Показать все заметки");	
System.out.println("2.Поиск заметок по теме");	
System.out.println("3.Поиск заметок по дате");
System.out.println("4.Поиск заметок по e-mail");
System.out.println("5.Поиск заметок по определенному слову");
System.out.println("6.Поиск заметок по группе параметров");
System.out.println("0.Вернуться в предыдущее меню");	
String choise=in.next();
String s="";
String ss="";
switch(choise){
	case "0":
	mainMenu();
	break;
	case "1":
	notesViewer("all","");
	break;
	case "2":
	System.out.println("Введите слово или его часть для поиска темы");
	s=in.next();
	notesViewer("title",s);
	break;
	case "3" :
	System.out.println("Введите дату создания в формате дд.мм.гггг (на месте ненужных цифр поставьте прочерки(-))");
	do{
	s=in.next();
	}while(!checkSearchDate(s));
	notesViewer("date",s);
	break;
	case "4":
	System.out.println("Введите e-mail или его часть");
	s=in.next();
	notesViewer("email",s);
	break;
	case "5":
	System.out.println("Введите слово или его часть для поиска заметки");
	s=in.next();
	notesViewer("message",s);
	break;
	case "6":
	do{
	System.out.println("Введите номера параметров, перечисленных выше");
	s=in.next();
	Pattern ptrn1 = Pattern.compile("[2345]");	
	Matcher m1 = ptrn1.matcher(s);
	for(int i=0;i<s.length();i++){
	if (m1.find()){
	  ss=ss.concat(s.substring(m1.start(), m1.end()));
	}
	}
}while (ss.length()<1);
	notesViewer("group",ss);
	break;
	default:
	viewMenu();
	break;
}
}

public void notesViewer(String choise,String searchWord){
clear();
boolean isDate=false;
Pattern ptrn1=Pattern.compile("\\.+");
Matcher m1=null;
String title="";
String date="";
String email="";
String message="";
if (choise.equals("date")){
String s=searchWord.replaceAll("-","[0-9]");
ptrn1 = Pattern.compile(s);	
} 
if (choise.equals("group")){
if(searchWord.contains("2")){
System.out.println("Введите слово или его часть для поиска темы");
	title=in.next();
}
if(searchWord.contains("3")){
isDate=true;	
	System.out.println("Введите дату создания в формате дд.мм.гггг (на месте ненужных цифр поставьте прочерки(-))");
	do{
	date=in.next();
	}while(!checkSearchDate(date));
	String s=date.replaceAll("-","[0-9]");
ptrn1 = Pattern.compile(s);	
}	
if(searchWord.contains("4")){
	System.out.println("Введите e-mail или его часть");
	email=in.next();
}
if(searchWord.contains("5")){
	System.out.println("Введите слово или его часть для поиска заметки");
	message=in.next();
}		
}
notesSpList=new ArrayList<Note>();
int count=1;
for(Note n:notesList){
	
	if (choise.equals("all")){
	System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
	count++;
	notesSpList.add(n);
	}
	
	if (choise.equals("title")&&n.getTitle().contains(searchWord)){
	System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
	count++;
	notesSpList.add(n);
	}
	
	if (choise.equals("date")){
	m1 = ptrn1.matcher(n.getDate());
	if(m1.matches()){
	System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
	count++;
	notesSpList.add(n);
	}
	}
	
	if (choise.equals("email")&&n.getEmail().contains(searchWord)){
	System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
	count++;
	notesSpList.add(n);
	}
	
	if (choise.equals("message")&&n.getMessage().contains(searchWord)){
	System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
	count++;
	notesSpList.add(n);
	}
	
	if (choise.equals("group")&&n.getTitle().contains(title)&&n.getEmail().contains(email)&&n.getMessage().contains(message)){
	if (isDate) {
		m1 = ptrn1.matcher(n.getDate());
		if(m1.matches()){
			System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
			count++;
	notesSpList.add(n);
	}
	}else {
	System.out.printf("%d. %s %s %s\n",count,n.getTitle(),n.getEmail(),n.getDate());
	count++;
	notesSpList.add(n);
	}
	}
}
if (notesSpList.size()==0){
System.out.println("Заметок не найдено. Введите любой символ для продолжения.");
String s=in.next();
viewMenu();	
} else notesViewerMenu();
}

public void notesViewerMenu(){
System.out.println("----------------");
System.out.println("Выберите заметку или вернитесь назад(0)");
System.out.println("----------------");
System.out.println("Сортировка:тема(т), дата(д), e-mail(п)");
String choise="";	
int choiseInt=0;
boolean check=false;
do{
check=false;	
choise=in.next();
if(choise.equals("т")||choise.equals("д")||choise.equals("п")){
check=true;	
switch(choise){
case "т":
	Collections.sort(notesList,new TitleCompare());
	break;
	case "д":
	Collections.sort(notesList,new DateCompare());
	break;
	case "п":
	Collections.sort(notesList,new EmailCompare());
	break;	
}
notesViewer("all","");
return;
} else {
try{
choiseInt=Integer.parseInt(choise);
}catch (NumberFormatException e) {check=true;}
if(choiseInt<0||choiseInt>notesSpList.size()) check=true;
}
}while(check);
if (choiseInt==0) {
	mainMenu();
} else noteViewer(choiseInt-1);
}

public void noteViewer(int number){ 
	clear();
Note n=notesSpList.get(number);
System.out.printf("%s\n%s\n%s\n%s\n",n.getTitle(),n.getDate(),n.getEmail(),n.getMessage());
System.out.println("--------");
System.out.println("Введите любой символ для возврата в меню поиска");
String choise=in.next();
viewMenu();
}

public void clear(){
try{
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} catch (Exception ex){}	
}

public boolean checkDate(String date){
boolean correct=false;
Pattern ptrn1 = Pattern.compile("(((0[1-9]|[1-2][0-9]|3[0-1])\\.(01|03|05|07|08|10|12))|((0[1-9]|[1-2][0-9]|30)\\.(04|06|09|11))|((0[1-9]|[1-2][0-9])\\.02))(\\.20[0-3][0-9])");
Matcher m1 = ptrn1.matcher(date);
if (m1.matches()) correct=true;
else System.err.println("Некорректно введена дата, введите еще раз");
return correct;  	
}

public boolean checkSearchDate(String date){
boolean correct=false;
Pattern ptrn1 = Pattern.compile("([0-3\\-][0-9\\-])\\.([01\\-][0-9\\-])\\.([2\\-][0\\-][0-3\\-][0-9\\-])");
Matcher m1 = ptrn1.matcher(date);
if (m1.matches()) correct=true;
else System.err.println("Некорректно введена дата, введите еще раз");
return correct;  	
}

public boolean checkEmail(String email){
boolean correct=false;
Pattern ptrn1 = Pattern.compile("\\w+@\\w+\\.[a-z]{2,}");
Matcher m1 = ptrn1.matcher(email);
if (m1.matches()) correct=true;
else System.err.println("Некорректно введена почта, введите еще раз");
return correct;  	
}

class TitleCompare implements Comparator<Note>{
	public int compare (Note one, Note two){
		return one.getTitle().compareTo(two.getTitle());
	}
}
class EmailCompare implements Comparator<Note>{
	Pattern ptrn1 = Pattern.compile("\\w+(?=@)");
	Pattern ptrn2 = Pattern.compile("(?<=@)\\w+(?=\\.)");	
	Pattern ptrn3 = Pattern.compile("(?<=\\.)[a-z]{2,}");
	String account1;
	String account2;
	String mail1;
	String mail2;
	String zone1;
	String zone2;	
	int result;	
	public int compare (Note one, Note two){
	Matcher m1 = ptrn1.matcher(one.getEmail());
	Matcher m2 = ptrn1.matcher(two.getEmail());
	if (m1.find()) account1=one.getEmail().substring(m1.start(), m1.end());
	if (m2.find()) account2=two.getEmail().substring(m1.start(), m1.end());
	result=account1.compareTo(account2);
	if(result==0){
	m1 = ptrn2.matcher(one.getEmail());
	m2 = ptrn2.matcher(two.getEmail());
	if (m1.find()) mail1=one.getEmail().substring(m1.start(), m1.end());
	if (m2.find()) mail2=two.getEmail().substring(m1.start(), m1.end());
	result=mail1.compareTo(mail2);	
	} 
	if(result==0){
	m1 = ptrn3.matcher(one.getEmail());
	m2 = ptrn3.matcher(two.getEmail());
	if (m1.find()) zone1=one.getEmail().substring(m1.start(), m1.end());
	if (m2.find()) zone2=two.getEmail().substring(m1.start(), m1.end());
	result=zone1.compareTo(zone2);	
	} 
	return result;
	}
}

class DateCompare implements Comparator<Note>{
	Pattern ptrn3 = Pattern.compile("\\d+?(?=\\.)");
	Pattern ptrn2 = Pattern.compile("(?<=\\.)\\d+?(?=\\.)");	
	Pattern ptrn1 = Pattern.compile("\\d{4}");
	String year1;
	String year2;
	String month1;
	String month2;
	String day1;
	String day2;	
	int result;	
	public int compare (Note one, Note two){
	Matcher m1 = ptrn1.matcher(one.getDate());
	Matcher m2 = ptrn1.matcher(two.getDate());
	if (m1.find()) year1=one.getDate().substring(m1.start(), m1.end());
	if (m2.find()) year2=two.getDate().substring(m1.start(), m1.end());
	result=year1.compareTo(year2);
	if(result==0){
	m1 = ptrn2.matcher(one.getDate());
	m2 = ptrn2.matcher(two.getDate());
	if (m1.find()) month1=one.getDate().substring(m1.start(), m1.end());
	if (m2.find()) month2=two.getDate().substring(m1.start(), m1.end());
	result=month1.compareTo(month2);	
	} 
	if(result==0){
	m1 = ptrn3.matcher(one.getDate());
	m2 = ptrn3.matcher(two.getDate());
	if (m1.find()) day1=one.getDate().substring(m1.start(), m1.end());
	if (m2.find()) day2=two.getDate().substring(m1.start(), m1.end());
	result=day1.compareTo(day2);	
	} 
	return result;
	}
}

public static void main (String [] args) {
Notepad n=new Notepad();
n.start();
}
}

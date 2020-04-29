//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, 
//вывести на консоль содержимое, дополнить, удалить.
import java.util.*;
import java.nio.file.*;
import java.io.BufferedWriter;

public class TextFile {
private String name;
private File file;
private Directory dir;
private Path path;


public Path getPath(){
	return path;
}

private TextFile(Directory dir){
this.dir=dir;
file=new File(dir,"text.txt");	
name=file.getName();
path=file.getPath();
}
	
public static TextFile create(Directory dir){
	TextFile t=new TextFile(dir);
	return t;
}

public void rename (String name){
this.name=name;
try{
Files.move(path, path.resolveSibling(name),StandardCopyOption.REPLACE_EXISTING);
path=Paths.get(dir.getPath()+"\\"+name);	
System.out.println("Файл переименован");
} catch (Exception ex){System.err.println("Файл не найден");};

}

public void print (){	
	try{
List<String> l=Files.readAllLines(path);
for (String s:l){
	System.out.println(s);
}
	} catch (Exception ex) {System.err.println("Файл не найден");}
}


public void add (String s){	
	try{
BufferedWriter writer=Files.newBufferedWriter(path,StandardOpenOption.APPEND);
writer.write(s);
writer.newLine();
writer.close();
	} catch (Exception ex) {System.err.println("Файл не найден");}
}

public void delete (){
try{
Files.delete(path);	
System.out.println("Файл удален");
} catch (Exception ex){	System.err.println("Файл не найден");};

}



public static void main (String [] args) {
Directory d1=new Directory("D:\\Java\\Git\\Introduction-to-Java-Online\\Introduction-to-Java-Online\\5. Basics of OOP\\Task_1");	
TextFile t=create(d1);
t.add("hello");
t.rename("xxx.txt");
t.add("world");
t.print();
t.delete();
}
}













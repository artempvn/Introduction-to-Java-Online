package com.artempvn.task_3.server;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.regex.*;
import java.net.*;

public class ArchiveServer{
private static String path="D:\\Java\\Git\\Introduction-to-Java-Online\\Introduction-to-Java-Online\\6. Tasks\\Task_3\\Server";
private static Path usersXml=Paths.get(path+"\\users.xml");
private static Path casesXml=Paths.get(path+"\\cases.xml");
static {try{
Files.createDirectories(Paths.get(path));
	} catch (IOException e){e.printStackTrace();}
try {
Files.createFile(usersXml);
	} catch (FileAlreadyExistsException ex){System.out.println("Обнаружен users.xml");}
	catch (Exception ex){ex.printStackTrace();}
try {
Files.createFile(casesXml);
	} catch (FileAlreadyExistsException ex){System.out.println("Обнаружен cases.xml");}
	catch (Exception ex){ex.printStackTrace();}	}


public static String read(String usersOrCases){
	String message="";
	try{
BufferedReader reader=new BufferedReader(new FileReader(path+"\\"+usersOrCases+".xml"));
message=reader.readLine();
reader.close();
	}catch (Exception ex){ex.printStackTrace();}
	return message;
}

public static void write(String usersOrCases, String message){
try {
	BufferedWriter writer=new BufferedWriter(new FileWriter(path+"\\"+usersOrCases+".xml"));
	writer.write(message);
	writer.flush();
	writer.close();
	} catch (Exception ex){ex.printStackTrace();}	
}



public static void main (String [] args) {
(new Thread(new SendUsers())).start();
(new Thread(new SendCases())).start();
(new Thread(new GetUsers())).start();
(new Thread(new GetCases())).start();
}

}


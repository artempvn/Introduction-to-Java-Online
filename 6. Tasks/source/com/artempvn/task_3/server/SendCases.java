package com.artempvn.task_3.server;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.net.*;

class SendCases implements Runnable{
private	ServerSocket serverSock;
public void run(){
	try{
		try{
serverSock=new ServerSocket(5005);
	while(true){
	Socket sock=serverSock.accept();
	String cases=ArchiveServer.read("cases");
	PrintWriter writer=new PrintWriter(sock.getOutputStream());
	writer.println(cases);
	System.out.println("Отправлен список дел");
	writer.close();
	sock.close();
	}
	}catch (IOException ex){ex.printStackTrace();}
finally { serverSock.close();}
}catch (IOException ex){ex.printStackTrace();}
}	
}

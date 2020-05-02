package com.artempvn.task_3.server;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.net.*;

class SendUsers implements Runnable{
	private	ServerSocket serverSock;
public void run(){
	try{
		try{
serverSock=new ServerSocket(5004);
	while(true){
	Socket sock=serverSock.accept();
	String users=ArchiveServer.read("users");
	PrintWriter writer=new PrintWriter(sock.getOutputStream());
	writer.println(users);
	System.out.println("Отправлен список пользователей");
	writer.close();
	sock.close();
	}
	}catch (IOException ex){ex.printStackTrace();}
finally { serverSock.close();}
}catch (IOException ex){ex.printStackTrace();}
}	
}
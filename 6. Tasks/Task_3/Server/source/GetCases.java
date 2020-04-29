import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.net.*;

class GetCases implements Runnable{
	private	ServerSocket serverSock;
public void run(){
	String cases="";
	try{
		try{
serverSock=new ServerSocket(5007);
	while(true){
	Socket sock=serverSock.accept();
BufferedReader reader=new BufferedReader(new InputStreamReader(sock.getInputStream()));
ArchiveServer.write("cases",reader.readLine());
System.out.println("Обновлен список дел");
reader.close();
	sock.close();
	}
	}catch (IOException ex){ex.printStackTrace();}
finally { serverSock.close();}
}catch (IOException ex){ex.printStackTrace();}
}	
}
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.net.*;

class GetUsers implements Runnable{
	private	ServerSocket serverSock;
public void run(){
	String users="";
	try{
		try{
serverSock=new ServerSocket(5006);
	while(true){
	Socket sock=serverSock.accept();
BufferedReader reader=new BufferedReader(new InputStreamReader(sock.getInputStream()));
ArchiveServer.write("users",reader.readLine());
System.out.println("Обновлен список пользователей");
reader.close();
	sock.close();
	}
	}catch (IOException ex){ex.printStackTrace();}
finally { serverSock.close();}
}catch (IOException ex){ex.printStackTrace();}
}	
}

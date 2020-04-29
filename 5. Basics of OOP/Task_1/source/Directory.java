import java.util.*;
import java.nio.file.*;

class  Directory { 
private String path;

public String getPath(){
	return path;
}
public Directory(String path){
	this.path=path;
	Path p=Paths.get(path);
	try{
	Files.createDirectory(p);
	}catch (FileAlreadyExistsException ex){System.err.println("Директория уже создана");}
	catch (Exception ex){ex.printStackTrace();}
}
}












package com.artempvn.task_1;
import java.util.*;
import java.nio.file.*;
class  File { 
private String name;
private Path path;

public String getName(){
	return name;
}
public Path getPath(){
	return path;
}

public File(Directory dir, String name){
	try{
path=Paths.get(dir.getPath()+"\\"+name);
Files.createFile(path);
	} catch (Exception ex){
		System.err.println("Файл уже создан");
	}
}
}














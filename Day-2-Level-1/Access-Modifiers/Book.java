import java.util.*;


public class Main{

public static void main(String args[]){

// callng uding child class

Ebook ob=new Ebook();
ob.setter("Stephen King");
ob.setterT("Mirror","787890IU90");

}

}


public class Book{

public String ISBN;
protected String title;
private String author;

public void setter(String x){
author=x;
System.out.println("Author: "+author);
}

}

// creating a child class using extends

 class Ebook extends Book{

// setting cgpa in child class

public void setterT(String x, String y){
title=x;
System.out.println("name: "+title);

ISBN=y;
System.out.println("ISBN: "+ISBN);

}

}






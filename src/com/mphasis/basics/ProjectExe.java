package com.mphasis.basics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectExe {
public static void main(String[] args) throws IOException {
int options;
	
	int tasks;
	Scanner a=new Scanner(System.in);
	while(true)
	{
		System.out.println("enter 1 to view files in asc order,enter2 for tasks,enter 3 for exit");
		options=a.nextInt();
		switch(options)
		{
		case 1:
        String path="E:\\simplilearn\\";
        File f=new File(path);
        File filename[]=f.listFiles();
        for(File ff:filename){
        	System.out.println(ff.getName());
        }
        	break;
        	case 2:
        Scanner a1=new Scanner(System.in);
			boolean p=true;
			while(p){
			System.out.println("enter 1 to add,enter 2 to del,add 3 to search,enter 4 for options");
			tasks=a1.nextInt();
			switch(tasks)
        {
        case 1:
        String path1="E:\\Simplilearn\\";
        Scanner a2=new Scanner(System.in);
     ArrayList<String>al=new ArrayList<>();
    while(true) {
        System.out.println("enter the file name to create");
        String filename1=a2.next();
        String finalname1=path1+filename1;
        System.out.println(finalname1);

//create a file 

File f1=new File(finalname1);
boolean p1=f1.createNewFile();
if(p!=true) {
	System.out.println("the file not created");
}
else {
	al.add(filename1);
	System.out.println("file created");
	break;
}

System.out.println("the collection of files is "+ al);
         }
         break;
        case 2:

String path2="E:\\simplilearn\\";
Scanner a3=new Scanner(System.in);
System.out.println("enter the file name to be deleted");
String filname2=a3.next();
String finalfile=path2+filname2;
File file=new File(finalfile);
file.delete();
System.out.println("file deleted");
break;
        case 3:
String path3="E:\\simplilearn\\";
File f2=new File(path3);
Scanner a4=new Scanner(System.in);
System.out.println("enter the file name to search");
String filsearchname=a4.next();
File filename3[]=f2.listFiles();
int flag=0;
for(File ff:filename3) {
if(ff.getName().equals(filsearchname)){
flag=1;
break;
}
else{
	flag=0;
}
}
if(flag==1){
	System.out.println("file found");
}
else{
	System.out.println("file not found");
}
break;

        case 4:
        p=false;//
}
        } 
        break;
		case 3:
			System.exit(0);
			break;

}
}
}
}











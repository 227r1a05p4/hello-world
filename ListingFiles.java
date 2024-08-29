import java.util.Scanner;
import java.io.*;
public class ListingFiles{
     public static void main(String args[]){
           String path=null;
          Scanner read = new Scanner(System.in);
          System.out.println("Enter the root directory name");
             path=read.next()+":\\";
             File f_ref = new File(path);
             if(!f_ref.exists()){
               printLine();
               System.out.println("Root directory does not exists!!");
               printLine();
           }
             else{
                   String ch="y";
          while(ch.equalsIgnoreCase("y")){
         printFiles(path);
        System.out.print("do you want to open any subdirectory ");
       ch=read.next().toLowerCase();
        if(ch.equalsIgnoreCase("y")){
       System.out.print("Enter subdirectory name");
         path=path+"\\\\"+read.next();
          File f_ref2 = new File(path);
         if(!f_ref2.exists()){
               printLine();
               System.out.println(" the sub directory does not exists!!");
               printLine();
            int lastindex = path.lastIndexOf("\\");
        path = path.substring(0,lastindex);
         }
       }
      }
    }
   System.out.println("** program ends **");
  }
public static void printFiles(String path){
System.out.println("Current location "+path);
File f_ref = new File(path);
File filesList[] = f_ref.listFiles();
for(File file:filesList){
if(file.isFile()){
System.out.println("-"+file.getName());
}
else{
System.out.println("-"+file.getName());
}
}
}
public static void printLine(){
System.out.println("--------------");
}
}
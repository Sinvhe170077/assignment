/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylist;
import data.Emp;
 import java.util.*;
import java.io.*;
/**
 *
 * @author Nguyen Van Si
 */


   
public class MyList {
  ArrayList<Emp> t;
public  MyList() {
    t = new ArrayList<Emp>();  
  }
public void clear() {
  t.clear();  
}
public boolean isEmpty() {
  return(t.isEmpty());  
}
public void add(Emp x) {
  t.add(x);  
}
public void display() {
  for(int i=0;i<t.size(); i++) System.out.print(t.get(i));
  System.out.println();
}
public void input() {
 Emp x; int n,i;
 Scanner t = new Scanner(System.in);
 System.out.print("Enter number of employees: ");
 n = t.nextInt();
 for(i=0;i<n;i++) {
   x = new Emp();
   x.input();
   add(x);
 }
}
  public void loadFileRA(String fname) throws IOException { // Using RandomAccessFile class
   RandomAccessFile f = new RandomAccessFile(fname,"rw");
   String s; String [] a;
   String xName; int xAge; double xSal;
   while(true) {
     s = f.readLine();
     if(s==null || s.trim().length()<3) break;
     a = s.split("[|]");
     xName = a[0].trim();
     xAge = Integer.parseInt(a[1].trim());
     xSal = Double.parseDouble(a[2].trim());
     add(new Emp(xName,xAge,xSal));
   }
   f.close();
 }

  public void loadFileFR(String fname) throws IOException { // Using FileReader class
   FileReader fr = new FileReader(fname);
   BufferedReader br = new BufferedReader(fr);
   String s; String [] a;
   String xName; int xAge; double xSal;
   while(true) {
     s = br.readLine();
     if(s==null || s.trim().length()<3) break;
     a = s.split("[|]");
     xName = a[0].trim();
     xAge = Integer.parseInt(a[1].trim());
     xSal = Double.parseDouble(a[2].trim());
     add(new Emp(xName,xAge,xSal));
   }
   fr.close();
   br.close();
 }

  public void saveFileFR(String fname) throws IOException { // Using FileReader class
   FileWriter fw = new FileWriter(fname);
   PrintWriter pw = new PrintWriter(fw);
   int n,i; Emp x;
   n = t.size();
   for(i=0;i<n;i++) {
     x = t.get(i);
     pw.printf("%10s | %2d | %.1f\r\n",x.name,x.age,x.sal);
    }
   fw.close();
   pw.close();
  }

}



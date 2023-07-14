/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuli;
 import java.io.*;
import mylist.MyList;
/**
 *
 * @author Nguyen Van Si
 */
public class Main {
   

    public static void main(String[] args) throws IOException  {
     String fname1 = "emp.txt";
     String fname2 = "emp1.txt";
     MyList t = new MyList();
     t.loadFileFR(fname1);
     t.display();
     System.out.println();
     t.input();
     t.saveFileFR(fname1);
     t.display();
     System.out.println();
     
     System.out.println();
    }
    
}



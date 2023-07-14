/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.*;
/**
 *
 * @author Nguyen Van Si
 */
    
public class Emp {
  public String name; public  int age; public double sal;
  public Emp() {
  }
 public Emp(String xName, int xAge, double xSal) {
      name = xName; age = xAge; sal = xSal;
  }
  public String toString() {
    String s = "(" + name + "," + age + "," + sal + ") ";
    return(s);
  }
  public void input() {
    Scanner t = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = t.nextLine();
    System.out.print("Enter age: ");
    age = t.nextInt();
    System.out.print("Enter salary: ");
    sal = t.nextDouble();
  }
}


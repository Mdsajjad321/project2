package AreaAndParameter;
import java.util.Scanner;
public class AreaOfRhombus {
  public static void main(String[]args){
    int d1, d2;
    Scanner r=new Scanner(System.in);
    System.out.println("Enter the first number");
    d1=r.nextInt();
    System.out.println("Enter the Second number");
    d2=r.nextInt();
    double Area =(d1*d2)/2;
    System.out.println("Area of rhombus" +Area);
  }  
}

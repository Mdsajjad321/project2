package AreaAndParameter;
import java.util.Scanner;
public class AreaOfTriangle {
  public static void main(String[]args){
    int b,l ;
    double Area;
    Scanner r=new Scanner(System.in);
    System.out.println("Enter the  first number");
    b=r.nextInt();
    System.out.println("Enter the second number");
    l=r.nextInt();
    Area =( b*l)/2
    ;
    System.out.println("Area of triangle is :"+Area);
  }  
}

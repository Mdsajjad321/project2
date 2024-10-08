package AreaAndParameter;
import java.util.Scanner;
public class AreaOfRectangle {
 public static void main(String[]args){
    int l,b;
    Scanner r=new Scanner(System.in);
    System.out.println("Enter the first number");
    l=r.nextInt();
    System.out.println("Enter the second number"); 
    b=r.nextInt();
    double Area = l*b;
    System.out.println("Area of rectangle is:" +Area);
 }    
}

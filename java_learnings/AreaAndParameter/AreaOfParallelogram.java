package AreaAndParameter;
import java.util.Scanner;
public class AreaOfParallelogram {
  public static void main(String[]args){
    int b,h;
    Scanner r=new Scanner(System.in);
    System.out.println("Enter the first number");
    b=r.nextInt();
    System.out.println("Enter the second number");
    h=r.nextInt();
    double Area = b*h;
    System.out.println("Area of parallelogram is"+Area);
  }  
}

package AreaAndParameter;
import java.util.Scanner;
public class AreaOfCircle {
 public static void main(String[] args) {
    int r;
    double pi=3.14, Area;
    Scanner a=new Scanner(System.in);
    System.out.println("Enter the number");
    r=a.nextInt();
    Area =pi*r*r;
    System.out.println("Area of circle is :"+Area);
 }   
}

package AreaAndParameter;
import java.util.Scanner;
public class PerimeterOfSquare {
 public static void main(String[]args){
    int a;
    Scanner r=new Scanner(System.in);
    System.out.println("The length is:");
    a=r.nextInt();
    int p=4*a;
    System.out.println("perimeter of square is: "+p);
 }  
}
package AreaAndParameter;
import java.util.Scanner;
public class PerimeterOfCircle {
  public static void main(String[]args){
int R;
double pi=3.14 , p;
Scanner r=new Scanner(System.in);
System.out.println("The redius is");
R=r.nextInt();
p=2*pi*R;
System.out.println("perimeter of circle is :"+p);
  }  
}

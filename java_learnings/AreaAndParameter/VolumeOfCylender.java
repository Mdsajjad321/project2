package AreaAndParameter;
import java.util.Scanner;
public class VolumeOfCylender {
  public static void main(String[]args){
    int r,h;
    double pi=3.14,voc;
    Scanner a=new Scanner(System.in);
System.out.println("The redius is");
r=a.nextInt();
System.out.println("The higth is");
h=a.nextInt();
System.out.println("volume of cylender is =");
voc=pi*r*r*h;
System.out.println(+voc);
  }  
}

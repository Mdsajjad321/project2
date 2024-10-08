package AreaAndParameter;
import java.util.Scanner;
public class VolumeOfCube {
   public static void main(String[]args){
    int r,h;
    double pi=3.14, c;
    Scanner a=new Scanner(System.in);
    System.out.println("The redius is");
    r=a.nextInt();
    System.out.println("The hight is");
    h=a.nextInt();
    c=(pi*r*r*h)/3;
    System.out.println("The voiume of cone is: "+c);

   } 
}

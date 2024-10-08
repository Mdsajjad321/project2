package AreaAndParameter;
import java.util.Scanner;
public class VolumeOfPrism {
 public static void main(String[]args){
    int b,h;
    Scanner r=new Scanner(System.in);
    System.out.println("The bregth is");
    b=r.nextInt();
    System.out.println("The hight is");
    h=r.nextInt();
    System.out.println("The volume of prism is : ");
    int vop=b*h;
    System.out.println(+vop);
 }   
}

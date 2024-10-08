package AreaAndParameter;
import java.util.Scanner;
public class VolumeOfSphare {
public static void main(String[]args){
    int r,h;
    double pi=3.14,vos;
    Scanner a=new Scanner(System.in);
    System.out.println("The redius is");
    r=a.nextInt();
    System.out.println("The height is ");
h=a.nextInt();
vos=(4*pi*r*r*h)/3;
System.out.println("the volume of sphare is="+vos);
}    
}

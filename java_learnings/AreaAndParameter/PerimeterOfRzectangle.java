package AreaAndParameter;
import java.util.Scanner;
public class PerimeterOfRzectangle {
    public static void main(String[] args){
        int a,b;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=r.nextInt();
        System.out.println("Enter the second number");
        b=r.nextInt();
        int p= 2*(a+b);
        System.out.println("Perimeter of rectangle is :"+p);
    }
}

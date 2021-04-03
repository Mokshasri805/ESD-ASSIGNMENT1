// area of square
import java.util.Scanner;
class squarearea{
public static void main (String[] args) {
       System.out.println("Enter the side of square :");
       Scanner scanner = new Scanner(System.in);
       double side = scanner.nextDouble();
       double ar = side*side; 
       System.out.println("area of square : "+ar);
   }
}
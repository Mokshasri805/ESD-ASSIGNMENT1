import java.util.Scanner;

class ASCIIValue {

   public static void main(String[] args) {

     
      char ch ;
      int value ;

      Scanner scan = new Scanner(System.in);

 
      System.out.print("Enter an alphabet:: ");
      ch = scan.next().charAt(0);

      value = ch;

      
      System.out.println("ASCII value of "+ ch +" = "+value);
    
      scan.close();
     }
 }
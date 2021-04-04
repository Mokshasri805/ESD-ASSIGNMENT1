//Implement a java program to print 1 to 100 without using numbers in the program.
import java.util.Scanner;
class print1to100  
{  
public static void main(String args[])   
{  
int number ;  
int n;
Scanner ob= new Scanner(System.in);
System.out.printf("enter the first digit :");
n = ob.nextInt();
System.out.printf("enter the last digit :");
number = ob.nextInt();
System.out.println("List of one to hundered numbers : "+number+": ");  
for (int i=n; i<=number; i++)   
{  

System.out.print(i + " ");  

}  
}  
}
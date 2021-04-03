import java.util.Scanner;
class Recursive{
public static void main(String args[]){
    int sum=0;  
    Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter two numbers to calculate product: ");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int result=product(num1,num2);
    
     System.out.print("Product of "+num1+" and "+num2+" is :"+result);
   
}
static int product(int a, int b)
{
    if(a<b)
    {
        return product(b,a);
    }
    else if(b!=0){
            return (a+product(a,b-1));
    }
    else{
        return 0;
    }
}
}
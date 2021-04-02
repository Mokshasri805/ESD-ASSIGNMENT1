//binomial coefficient of two numbers
import java.util.Scanner;
class binomial{
	static int fact(int n){
		int c=1,i;
		for(i=1;i<=n;i++){
			c=c*i;
		}
		return c;
	}
	public static void main(String[] args) {
		int n,r,bc,nr,den;
		Scanner ob = new Scanner(System.in);
		System.out.printf("enter the two numbers (num1 > num2)");
		n = ob.nextInt();
		r = ob.nextInt();
		nr=fact(n);
		den=fact(n-r)*fact(r);
		bc=nr/den;
		System.out.printf("the binomial coefficient of two numbers is %d",bc);	
	}
}
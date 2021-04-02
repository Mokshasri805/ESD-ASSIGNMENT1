import java.util.Scanner;
class SquareNum {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		System.out.println("Your squared number is: " + (num*num));
	}
}
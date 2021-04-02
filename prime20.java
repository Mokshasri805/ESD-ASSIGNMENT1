// printing prime factors of number
import java.util.Scanner;
class primefactor{
	
	static void primef(int s){
		int i,z=0;
		for(i=1;i<s;i++){
			if(s%i == 0){
				z++;
		
			}
		}
		if(z == 2)
			System.out.printf("%d",s);
	}
	public static void main(String[] args) {
	int j,n2;
	Scanner ob = new Scanner(System.in);
	System.out.printf("enter the number \n");
	n2 = ob.nextInt();
	for(j=2;j<n2;j++);
	{
		if(n2%j == 0)
		{
			primef(j);
		}
	}	
	}
}
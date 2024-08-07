import java.util.Scanner;
public class FindAllTheDivisionOfANumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		System.out.println("The Divisors are:");
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
				System.out.println(i+" ");
		}
	}
}

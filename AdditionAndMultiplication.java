import java.util.*;
public class AdditionAndMultiplication {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		int multiplication = 1;
		while(n>0)
		{
			int r =n % 10;
			sum+=1;
			multiplication*=1;
			n/=10;
		}
		System.out.println("Addition-"+sum);
		System.out.println("Multiplication-"+multiplication);
}
}

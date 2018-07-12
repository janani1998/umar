import java.util.Scanner;
public class Positive {
	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n==0)
		{
			System.out.print("Zero");
		}
		else if(n>0)
		{
			System.out.print("Positive");
		}
		else
			System.out.print("Negative");
	}

}

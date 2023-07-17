import java.util.Scanner;

public class NoOfDigitsInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer");

		int n = sc.nextInt();
		String n2 = Integer.toString(n);

		System.out.println(n2.length());

	}

}

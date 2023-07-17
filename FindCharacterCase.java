import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		if(ch>=65 && ch<=90) {
			System.out.println(1 + " Uppercase alphabet (A-Z)");
		}
		else if(ch>=97 && ch<=122) {
			System.out.println(0 + " Lowercase alphabet (a-z)");
		}
		else
			System.out.println(-1 + " Not an alphabet");
	}

}

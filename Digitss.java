import java.util.Scanner;
public class Digitss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your digit: ");
			String Digit1 = scan.nextLine();
		if(Digit1.length() == 2)
			System.out.println("Your numer is 2 digits long.");
		else if(Digit1.length() == 3)
			System.out.println("Your number is 3 digits long.");
		else if(Digit1.length() == 4)
			System.out.println("Your number is 4 digits long.");
		else if(Digit1.length() == 5)
			System.out.println("Your number is 5 digits long.");
		else
			System.out.println("Your number is not 2-5 Digits long.");
			
			
			
		
	}

}

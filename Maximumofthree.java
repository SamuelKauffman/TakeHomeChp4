import java.util.Scanner;
public class minimumofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max = 0;
		System.out.println("Enter three integers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if(num1>num2 && num1>num3)
			max=num1;
		else if(num2>num3)
			max=num2;
		else
			max=num3;
			System.out.println("The highest number is: " + max);
			
	}

}

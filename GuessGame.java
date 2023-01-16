import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		int input=scan.nextInt();
		//scan.close();
		int randomNo=(int)(Math.random()*10);
		System.out.println("Random No is " +randomNo);
		if(input==randomNo) {
			System.out.println("Good job");
		}else {
			System.out.println("Try again");
		}
		


	}

}


public class IfElseStatements {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*20);
		System.out.println(num);
		if(num>10) {
			System.out.println("no is greater");
		}
		else if(num<=10 && num>=5) {
			System.out.println("no is betweeen 10 and 5");
		}
		else {
			System.out.println("no is smaller than 10");
		}

	}

}

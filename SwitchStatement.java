
public class SwitchStatement {
//the data type of variable and case should be same
	public static void main(String[] args) {
		int num=(int)(Math.random()*10);
		System.out.println(num);
		
		//System.out.println(num);
		switch(num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default :
				System.out.println("Come Another Day");
				break;
		}
		
	}

}

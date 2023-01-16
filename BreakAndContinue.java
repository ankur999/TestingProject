
public class BreakAndContinue {

	public static void main(String[] args) {
		
		for(int i=0;i<12;i++) {
			if(i==3) 
			continue;//it skip the iteration ex you have to skip 5,6,7 and rest 1-10 you want to print so this is possible only this and jump to next cycle
			System.out.println(i);
			if(i==7)
				break;
				
		}
		
	}

}

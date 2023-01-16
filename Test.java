
public class Test {
	
	
	public static void badMethod(){
		throw new Error();
		
	}

	public static void main(String[] args) {
		
		try {
			badMethod();
			System.out.println("A");
			
		}catch(Exception e) {
		System.out.println("B");

		}finally{
		System.out.println("D");
		System.out.println("E");
	}
		

}
}
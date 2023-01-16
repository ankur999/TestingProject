
public class Calculator {
	
	public int add(int x,int y) {
		int z=x+y;
		return z;
	}
	
	public int sub(int x,int y) {
		int z=x-y;
		return z;
	}
	
	public int mul(int x,int y) {
		int z=x*y;
		return z;
	}
	
	public int div(int x,int y) {
		int z=x/y;
		return z;
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.add(20, 30));
		System.out.println(calc.sub(30, 20));
		System.out.println(calc.mul(20, 30));
		System.out.println(calc.div(50, 10));

	}

}

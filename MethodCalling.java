
public class MethodCalling {
	//static component ---can not give a call directly to non static component
	//if we are calling a method directly there behaviour should remain same 
	//if a method is static then there is no need to create object for that method
	//static can directly call to another static
	//non static can call directly to non static as well as static method
	//Ques-why we dont keep eveything static? we cannot keep everything static bcoz it will not follow OOPS concept we cannot do inheritance, polymorphim etc.
	

	public static void main(String[] args) {
		MethodCalling m=new MethodCalling();
		m.go();
		//go3();//static method
		
		/*output
		 * inside go method
		 * inside go1 method
		 * inside go2 method
		 * inside go3 method
		 */

	}
	public void go() {
		System.out.println("inside go method");
		go1();
		go3();//non static calling static
	}
	
	public void go1() {
		System.out.println("inside go1 method");
		go2();
	}

	public void go2() {
		System.out.println("inside go2 method");
	}
	
	public static void go3() {
		System.out.println("inside go3 method");
	
		
	}


}

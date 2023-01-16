
public class Hime {
	
	//3 types of variable->instance /local /class
	
	/*
	 * design calculator--add ,sub, mul ,div.
	 * 1. it has 4 methods
	 * 2. int as return type 
	 * 3. and use 2 parameter as int type. 
	 */
	
	/*
	 * 
	 *instance-those are declared inside class body
	 * local-those are declared inside method body
	 * class variable--by using static keyword we can make class variable 
	 * 
	 */
	static int k;
	static int i=10;//instance or global variable(means it can be declared throughout the class)
	
	public void display(int l) {
	
		int j=20;
		System.out.println(j);//local(scope is limited to this method body)
		System.out.println(l);
	}
	

}

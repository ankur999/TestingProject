
public class Variable {
	int a=10;//instance variable
	 static int b=20;//static variable

	public static void main(String[] args) {
		Variable v=new Variable();
		v.b++;//obj1 21
		//v.display();
		//System.out.println(v.b);
		Variable v1=new Variable();
		v1.b++;//obj2 21
		Variable v2=new Variable();//obj3 20
		System.out.println(v2.b);

	}
	public void display() {
		int c=30;//local varibale
		System.out.println(c);
		System.out.println(a);
	}

}

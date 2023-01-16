/*
objects are nothing but instance of a class.
variables are named space of memory which stores data
2 types of variables ->Refrence(stores address of the object) & Primitive


*/

public class Day1


{//start of body

	
	
	public static void main(String[] args) {
		
		
		//primitive data types
		
		int i=1234;// store integer value
		float f=12.40f; // store float value 
		boolean b=true; //
		char c='r';//
		long l=12345678; //initialization(assiginig any value to datatype)
		String s1="hello"; //class in java
		double d=12.451223;
		int t;//declarations
		
		Day1 dt;//non primitive data type
		//sting + string = concatenated string
		String abc=new String();// string Class object is created
		abc="Hello java";
		
		
		String s2="world";//here java implicitly creating the object for string class
		String s3=s1+s2;
		System.out.print(s3);
		//int + int= int
		int num1=10;
		int num2=20;
		System.out.print(num1+num2);
		
		
		/*java operators
		 * 12+45 //operands
		 * unary//single operand
		 * binary//two operand
		 * ternary//three operand
		
		*/
		System.out.print(34<78);
	}
	
	
	
	
	
}//end of body

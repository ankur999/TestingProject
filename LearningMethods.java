
public class LearningMethods {
	//display
	
	//Return Type--> dataType of value return by method
	//whenever we are define return type to a method
	//we use keyword-->return
	public int display(int a,String b,char c) //declare method
	{
		//all definitions goes here
		
		return 5;//as return type is int we have to return integer value and it has to be the last statement
		
	//if you are not returning anything then you have to use void return type	
		
	}
	public static void main(String[] args) {
	//LearningMethods m=new LearningMethods();
	//m.display(10,"so", 'a');//calling methods
	Hime h=new Hime();
	h.display(60);
	System.out.println(h.i);
	
	
//		Hime h= new Hime(); //calling from hime class
//				h.i++;//obj1 10
//		Hime h1=new Hime();//obj2 10
//		h1.i++;//11
//		Hime h2=new Hime();//obj3 10
//		System.out.println(h2.i);//the output will be 10 as we are creating the copy of instance variable which is defined in hime class but if we make it staic the output will be 12 as now we are changing the value of class variable which it is holding.
//		
		
	}

}

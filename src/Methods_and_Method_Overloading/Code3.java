package Methods_and_Method_Overloading;
/*
 * Define a method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two.

 */
public class Code3 {
 
	public static int max(int num1,int num2)
	{
		if(num1>num2)
			return num1;
		else
		    return num2	;
	}
	
	
	public static void main(String[] args) {
		int a = 45;
		int b = 55;
		System.out.println("Maximum number ="+max(a,b));
		

	}

}

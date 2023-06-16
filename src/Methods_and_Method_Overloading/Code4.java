
package Methods_and_Method_Overloading;

/**Define a method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two.

 * @author Toufique
 *
 */
public class Code4 {

	public int max(int num1,int num2)
	{
		if(num1>num2)
			return num1;
		else
		    return num2	;
	}
	
	
	public static void main(String[] args) {
		Code4 c4 =new Code4();
		int a = 45;
		int b = 55;
		System.out.println("Maximum value is "+c4.max(a,b));
		

	}

	}



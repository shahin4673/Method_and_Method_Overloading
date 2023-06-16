package Methods_and_Method_Overloading;

public class Max {
	   public int num1;
	   public int num2;
	   public int num3;
	   
	   
	
		public int max(int num1,int num2)
		{
			if(num1>num2)
				return num1;
			else
				return num2;	
			
		}
		public int max(int num1,int num2,int num3)
		{
			if(num1>num2 && num1>num3)
			   return num1;
			else if(num2>num1 && num2>num3)
			   return num2;
			else	
        	   return num3;
		}
		public double max(double num1,double num2)
		{
			if(num1>num2)
				return num1;
			else
				return num2;
			
			
		}
		public static void main(String args[]) {
			Max m = new Max();
			     int max1 = m.max(10, 15);
			     int max2 = m.max(10, 11, 12);
			     double max3 = m.max(12.5, 13.5);
			   System.out.println("Maximum num = "+max1);
			   System.out.println("Maximum num = "+max2);
			   System.out.println("Maximum num = "+max3);
			
		}
	
	}



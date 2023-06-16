/**
 * 
 */
package Methods_and_Method_Overloading;

/**Converting the UML into Java Code.
 * @author Toufique
 *
 */
public class Student {

	private String id;
	private String name;
	private double Cgpa;
	
	public void insert_Record(String id,String name,double Cgpa)
	{
		this.id =id;
		this.name = name;
		this.Cgpa = Cgpa;
	}
	public void display_Record()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("CGPA : "+Cgpa);
		
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.insert_Record("221-15-4980", "Toufique Ahamed", 3.84);
		s1.display_Record();

	}

}

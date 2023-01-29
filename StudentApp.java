class Student
{
	String name;
	int age;
	int id;


	void eat()
	{
		System.out.println("Student is eating");
	}

	void sleep()
	{
		System.out.println("Student is sleeping ");
	}

	void study()
	{
		System.out.println("Student is study ");
	}
}



class  StudentApp
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();

		s1.eat();
		s1.sleep();
		s1.study();
       System.out.println("................................... ");
		s2.eat();
		s2.sleep();
		s2.study();
       System.out.println("................................... ");
		s3.eat();
		s3.sleep();
		s3.study();
		System.out.println("................................... ");

		System.out.println("Anynomous objects ");
		new Student().eat();
	}
}

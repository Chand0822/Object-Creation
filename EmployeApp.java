class Employe
{
	String  name;
	int  id;
	int  salary;
	String  company;

void work()
{
	System.out.println("Employe is working ");
}

void eat()
{
	System.out.println("Employe is eating ");
}

void sleep()
{
	System.out.println("Employe is  sleeping");
}


}





class EmployeApp 
{
	public static void main(String[] args) 
	{
      Employe e1 = new Employe();
	      e1. name ="Ramesh";
          e1. id = 123;
          e1.salary= 9000;
          e1.company= "Google";
		System.out.println( e1. name);
		System.out.println( e1. id);
		System.out.println(e1.salary);
		System.out.println(e1.company);

		e1.work();
		e1.eat();
		e1.sleep();
	}
}

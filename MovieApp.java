class Movie
{
	String name;
	int id;
	String hero;
	String heroine;
	int num_of_actor;

	void make()
	{
	 System.out.println(" Make by Director");
	}

	void watch()
	{
     System.out.println(" Watch by public");
	}
}




class MovieApp 
{
	public static void main(String[] args) 
	{
		Movie m1=new Movie();
		m1.name = "jai ho";
			m1. id =124;
			m1.hero ="Salman khan";
			m1.heroine ="Moni Roi" ;
			m1.num_of_actor = 4;
		System.out.println(m1.name);
		System.out.println(m1. id);
		System.out.println(m1.hero);
		System.out.println(m1.heroine);
		System.out.println(m1.num_of_actor);

		m1.make();
		m1.watch();
        System.out.println("**********************Second Object********************");
		Movie m2=new Movie();
		m2.name = "Border";
			m2. id =121;
			m2.hero ="Sanjay Dut";
			m2.heroine ="Manish Koirala" ;
			m2.num_of_actor = 10;
		System.out.println(m2.name);
		System.out.println(m2. id);
		System.out.println(m2.hero);
		System.out.println(m2.heroine);
		System.out.println(m2.num_of_actor);

		m2.make();
		m2.watch();
	}
}

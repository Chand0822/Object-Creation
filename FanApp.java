class Fan
{
  String color;
  double cost;
  int no_of_blades;


  void roate()
  {
  System.out.println("Fan is roateing");
  }

   void blowAir()
  {
  System.out.println("Fan is Blowing air");
  }
}




class FanApp 
{
	public static void main(String[] args) 
	{
		Fan f1=new Fan();
		Fan f2=new Fan();
       System.out.println("...........function 1.........");
		f1.roate();
		f1.blowAir();
		System.out.println("...........function 2.........");
		f2.roate();
		f2.blowAir();
	}
}

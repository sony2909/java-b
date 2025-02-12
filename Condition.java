public class Condition{
	
	static String city="banglore";
	static float temperature=25.7f;
	static boolean israining=true;
	static int windspeed=24;
	static char condition='h';

   public static void cityinfo()
   {
   	System.out.println("name of the city is:"+city);
   }
   public static void weatherdetails()
   {
   	System.out.println("temperature of the city is:"+temperature);
   	System.out.println("condition of today is:"+condition);
   }
   public static void israin()
   {
   	System.out.println(" may today israining:"+israining);
   }
   public static void windinfo()
   {
   System.out.println("speed of wind is:"+windspeed);
}

  public static void main(String args[]){
  	   Condition.cityinfo();
  	   Condition.weatherdetails();
  	   Condition.israin();
  	   Condition.windinfo();
  	}
  }
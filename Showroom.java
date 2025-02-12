public class Showroom{


	static String brand="nokia";
	static int price=10000;
	static char model='n';
	static float discount=5.897f;
	static double actualcost=9999.103;
	static boolean isavailable=true;

	public static void showroominfo()
	{
		System.out.println("available brand is:"+brand);
		System.out.println("mobile price is:"+price);
		System.out.println("model is:"+model);
		System.out.println("discount of mobile is:"+discount);
		System.out.println("actalcost is:"+actualcost);
	}
	public static void pricedetails()
	{
		System.out.println("Price is:"+price);
	}
	public static void modelsavailable()
	{
		System.out.println("available model is:"+model);
	}
	public static void costdetails()
	{
		actualcost=price-discount;
		System.out.println("actalcost is:"+actualcost);
	}
	public static void stockinfo()
	{
    System.out.println("is stock available:"+isavailable);
	
}
    public static void main(String args[]){
    	Showroom.showroominfo();
    	Showroom.pricedetails();
    	Showroom.modelsavailable();
    	Showroom.costdetails();
    	Showroom.stockinfo();
    }
}


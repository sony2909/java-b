public class Grocery{

	
		static String storeName="sony";
		static int itemStock=359;
		static float itemPrice=8.98f;
		static double totalSales=679.90876;		
		static boolean isStockavailable=true;


		public static void storeinfo()
		{
			System.out.println("welcome to:"+storeName);

		}
		public static void itemsinfo()
		{
			System.out.println("items available:"+itemStock);
		}
		public static void prices()
		{
			totalSales=itemStock*itemPrice;
			System.out.println("totalSales is:"+totalSales);
		}
	    public static void totalSales()
	    {
	    System.out.println("totalSales done:"+totalSales);
	    }
	    public static void availability()
	    {
	    System.out.println("stock availability:"+isStockavailable);
	}
	    public static void main(String args[]){
	    	Grocery.storeinfo();
	    	Grocery.itemsinfo();
	    	Grocery.prices();
	    	Grocery.totalSales();
	    	Grocery.availability();

	}
}








		


	

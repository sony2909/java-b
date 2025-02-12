public class Fruitmarket{
	
	static String fruitname="apple";
	static int stock=16;
	static char marketname='h';
	static float price=20.78f;
	static double totalprice=332.48f;

    public static void friutdetails()
    {
    System.out.println("available fruit is:"+fruitname);
}
    public static void marketdetails()
    {
    	System.out.println("fruitname is:"+fruitname);
    	System.out.println("stock is:"+stock);
    	System.out.println("marketname is:"+marketname);
    	System.out.println("price is:"+price);
    	System.out.println("totalprice is:"+totalprice);
    }
    public static void pricedetails()
    {
    	totalprice=stock*price;
    	System.out.println("totalprice is:"+totalprice);
    }
    public static void stockdetails()
    {
    	System.out.println("available stock is:"+stock);
    } 
    public static void adressdetails() 
    {
    	System.out.println("marketname is:"+marketname);
    }
    public static void main(String args[]){
    	Fruitmarket.friutdetails();
    	Fruitmarket.marketdetails();
    	Fruitmarket.pricedetails();
    	Fruitmarket.stockdetails();
    	Fruitmarket.adressdetails();
    }
}


    

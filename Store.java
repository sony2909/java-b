public class Store {

	public static void main(String args[]){
		String item="oil";
		boolean ispresent=true;
		int price=50;
		char name='t';
		int quantity=5;
		float discount=20.6f;
		short id=66;
		byte weight=8;
		long number=667843267l;
		double salary=22000.988;
		int totalPrice=250;
		if(item=="oil")
		{
		System.out.println("item is present:"+ispresent);
		System.out.println("item is:"+item);
		System.out.println("price is:"+price);
		System.out.println("name is:"+name);
		System.out.println("quantity is:"+quantity);
		System.out.println("totalPrice is:"+totalPrice);
		System.out.println("discount is:"+discount);
		System.out.println("id is:"+id);
		System.out.println("number is:"+number);
		System.out.println("salary is:"+salary);
	}
	    else
        {
    	System.out.println("item is not available");
    }
        totalPrice=(quantity*price);
        System.out.println("totalPrice:"+totalPrice);
        if (totalPrice==1000){
        System.out.println("price:"+price);
        System.out.println("quantity:"+quantity);
   }
        else
    	System.out.println("total price is not equal to 1000");
        
        }
    }




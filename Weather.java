public class Weather{
	public static void main(String args[]){
	System.out.println("enter temperature in celsius:");
	int celsius=40;
	double fahrenheit=(celsius*9.0/5)+32;
	System.out.println("temperature in fahrenheit:"+fahrenheit);

	if(fahrenheit>100){
		System.out.println("hot");
	}
	else if(fahrenheit>=32 && fahrenheit<=100)
	{
		System.out.println("warm");
	}
	else{  
		System.out.println("cold");
	}
	}
	}

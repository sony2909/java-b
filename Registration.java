public class Registration{
	
	public static long id=21110001035l;
	public static long phone=8639205593l;

	public static long enrolldetails()
	{
		System.out.println("id number is:"+id);
		System.out.println("phone number is:"+phone);
		return id;
	}
	public static void main(String args[]){
		long l=Registration.enrolldetails();
		System.out.println("returned value:"+l);
	}
}

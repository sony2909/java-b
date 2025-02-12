public class Mall{
	
	public static char name='s';
	public static char block='f';

	public  static  char address()
	{
	System.out.println("mall name is:"+name);
	System.out.println("block name is:"+block);
	return name;
}
   public static void main(String args[]){
   	char p=Mall.address();
   	System.out.println("returned value:"+p);
   }
}

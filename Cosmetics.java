public class Cosmetics{
	
	public static void main(String args[]){

		String product="lipstick";
		short quantity=1;
		int price=30; 

		while(price==30){
			System.out.println("lipstick sold");
			break;
		}
		do{
			System.out.println("lipstick is not sold");
		}while(price>=30);
		for( int i=30;i<29;i++)
			System.out.println("quantity:"+(i+1)+":"+product);
	}
}

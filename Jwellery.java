public class Jwellery{
	
	public static void main(String args[]){

		String itemName="earrings";
		int itemSets=15;
		int count=8;

		while(count==15){
			System.out.println("no space in box");
			break;
        }
		do{
		   System.out.println("space is available");
		}while(count<=10);
		for( int i=8;i<9;i++)
			System.out.println("itemSets:"+(i+1)+":"+itemName);
	}
}

public class Account{
	
	public static void main(String args[]){
		double balance=1000.02;
        int Years=2;
        int count=10;

        while(count<=2){
        	System.out.println("balance available");
        count++;
	}
	do{
		System.out.println("balance is not available");
	}while(count>=2);
	for(int i=10;i<11;i++){
		System.out.println("Years"+(i+1)+":"+"balance");
	}
	}
}

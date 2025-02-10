import java.util.Scanner;
public class Symbols{

	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any two numbers");

		int first=scn.nextInt();
		int second=scn.nextInt();
		int addition,subraction,multipication,division,modulo;
		
		addition=first+second;
		System.out.println("adition is:"+addition);
		subraction=first-second;
		System.out.println("subraction is:"+subraction);
		multipication=first*second;
		System.out.println("multiplication is:"+multipication);
		division=first/second;
		System.out.println("division is:"+division);
		modulo=first%second;
		System.out.println("modulo is:"+modulo);
	}
	
}

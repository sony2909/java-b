public class Calculator{
	
	public static void main(String args[]){
		int a=10;
		int b=5;
		char operator='+';
		int result;

		switch(operator){
		case'+':
			result=a+b;
			System.out.println("result is:"+result);
			break;
		case'-':
			result=a-b;
			System.out.println("result is:"+result);
			break;
		case'*':
			result=a*b;
		    System.out.println("result is:"+result);
		    break;
		case'/':
			result=a/b;
			System.out.println("result is:"+result);
			break;
		default:
			System.out.println("invalid operator");

		}
	}
}
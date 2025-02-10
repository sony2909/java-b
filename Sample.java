public class Sample {

	public static void main(String args[]){
		char value=97;
		System.out.println("unicode of the char:"+(int)value);
		char nextchar=(char)(value+1);
		System.out.println("next character in the unicode sequence:"+(int)nextchar);
		char prevchar=(char)(value-1);
	    System.out.println("previous character in the unicode sequence:"+(int)prevchar);
	}
}
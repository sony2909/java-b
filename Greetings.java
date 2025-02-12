public class Greetings{

  public static String wish="good mrng";
  public static String message="had cofee";	
 public static String conveying() 
 {
 	System.out.println("wishes is:"+wish);

 	System.out.println("message is:"+message);
 	return wish;
 }
 public static void main(String args[]){
 	String x=Greetings.conveying();
 	System.out.println("returned value"+x);
 }
}
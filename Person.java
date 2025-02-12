public class Person{
	
	static String name="sony";
	static int age=21;
	static char gender='f';
	static float salary=28.000f;
	static double pf=5.987;
	static double balance=22.013;

	public static void personname()
	{
	System.out.println("name is:"+name);
    }
    public static void agedetails()
    {
    System.out.println("age is:"+age);	
    }
    public static void salarydetails()
    {
    	balance=salary-pf;
    System.out.println("balance is:"+balance);
    }
    public static void persondata ()
    {
    System.out.println("name is:"+name);
    System.out.println("age is:"+age);
    System.out.println("gender is:"+gender);
    System.out.println("salary is:"+salary);
    System.out.println("pf is:"+pf);
    System.out.println("balance is:"+balance);
}
    public static void balanceenquiry() 
    {
    	System.out.println("balance is:"+balance);
    }
    public static void main(String args[]){
    	Person.personname();
    	Person.persondata();
    	Person.agedetails();
    	Person.salarydetails();
    	Person.balanceenquiry();
    }
}


    
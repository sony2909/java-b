public class Company{
	
	public static float salary=24.500f;
	public static float pf=10.786f;

	public static float workerpackage()
	{
	System.out.println("worker salary is:"+salary);
	System.out.println("worker pf is:"+pf);
	return pf;
}   
    public static void main(String args[]){
    	float s=Company.workerpackage();
    	System.out.println("returned value"+s);
    }
}

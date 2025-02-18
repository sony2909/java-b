public class Grades{

	 static int marks=85;

	public static void calculateGrade(){
		if (marks>=90&&marks<=100){
		System.out.println(" Grade is A");
		}
		else if (marks>=80&&marks<=89){
		System.out.println("Grade is B");
		}
		else if (marks>=70&&marks<=79){
		System.out.println("Grade is C");
	    }
	    else if (marks>=60&&marks<=69){
		System.out.println("Grade is D");
        }
        else {
		System.out.println("Grade is F");
	}
		public static void main(String args[]){
			calculateGrade();
		}
	}
}



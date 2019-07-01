import java.util.Scanner;
class Marks{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		double mark = kb.nextDouble();
		if(mark >= 90 && mark <= 100){
			System.out.println("Grade: O");
		}else if(mark >= 80 && mark < 90){
			System.out.println("Grade: A+");
		}else if(mark >= 70 && mark < 80){
			System.out.println("Grade: A");
		}else if(mark >= 60 && mark < 70){
			System.out.println("Grade: B");
		}else if(mark >= 50 && mark < 60){
			System.out.println("Grade: C");
		}else if(mark >= 25 && mark < 50){
			System.out.println("Grade: D");
		}else{
			System.out.println("Grade: F");
		}
	}
}
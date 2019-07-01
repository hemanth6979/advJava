import java.util.Scanner;
class Blood{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = kb.nextInt();
		System.out.print("Enter your weight: ");
		double w = kb.nextDouble();
		if(age > 18 && w > 60){
			System.out.print("You are elligible to donate blood");
		}else{
			System.out.print("You are not elligible to donate blood");
		}
	}
}
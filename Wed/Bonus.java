import java.util.Scanner;
class Bonus{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int s;
		double total;
		System.out.print("Enter your salary: ");
		s = kb.nextInt();
		if(s >= 20000){
			total = s + (s * (10/100.0));
			System.out.print("10% extra bonus\nTotal Salary: "+total);
		}else{
			System.out.print("No extra Bonus\nTotal salary: "+s);
		}
	}
}

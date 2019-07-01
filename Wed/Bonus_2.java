import java.util.Scanner;
class Bonus_2{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int s;
		double total;
		System.out.print("Enter your salary: ");
		s = kb.nextInt();
		if(s >= 30000){
			total = s + (s * (20/100.0));
			System.out.print("20% extra bonus\nTotal Salary: "+total);
		}else{
			total = s + (s * (5/100.0));
			System.out.print("5% extra Bonus\nTotal salary: "+total);
		}
	}
}

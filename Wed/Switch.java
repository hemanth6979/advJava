import java.util.Scanner;
class Switch{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("1. Sum\n2. Subtraction\n3. Multiplication\n4. Division\nEnter your chice: ");
		int x = kb.nextInt();
		System.out.println("Enter two numbers");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c;
		switch(x){
			case 1:
				c = a + b;
				System.out.println("Sum is " + c);
				break;
			case 2:
				c = a - b;
				System.out.println("Subtraction is " + c);
				break;
			case 3:
				c = a * b;
				System.out.println("Multiplication is " + c);
				break;
			case 4:
				c = a / b;
				System.out.println("Division is " + c);
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
}
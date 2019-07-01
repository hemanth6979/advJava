import java.util.Scanner;
class Full_piramid{
	public static void main(String[] args){
		int n, i, j, k, x = 1;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the height of the piramid: ");
		n = kb.nextInt();
		for(i=1; i <= n; i++){
			for(k = n; k > i; k--){
				System.out.print(" ");
			}
			for(j = 0; j < x; j++){
				System.out.print("*");
			}
			x += 2;
			System.out.print("\n");
		}
	}
}
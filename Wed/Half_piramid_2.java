import java.util.Scanner;
class Half_piramid_2{
	public static void main(String[] args){
		int n, i, j, k;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the height of the piramid: ");
		n = kb.nextInt();
		for(i=1; i <= n; i++){
			for(k = n; k > i; k--){
				System.out.print(" ");
			}
			for(j = 0; j<i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
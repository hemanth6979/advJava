class Sum_first_50{
	public static void main(String[] args){
		int i = 1, sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 50);
		System.out.println("Sum of first 50 numbers is " + sum);
	}
}
class First_100_odd{
	public static void main(String[] args){
		int counter = 0, i = 1, sum = 0;
		while(counter < 100){
			sum += i;
			i += 2;
			counter++;
		}
		System.out.println("Sum of first 100 odd numbers is " + sum);
	}
}
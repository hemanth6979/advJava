class Condition{
	public static void main(String[] args){
		int x = 10, y = 5;
		while(x-- > 7 || ++y < 8);
			System.out.print(x);
			System.out.println(y);
	}
}
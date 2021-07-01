
public class Yakusuu {
	public static void main(String[] args) {
		int a = 1234567890;
		int b = 0;
		
		for (int i = 1; i < a; i++) {
			if( a % i == 0 && i <= 5000000 ) {
				b += i;
			}
		
		}
		System.out.println(b);
	}
}

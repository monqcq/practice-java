
public class Toribonatti {
	public static void main(String[] args) {
		int a,b,c,d;
		a = 1;
		System.out.println(a);
		b = 0;
		System.out.println(b);
		c = 5;
		System.out.println(c);
		
		for (int i = 3; i < 30; i++) {
			d = a + b + c;
			System.out.println(d);
			a = b;
			b = c;
			c = d;
		}
	}
		
}

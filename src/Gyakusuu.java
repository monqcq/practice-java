
public class Gyakusuu {
	public static void main(String[] args) {
		
		double s = 0;
		double i = 1.0;
		while(s < 12) {
			s = s + (1 / i);
			i++;
		}
		System.out.println(i);
	}
}

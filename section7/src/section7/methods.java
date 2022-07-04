package section7;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop(1, 10);
		System.out.println("********************");
		loop(20, 40);
		System.out.println("********************");
		loop(1, 10);
	}

	public static void loop(int step, int finalValue) {

		while (step <= finalValue) {
			System.out.println(step);
			step++;
		}

	}

}

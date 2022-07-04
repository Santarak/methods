package section7;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: "+area(14.25d, 10.65d));
		System.out.println("Area of square: "+area(5.0d));
	}
	public static double area(double length, double width){
		return length*width;
	}
	public static double area(double side){
		return side*side;
	}
	public static int area(int side){
		return side*side;
	}

	}



package section7;

public class methodparameterandreturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle with length = 5.4 "
				+ "and width 3.2 : "+areaRectangle(5.4, 3.2));
		
		//double area = areaRectangle(5.4, 3.2);
		//System.out.println(area);

		}
		public static double areaRectangle(double length, double width){
			return length*width;
		}

	}



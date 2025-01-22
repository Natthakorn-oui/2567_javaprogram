
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r1 = new rectangle(1.2f, 3.4f);
		rectangle r2 = new rectangle(1.0f, 1.0f);
		rectangle r3 = new rectangle(5.6f, 7.8f);
		
		//System.out.println(r1); this is .toString same as showData()
		System.out.println(r1.showData());
		System.out.println(r2.showData());
		System.out.println(r3.showData());
		
		System.out.println("length is : " + r3.getLength());
		System.out.println("width is : " +  r3.getWidth());
		System.out.printf("area is : %.2f%n" , r3.getArea());
		System.out.printf("perimeter is : %.2f" , r3.getPerimeter());
	}

}

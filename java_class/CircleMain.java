package java_class;

public class CircleMain {

	public static void main(String[] args) {

		Circle pizza = new Circle(10, "자바피자");
		Circle donut = new Circle(2, "자바도넛");

		double a = pizza.getArea();

//		System.out.println(pizza.getArea());  // 이것도 가능

		System.out.println(a);
		
		double b = donut.getArea();
		
		System.out.println(b);

	}

}

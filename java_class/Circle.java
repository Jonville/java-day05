package java_class;

public class Circle {

	int radius;
	String name;

	Circle(int radius, String name) {

		this.radius = radius;
		this.name = name;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

}

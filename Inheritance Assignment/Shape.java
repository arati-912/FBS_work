package Pk1;

class Shape {
	String color;
	int Borderwidth;

	Shape() {
		this.color = "Black";
		this.Borderwidth = 2;
	}

	Shape(String color, int borderwidth) {
		super();
		this.color = color;
		Borderwidth = borderwidth;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	int getBorderwidth() {
		return Borderwidth;
	}

	void setBorderwidth(int borderwidth) {
		Borderwidth = borderwidth;
	}

	void display() {
		System.out.println("Shape color: " + this.color);
		System.out.println("Border Width: " + this.Borderwidth);
	}
}

class rectangle extends Shape {
	int length;
	int width;

	rectangle() {
		super();
		this.length = 5;
		this.width = 7;
	}

	rectangle(String color, int borderwidth, int length, int width) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	void display() {
		super.display();
		System.out.println("Length: " + this.length);
		System.out.println("Width: " + this.width);
	}
}

class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Shape();
		s1.display();

		System.out.println();
		rectangle r1 = new rectangle("white", 1, 5, 6);
		r1.display();

	}

}

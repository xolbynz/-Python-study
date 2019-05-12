package Picture;

public class Tri extends Shape {
	String color = "";

	public Tri(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("Tri : "+color);

	}
}

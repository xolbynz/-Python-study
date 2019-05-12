package Picture;

public class Cir extends Shape {
	String color = "";

	public Cir(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("Cir : "+color);

	}

}

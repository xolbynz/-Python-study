package Picture;

public class Rect extends Shape{
	String color="";
	public Rect(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println("Rect : "+color);
	}
	


}

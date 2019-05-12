package Picture;

import java.util.ArrayList;

public class GraphicTool {
	private ArrayList<Shape> arr = new ArrayList<>();
	
	public void addShape(Shape shape) {
		arr.add(shape);
	}

	public void allDraw() {
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).draw();
		}
	}

}

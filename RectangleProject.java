package rectangle;

import java.awt.Rectangle;

public class RectangleProject {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		box.setLocation(10,15);
				
		System.out.println("x = 10");
		System.out.println("x = " + box.getX());
		System.out.println("y = 15");
		System.out.println("y = " + box.getY());
	}

}

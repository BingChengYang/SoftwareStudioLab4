import java.awt.Color;
import java.util.Random;


public class Square extends Shape {
	
	private int shapeWidth;
	private int shapeHeight;
	
	public Square(int shapeWidth){
		// TODO Constructor
		this.shapeHeight = shapeWidth;
		this.shapeWidth = shapeWidth;
	} //123
	
	
	@Override
	public Color getRandomColor() {	
		Random random = new Random();
		float r, g, b;
		r = random.nextFloat();
		g = random.nextFloat();
		b = random.nextFloat();
		// TODO Return random color produce from java.util.Random;
		// Java 'Color' class takes 3 floats, from 0 to 1.
		
		// TODO Return color produced by three rgb floats.
		return new Color(r, g, b);
	}
	
	@Override
	public int getShapeWidth(){
		// TODO Return Square width
		return shapeWidth;
	}
	
	@Override
	public int getShapeHeight(){
		// TODO Return Square height
		return shapeHeight;
	}


	@Override
	public int getCenterX(int mouseX) {
		// TODO Input mouse X position and return center X of square
		return mouseX - shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY) {
		// TODO Input mouse Y position and return center Y of square
		return mouseY - shapeWidth/2;
	}


}
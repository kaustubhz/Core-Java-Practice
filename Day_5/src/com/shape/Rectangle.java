package com.shape;

public class Rectangle extends Point implements Computable {
	
	private int width,height;
	

	public Rectangle(int x, int y,int width,int height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(width+height);
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

	@Override
	public String toString() {
		return "Rectangle [ width=" + width + ", height=" + height + ", toString()=" + super.toString() + " ], Area= [ "+calculateArea()+" ], Perimeter= [ "+calculatePerimeter()+" ]";
	}
	
	public void diagonals()
	{
		System.out.println("diagonals of rectangle are equal in length");
	}
	

}

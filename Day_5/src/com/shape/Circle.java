package com.shape;

public class Circle extends Point implements Computable {
	private int radius;
	
	public Circle(int x, int y,int radius) {
		super(x, y);
		this.radius=radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*radius*pi;
	}

	@Override
	public double calculateArea() {
		return pi*radius*radius;
	}

	@Override
	public String toString() {
		return "Circle [ radius=" + radius + ", toString()=" + super.toString() + " ], Area= [ "+calculateArea()+" ], Perimeter= [ "+calculatePerimeter()+" ]";
	}
	
	public void drawArc()
	{
		System.out.println("Drawing Arc...");
	}
}

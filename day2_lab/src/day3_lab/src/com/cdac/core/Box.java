package com.cdac.core;

public class Box
{
	private double width,height,depth;
	
	public Box()
	{
		width=0;
		height=0;
		depth=0;
	}
	
	public Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public Box(double side)
	{
		this(side,side,side);
	}
	
	public boolean isEqual(Box b2)
	{
		return (width==b2.width && height==b2.height && depth==b2.depth);
	}
	
	public void doubleDims()
	{
		width*=2;
		height*=2;
		depth*=2;
	}
	
	public String getBoxDims()
	{
		return "Width= "+width+" Height= "+height+" Depth= "+depth+"";
	}
}
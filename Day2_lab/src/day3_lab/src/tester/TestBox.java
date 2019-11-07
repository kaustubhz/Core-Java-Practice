package tester;
import com.cdac.core.Box;
import java.util.Scanner;

class TestBox
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Box objBox1=new Box();
		System.out.println("\nDefault box dimensions are:"+objBox1.getBoxDims());
		System.out.println("\nEnter width,height and depth of Box2: ");
		Box objBox2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("\nOriginal box2 dimensions are:"+objBox2.getBoxDims());
//		objBox2.doubleDims();
//		System.out.println("\nDoubled box2 dimensions are:"+objBox2.getBoxDims());
		System.out.println("\nEnter width,height and depth of Box3: ");
		Box objBox3=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("\nBox3 dimensions are:"+objBox3.getBoxDims());
		if(objBox2.isEqual(objBox3))
		{
			System.out.println("\nBoth boxes are same");
		}
		else
		{
			System.out.println("\nBoth boxes are different");
		}
	}
}
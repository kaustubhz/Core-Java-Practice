package tester;

import java.util.Scanner;

import com.shape.*;

public class TestShape {

	public static void main(String[] args) {
		int counter = 0;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n How many shapes? ");
		Point arrOfPoints[] = new Point[sc.nextInt()];
		do {
			System.out.print("\n 1. Add Circle");
			System.out.print("\n 2. Add Rectangle");
			System.out.print("\n 3. Display area(s) and perimeter(s) of shape(s)");
			System.out.print("\n 4. EXIT");
			System.out.print("\n Enter your choice: ");
			switch (sc.nextInt()) {
			case 1:
				if (counter >= arrOfPoints.length)
					System.out.print("\n Limit mein reh");
				else {
					System.out.println("\n X Y Radius");
					arrOfPoints[counter] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
					System.out.println("\n Circle is added");
					counter++;
				}
				break;
			case 2:
				if (counter >= arrOfPoints.length)
					System.out.print("\n Limit mein reh");
				else {
					System.out.println("\n X Y Width Height");
					arrOfPoints[counter] = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
					System.out.println("\n Rectangle is added");
					counter++;
				}
				break;
			case 3: {
				for (Point temp : arrOfPoints) {
					// System.out.println("\n Area: "+temp.);
					if (temp instanceof Circle) {
						System.out.println("\n Area of Circle is: " + ((Circle) temp).calculateArea() + " Sq. Units");
						System.out.println(
								"\n Perimeter of Circle is: " + ((Circle) temp).calculatePerimeter() + "  Units");
						((Circle) temp).drawArc();
					} else if (temp instanceof Rectangle) {
						System.out.println(
								"\n Area of Rectangle is: " + ((Rectangle) temp).calculateArea() + " Sq. Units");
						System.out.println(
								"\n Perimeter of Rectangle is: " + ((Rectangle) temp).calculatePerimeter() + "  Units");
						((Rectangle) temp).diagonals();
						;
					}
				}
			}
				break;
			case 4: {
				exit = true;
				System.out.println("\n EXITING......\nEXITED");
			}
				break;
			default: {
				System.out.println("\n Please enter valid choice");
			}
			}

		} while (!exit);
		sc.close();
	}

}

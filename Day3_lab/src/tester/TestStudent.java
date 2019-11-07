package tester;
import java.util.Scanner;
import com.cdac.core.Student;

class TestStudent
{
	public static void main(String[] args)
	{
		int studentNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nHow many students ? ");
		studentNumber=sc.nextInt();
		Student arrOfStudent[]=new Student[studentNumber];
		for(int i=0;i<arrOfStudent.length;i++)
		{
			System.out.println("\nEnter student name,email and age: ");
			arrOfStudent[i]=new Student(sc.next(),sc.next(),sc.nextInt());
			arrOfStudent[i].computeGPA();
		}
		System.out.println("\nStudent details: ");
		for(Student tempStudent : arrOfStudent)
		{
			System.out.println("\n"+tempStudent.getStudentDetails());
		}
		double max=0;
		int temp=0;
		for(int i=0;i<arrOfStudent.length;i++)
		{
			if(arrOfStudent[i].getStudentGPA()>max)
			{
				max=arrOfStudent[i].getStudentGPA();
				temp=i;
			}
		}
		System.out.println("\n "+arrOfStudent[temp].getStudentName()+" has highest GPA with "+arrOfStudent[temp].getStudentGPA());
	}
}
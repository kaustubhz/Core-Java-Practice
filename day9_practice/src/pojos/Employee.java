package pojos;

import javax.persistence.*;

@Entity
@Table(name = "prac_emp")
public class Employee extends AbstractEntity {
	@Column(length = 20, name = "ename")
	private String name;

	private double salary;
	@ManyToOne
	@JoinColumn(name = "dept")
	private Department dept;

	public Employee() {
		System.out.println("In Employee default CTOR");
	}

	public Employee(String name, double salary) {
		System.out.println("In Employee parm CTOR");
		this.name = name;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", Id=" + getId() + "]";
	}

	

}

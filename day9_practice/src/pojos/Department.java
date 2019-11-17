package pojos;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "prac_dept")
public class Department extends AbstractEntity {
	@Column(length = 20, unique = true, name = "dname")
	private String name;
	@Column(length = 20)
	private String location;

	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL,orphanRemoval =true)
	private List<Employee> employees = new ArrayList<>();

	public Department() {
		System.out.println("In Department default CTOR");
	}

	public Department(String name, String location) {
		System.out.println("In Department parm CTOR");
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location + "]";
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
		e.setDept(this);
	}

	public void removeEmployee(Employee e) {
		employees.remove(e);
		e.setDept(null);
		
	}
}

package pojos;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "vendor")
public class Vendor {
	private Integer id;
	private String name,email,password,city,phone;
	private LocalDate regDate;
	private double regAmount;
	
	
	public Vendor() {
		System.out.println("\n In Default CTOR of Vendor");
	}


	public Vendor(String name, String email, String password, String city, String phone, LocalDate regDate,
			double regAmount) {
		super();		
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.phone = phone;
		this.regDate = regDate;
		this.regAmount = regAmount;
	}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "vendor_id")
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "vendor_name",length = 20)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "vendor_email",length = 20)
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "vendor_password",length = 20)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "vendor_city",length = 20)
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "vendor_phone",length = 10)
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	@Column(name = "vendor_reg_date")
	public LocalDate getRegDate() {
		return regDate;
	}


	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	@Column(name = "vendor_reg_amount")
	public double getRegAmount() {
		return regAmount;
	}


	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}


	@Override
	public String toString() {
		return "\n Vendor [ Id=" + id + ", Name=" + name + ", email=" + email + ", City=" + city + ", Phone=" + phone
				+ ", Registered Date=" + regDate + ", Registered Amount=" + regAmount + "]";
	}
	
	
	
	
}

package pojos;
import javax.persistence.*;//annotation from JPA

import java.io.Serializable;
import java.util.Date;

@Entity //MANDATORY
@Table(name = "dac_users")
public class User implements Serializable {
//	ID must be serializable
	private Integer userID;
	private String userName, userEmail, userPassword, userRole, userConfirmPassword;
	private double userRegAmount;
	private Date regDate;
	private UserType userType;
	private byte[] userImage;
	
	public User() {
		System.out.println("\n In User CTOR");
	}

	public User(String userName, String userEmail, String userPassword, String userConfirmPassword,String userRole, 
			double userRegAmount, Date regDate, UserType userType) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userConfirmPassword = userConfirmPassword;
		this.userRole = userRole;
		this.userRegAmount = userRegAmount;
		this.regDate = regDate;
		this.userType = userType;
	}

//	MUST supply all Getters and Setters
	@Id //MANDATORY for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment
	@Column(name = "user_id")
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	
	@Column(name = "user_name",length = 30)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "user_email",length = 30,unique = true)
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_password",length = 15)
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "user_role")
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Transient//ignores
	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}

	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}
	
	@Column(name = "user_reg_amount")
	public double getUserRegAmount() {
		return userRegAmount;
	}

	public void setUserRegAmount(double userRegAmount) {
		this.userRegAmount = userRegAmount;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "user_reg_date")
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "user_type")
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
@Lob//large object
@Column(name = "user_image")
	public byte[] getUserImage() {
		return userImage;
	}

	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}

	@Override
	public String toString() {
		return "User [ \nID=" + userID + ", Name=" + userName + ", Email=" + userEmail + ", Role="
				+ userRole + ",\n Registered Amount=" + userRegAmount + ", Date=" + regDate + ", Type=" + userType
				+ " \n]";
	}
	
	
	
}

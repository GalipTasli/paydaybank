package infonal.PayDayBank.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId ;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_email_address")
	private String emailAddress;
	
	@Column(name="user_password")
	private String password;
	
	@Column(name="user_title")
	private String title;
	
	public User() {}

	public User(int id, String name, String emailAddress, String password, String title) {
		super();
		this.userId = id;
		this.userName = name;
		this.emailAddress = emailAddress;
		this.password = password;
		this.title = title;
	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	


}

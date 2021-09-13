package infonal.PayDayBank.entities.dtos;
//email ve şirfre doğrulamalarını yapmak için kullanacağımı dto nesnesi
public class Verification {
	private String emailAddress;

	private String password;

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

}

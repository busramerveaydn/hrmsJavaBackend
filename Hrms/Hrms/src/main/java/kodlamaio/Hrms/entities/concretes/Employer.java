package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity

@Table(name = "employers")

@PrimaryKeyJoinColumn(name = "id")

@NoArgsConstructor
public class Employer extends User{
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_address")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_activated")
	private boolean isActivated;

	public Employer(int id, String email, int password, String companyName, String webAddress, String phoneNumber,
			boolean isActivated) {
		super(id, email, password);
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.isActivated = isActivated;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	
}

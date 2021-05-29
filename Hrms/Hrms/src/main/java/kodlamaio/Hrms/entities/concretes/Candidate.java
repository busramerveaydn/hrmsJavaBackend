package kodlamaio.Hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data

@Entity

@Table(name = "candidates")

@EqualsAndHashCode(callSuper = false)

@NoArgsConstructor

@AllArgsConstructor

public class Candidate extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_date", columnDefinition = "DATE")
	private Date birthDate;
	
}

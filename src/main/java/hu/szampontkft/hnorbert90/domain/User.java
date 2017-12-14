package hu.szampontkft.hnorbert90.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	@Size(min = 5, max = 30)
	private String nev;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Size(min = 5, max = 30)
	private String password;

	public User() {
		super();
	}

	public User(String nev, String email, String password) {
		this.nev = nev;
		this.email = email;
		this.password = password;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

}

package hu.szampontkft.hnorbert90.service;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import hu.szampontkft.hnorbert90.domain.User;
import hu.szampontkft.hnorbert90.repository.UserRepository;

@Service
@Validated
public class UserService {
	@Autowired
	UserRepository userRepository;

	public void newUser(@NotNull String nev, @NotNull String email,@NotNull String password ) {
		User user = new User(nev, email, password);
		userRepository.save(user);
	}
	
	public void deleteUser(@NotNull Long id) {
		userRepository.delete(id);
	}
	
	public void updateUser(@NotNull Long id,@NotNull String nev, @NotNull String email,@NotNull String password ) {
		User user = userRepository.findOne(id);
		user.setEmail(email);
		user.setNev(nev);
		user.setPassword(password);
		userRepository.save(user);
	}

}

package hu.szampontkft.hnorbert90.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.szampontkft.hnorbert90.domain.User;

@Component
public class UserPopulator {
	
	@Autowired
	UserRepository userRepository;
	
	@PostConstruct
	public void createTestUsers() {
		for(int i=0; i<10; i++) {
			userRepository.save(new User("user"+i,"email@email.hu"+i,"passoword"+i));
		}
	}
}

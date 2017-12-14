package hu.szampontkft.hnorbert90.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.szampontkft.hnorbert90.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	List<User> findAll();
}

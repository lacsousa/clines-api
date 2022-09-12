package br.com.caelum.clines.api.users;

import java.util.Collection;

import org.springframework.data.repository.Repository;

import br.com.caelum.clines.shared.domain.User;

public interface UserRepository extends Repository<User, Long> {

	Collection<User> findAll();

}

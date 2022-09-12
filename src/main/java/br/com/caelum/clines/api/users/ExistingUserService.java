package br.com.caelum.clines.api.users;

import java.util.Optional;

import br.com.caelum.clines.shared.domain.User;

public interface ExistingUserService {
	Optional<User> findCode(String code);
}

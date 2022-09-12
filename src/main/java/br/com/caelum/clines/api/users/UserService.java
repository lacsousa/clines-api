package br.com.caelum.clines.api.users;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private final UserRepository repository;
	private final UserViewMapper viewMapper;

	public List<UserView> findAll() {
		return repository.findAll().stream().map(viewMapper::map).collect(toList());
	}

}

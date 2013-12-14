package br.edu.uniritter.liquid.democracy.service;

import br.edu.uniritter.liquid.democracy.model.User;

public interface SecurityService {

	User authenticate(User user);
	
	void create(User user);
}

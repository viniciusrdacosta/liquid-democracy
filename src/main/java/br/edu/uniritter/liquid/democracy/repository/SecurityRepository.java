package br.edu.uniritter.liquid.democracy.repository;

import br.edu.uniritter.liquid.democracy.model.User;

public interface SecurityRepository  {
	
	User authenticate(User user);
	
	void create(User user);

}

package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.User;
import br.edu.uniritter.liquid.democracy.repository.UserRepository;

@Component
public class UserDao extends AbstractDao<User> implements UserRepository {

	protected UserDao(EntityManager entityManager) {
		super(entityManager);
	}
}

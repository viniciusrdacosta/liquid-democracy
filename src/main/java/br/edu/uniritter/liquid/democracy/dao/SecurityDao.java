package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.User;
import br.edu.uniritter.liquid.democracy.repository.SecurityRepository;

@Component
public class SecurityDao extends AbstractDao<User> implements SecurityRepository {

	protected SecurityDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public User authenticate(final User user) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("email", user.getEmail().toLowerCase()));
		criteria.add(Restrictions.eq("password", user.getPassword()));
		return findUniqCriteria(criteria);
	}
}

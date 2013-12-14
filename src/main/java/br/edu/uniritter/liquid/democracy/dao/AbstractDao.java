package br.edu.uniritter.liquid.democracy.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public abstract class AbstractDao<T> {
	
	protected final EntityManager entityManager;
	protected final Class<T> clazz;

	@SuppressWarnings("unchecked")
	protected AbstractDao(EntityManager entityManager) {
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		this.entityManager = entityManager;
		this.clazz = clazz;
	}
	
	public void create(T entity) {
		entityManager.persist(entity);
	}
	
	public T update(T entity) {
		return entityManager.merge(entity);
	}
	
	public void delete(T entity) {
		entityManager.remove(entity);
	}
	
	public T findById(Long id) {
		return entityManager.find(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	public T findUniqCriteria(Criteria criteria){
		List<T> list = criteria.list();
		T entity = null;
		if(!list.isEmpty() && list.size() == 1)
			entity = list.get(0);

		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query query = entityManager.createQuery("from " + clazz.getName());
		List<T> resultList = query.getResultList();
		return resultList;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByName(String name) {
		Criteria criteria = getSession().createCriteria(clazz.getName());
		criteria.add(Restrictions.ilike("name", name.toUpperCase(), MatchMode.START));
		return criteria.list();
	}
	
	
	public Session getSession(){
		Session session;
		session = (Session) entityManager.getDelegate();
		return session;
	}
}
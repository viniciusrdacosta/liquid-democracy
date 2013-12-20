package br.edu.uniritter.liquid.democracy.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.User;
import br.edu.uniritter.liquid.democracy.repository.SecurityRepository;
import br.edu.uniritter.liquid.democracy.service.SecurityService;
import br.edu.uniritter.liquid.democracy.utils.SecurityUtils;

@Component
public class SecurityServiceImpl implements SecurityService {

	private final SecurityRepository repository;

	public SecurityServiceImpl(SecurityRepository repository) {
		this.repository = repository;
	}

	@Override
	public User authenticate(User user) {
		try {
			String cipherPassword = SecurityUtils.cipher(user.getPassword());
			user.setPassword(cipherPassword);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
		return repository.authenticate(user);
	}

	@Override
	public void create(User user) {
		try {
			String cipherPassword = SecurityUtils.cipher(user.getPassword());
			user.setPassword(cipherPassword);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		repository.create(user);
	}

}

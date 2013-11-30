package br.edu.uniritter.liquid.democracy.service.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.repository.AreaRepository;
import br.edu.uniritter.liquid.democracy.service.AreaService;

@Component
public class AreaServiceImpl implements AreaService{
	
	
	private final AreaRepository repository;
	
	public AreaServiceImpl(AreaRepository repository){
		
		this.repository = repository;
		
	}

	@Override
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}

}

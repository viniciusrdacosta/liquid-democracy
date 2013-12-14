package br.edu.uniritter.liquid.democracy.service;

import java.util.Properties;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import br.edu.uniritter.liquid.democracy.model.Candidate;
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.model.Organization;

public class Teste {

	@Test
	public void test() {
		Configuration config = new Configuration();
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		//properties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/Test"); 
		//properties.put("hibernate.connection.username", "username");
		//properties.put("hibernate.connection.password", "password");
		//properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
		properties.put("hibernate.show_sql", "true");
		config.setProperties(properties);

		config.addAnnotatedClass(Candidate.class);
		config.addAnnotatedClass(Citizen.class);
		config.addAnnotatedClass(Organization.class);
		
		SchemaExport schemaExport = new SchemaExport(config);
		schemaExport.setDelimiter(";");
		
		schemaExport.create(true, false);
	}

}

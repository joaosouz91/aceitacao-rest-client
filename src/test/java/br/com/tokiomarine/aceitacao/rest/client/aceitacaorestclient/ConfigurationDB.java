package br.com.tokiomarine.aceitacao.rest.client.aceitacaorestclient;

import java.util.Properties;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import br.com.tokiomarine.seguradora.aceitacao.crud.model.ParametrosAceitacao;

@Configuration
public class ConfigurationDB {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
         try {
               LocalContainerEntityManagerFactoryBean local = builder.dataSource(dataSource()).packages(getPackages()).build();
               
               configureProvider(local);
               
               local.setPersistenceUnitPostProcessors((MutablePersistenceUnitInfo persistenceUnit) -> {
              	 addEntity(persistenceUnit, ParametrosAceitacao.class);       	 
                 });  
               
               return local;
	         } catch (Exception ex) {
	         	throw new RuntimeException(ex);
	         }
	}
    
	private void addEntity(MutablePersistenceUnitInfo mutable, Class<?> clazz) {
 	   mutable.getManagedClassNames().add(clazz.getName());
 	}

    private void configureProvider(LocalContainerEntityManagerFactoryBean emf) {
    	
    	  Properties jpaProperties = new Properties();
    	  
    	  jpaProperties.setProperty("spring.jpa.properties.hibernate.id.new_generator_mappings", "true");
    	  jpaProperties.setProperty("spring.jpa.properties.hibernate.proc.param_null_passing", "true");
    	      	  
    	  emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    	  emf.setJpaProperties(jpaProperties);
    	  emf.afterPropertiesSet();
    }
    
    private String[] getPackages() {
 	   String [] packageArray = {"br.com.tokiomarine.seguradora.aceitacao.rest.client.dto","br.com.tokiomarine.seguradora.aceitacao.crud.model"};
 	   return packageArray;
    }

    
	@Bean
	public DataSource dataSource() throws NamingException {
		   
	   	  return DataSourceBuilder
	      .create()
	      .username("SSVOC4J")
	      .password("octkm4jssv")
	      .url("jdbc:oracle:thin:@srvdpxodb03a:1527:ssvm")
	      .driverClassName("oracle.jdbc.OracleDriver")
	      .build();

	}
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(emf);
	      return transactionManager;
	}
}

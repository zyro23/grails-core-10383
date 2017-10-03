package myapp

import org.grails.orm.hibernate.HibernateDatastore
import org.grails.orm.hibernate5.support.GrailsOpenSessionInViewInterceptor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PersistenceConfig {

	@Autowired
	HibernateDatastore hibernateDatastore

	@Bean
	GrailsOpenSessionInViewInterceptor openSessionInViewInterceptor_ds2() {
		GrailsOpenSessionInViewInterceptor openSessionInViewInterceptor = new GrailsOpenSessionInViewInterceptor()
		HibernateDatastore hibernateDatastore_ds2 = hibernateDatastore.getDatastoreForConnection "ds2"
		openSessionInViewInterceptor.hibernateDatastore = hibernateDatastore_ds2
		return openSessionInViewInterceptor
	}

}

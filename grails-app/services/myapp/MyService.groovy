package myapp

import grails.gorm.transactions.Transactional

@Transactional
class MyService {

	void init() {
		MyDomainDataSource myDomainDataSource = new MyDomainDataSource(name: "1")
		myDomainDataSource.save()
		MyDomainDs2 myDomainDataSource2 = new MyDomainDs2(name: "2")
		myDomainDataSource2.save()
	}

	void verify() {
		assert MyDomainDataSource.first().name == "1"
		assert MyDomainDs2.first().name == "2"
	}

}

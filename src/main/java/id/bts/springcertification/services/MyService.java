package id.bts.springcertification.services;

import id.bts.springcertification.repositories.JpaDao;

public class MyService {

	private JpaDao jpaDao;

	public JpaDao getJpaDao() {
		return jpaDao;
	}

	public void setJpaDao(JpaDao jpaDao) {
		this.jpaDao = jpaDao;
	}
	
	
}

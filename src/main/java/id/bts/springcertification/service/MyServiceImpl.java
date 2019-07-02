package id.bts.springcertification.service;

import id.bts.springcertification.repository.JpaDao;

public class MyServiceImpl {

	private JpaDao jpaDao;

	public JpaDao getJpaDao() {
		return jpaDao;
	}

	public void setJpaDao(JpaDao jpaDao) {
		this.jpaDao = jpaDao;
	}
	
	
}

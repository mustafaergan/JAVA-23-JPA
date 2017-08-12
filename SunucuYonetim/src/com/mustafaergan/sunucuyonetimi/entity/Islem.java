package com.mustafaergan.sunucuyonetimi.entity;

public class Islem {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.connection();
		
		Server server = new Server();
		server.setId(0);
		server.setName("mustafa");
		server.setPersonId("0");
		
		Server server2 = new Server();
		server2.setId(0);
		server2.setName("mustafa2");
		server2.setPersonId("0");
		
		dao.em.getTransaction().begin();
		dao.em.persist(server);
		dao.em.persist(server2);
		dao.em.getTransaction().commit();
		
//		dao.em.getTransaction().begin();
//		
//		dao.em.getTransaction().commit();
		dao.save(server2);
		Person person =new Person();
		dao.save(person);
		
	}

}

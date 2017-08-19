package com.mustafaergan.sunucuyonetimi.entity;

public class Islem2 {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.connection();
		
		Adres adres = new Adres();
		adres.setName("1112 cd.");
		dao.save(adres);
		
		Person person = new Person();
		person.setName("Mahmut");
		person.setAdres(adres);
		dao.save(person);
		
		Server sunucu = new Server();
		sunucu.setName("vektorel-window");
		sunucu.setIp("10.0.0.14");
		sunucu.setAssigneePerson(person);
		dao.save(sunucu);
		
		Server sunucu2 = new Server();
		sunucu2.setName("vektorel-window");
		sunucu2.setIp("10.0.0.100");
		sunucu2.setAssigneePerson(person);
		dao.save(sunucu2);
		
		
		Person hasan = new Person();
		hasan.setName("Hasan");
		dao.save(hasan);
		
		
		Server sunucu200 = new Server();
		sunucu200.setName("vektorel-window");
		sunucu200.setIp("10.0.0.200");
		sunucu200.setAssigneePerson(hasan);
		dao.save(sunucu200);
		
		
	}

}

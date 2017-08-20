package com.mustafaergan.sunucuyonetimi.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Islem3 {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.connection();
		Adres adres100 = new Adres();
		adres100.setName("100");
		dao.save(adres100);
		
		Adres adres200 = new Adres();
		adres200.setName("200");
		dao.save(adres200);

		Person mahmut = new Person();
		mahmut.setName("mahmut");
		mahmut.setAdres(adres100);
		dao.save(mahmut);
		
		Person hasan = new Person();
		hasan.setName("hasan");
		hasan.setAdres(adres200);
		dao.save(hasan);
		
		Yonetici karaBiyik = new Yonetici();
		karaBiyik.setIsim("Mahmut KaraBýyýk");
		karaBiyik.setPersonList(Arrays.asList(hasan,mahmut));
		dao.save(karaBiyik);
//		List<Person> personList = new ArrayList<>();
//		personList.add(hasan);
//		personList.add(mahmut);
//		karaBiyik.setPersonList(personList);
	}

}

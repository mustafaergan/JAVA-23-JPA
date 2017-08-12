package com.mustafaergan.sunucuyonetimi.entity;

public class Deneme {
	
	public static void main(String[] args) {
		Server server = new Server();
		
		Object server2 = new Server();
		
		Server server3 = (Server)server2;
		
		System.out.println(server2);
		System.out.println(server3);
		
		Person person = new Person();
		
		Object person2 = new Person();
		
		if(person2 instanceof Server){
			System.out.println("person");
		}else
			System.out.println("degil");
		
		
	}

}

package com.imooc.ioc.interfaces.Spring;

public class Main {
	public static void main(String[] args) {
		
		 OneInterface oif = new OneInterfaceImpl();
		 System.out.println(oif.hello("word"));
	}

}

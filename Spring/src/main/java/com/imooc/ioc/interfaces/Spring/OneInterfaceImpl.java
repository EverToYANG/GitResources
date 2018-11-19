package com.imooc.ioc.interfaces.Spring;

public class OneInterfaceImpl implements OneInterface{

	public String hello(String word) {
		return "Word form interface\"OneInterface\";" + word;
	}
}

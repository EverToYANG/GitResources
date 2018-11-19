package com.imooc.ioc.injection.dao;

public class InjectionDAOImpl implements InjectionDAO{

	public void save(String arg) {
		//模拟数据保存操作
		System.out.println("保存数据：" + arg);
	}
}

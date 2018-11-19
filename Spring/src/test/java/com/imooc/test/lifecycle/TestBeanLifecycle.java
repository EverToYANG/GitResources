package com.imooc.test.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.bean.BeanScope;
import com.imooc.ioc.interfaces.Spring.UnitTestBase;
import com.imooc.lifecycle.BeanLifeCycle;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifecycle extends UnitTestBase{
	public TestBeanLifecycle() {
		super("classpath*:spring-lifecycle.xml");
	}
	
	@Test
	public void test1() {
		super.getBean("beanLifeCycle");
	}
}

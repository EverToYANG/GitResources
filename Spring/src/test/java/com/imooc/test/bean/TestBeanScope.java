package com.imooc.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.bean.BeanScope;
import com.imooc.ioc.interfaces.Spring.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase{

	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}
	
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope3 = super.getBean("beanScope");
		beanScope3.say();
		
	
	}
	
	//虽然方法体是一样的，但是是从两个bean容器中获得的，所以hashcode不一致
	
	/*@Test
	public void testSay2() {
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}*/
	
	
}

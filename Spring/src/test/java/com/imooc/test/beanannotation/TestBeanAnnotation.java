package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.BeanAnnotation;
import com.imooc.ioc.interfaces.Spring.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase{

	public TestBeanAnnotation() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay() {
		BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
		beanAnnotation.say("This is test");
	}
}

package com.imooc.ioc.interfaces.Spring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.injection.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase{

	//注入路径配置
	public TestInjection() {
		super("classpath*:spring-injection.xml");
	}
	
	@Test
	public void testSetter() {
		InjectionService service = super.getBean("injectionService");
		service.save("这是要保存的数据");
	}
	
	@Test
	public void testCons() {
		InjectionService service = super.getBean("injectionService");
		service.save("这是要保存的数据");
	}
}

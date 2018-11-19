package com.imooc.beanannotation;

import org.springframework.stereotype.Component;

//@Component("bean")
@Component
public class BeanAnnotation {

	public void say(String arg) {
		System.out.println("BeanAnnotation:" + arg);
	}
}

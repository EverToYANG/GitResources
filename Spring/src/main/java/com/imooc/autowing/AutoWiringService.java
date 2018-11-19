package com.imooc.autowing;

public class AutoWiringService {

	//引用中传入方法
	private AutoWiringDAO autoWiringDAO;

	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}
}

package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020年1月11日10:12:41
 * @description 装饰模式
 */
//3.装饰
public abstract class Decorator extends Bird {
	
	protected Bird bird;
	
	public Decorator() {
		
	}
	
	public Decorator(Bird bird) {
		this.bird = bird;
	}
	
}

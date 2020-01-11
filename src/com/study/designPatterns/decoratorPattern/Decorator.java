package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020��1��11��10:12:41
 * @description װ��ģʽ
 */
//3.װ��
public abstract class Decorator extends Bird {
	
	protected Bird bird;
	
	public Decorator() {
		
	}
	
	public Decorator(Bird bird) {
		this.bird = bird;
	}
	
}

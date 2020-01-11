package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020年1月11日10:12:41
 * @description 装饰模式
 */
//2.具体组件
public class Sparrow extends Bird {
	
	public final int DISTANCE = 100;

	@Override
	public int fly() {
		
		return DISTANCE;
	}
	
}

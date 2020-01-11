package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020年1月11日10:12:41
 * @description 装饰模式
 */
//4.具体装饰
public class SparrowDecorator extends Decorator {
	
	public final int DISTANCE = 50; 		//eleFly方法能飞50米
	
	public SparrowDecorator(Bird bird) {
		super(bird);						//调用父类有参构造函数
	}
	
	@Override
	public int fly() {
		int distance = 0;
		distance = bird.fly() + eleFly();	//委托被装饰者bird调用fly(),然后再调用eleFly()
		return distance;
	}
	
	private int eleFly() {					//装饰者新添加的方法
		return DISTANCE;
	}
}

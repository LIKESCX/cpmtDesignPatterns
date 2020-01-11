package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020年1月11日10:12:41
 * @description 装饰模式
 */
//第二个装饰者
public class SparrowDecoratorTwo extends Decorator {
	public final int DISTANCE = 20;		//eleFly方法能飞20米
	public SparrowDecoratorTwo(Bird bird) {
		super(bird);
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

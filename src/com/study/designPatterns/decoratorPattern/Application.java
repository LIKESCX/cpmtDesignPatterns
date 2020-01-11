package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020年1月11日10:12:41
 * @description 装饰模式
 */
//5.测试类
public class Application {
	
	public void needBird(Bird bird) {
		int flyDistance = bird.fly();
		System.out.println("这只鸟能飞行"+flyDistance +"米");
	}
	
	public static void main(String[] args) {
		Application client = new Application();	
		Sparrow sparrow = new Sparrow();					//sparrow能飞行100米
		SparrowDecorator sparrowDecorator1 = 
				new SparrowDecorator(sparrow);				//sparrowDecorator1能飞行150米
		SparrowDecorator sparrowDecorator2 = 
				new SparrowDecorator(sparrowDecorator1);	//sparrowDecorator2能飞行200米
		
		client.needBird(sparrowDecorator1);
		client.needBird(sparrowDecorator2);

	}

}

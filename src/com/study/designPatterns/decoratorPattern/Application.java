package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020��1��11��10:12:41
 * @description װ��ģʽ
 */
//5.������
public class Application {
	
	public void needBird(Bird bird) {
		int flyDistance = bird.fly();
		System.out.println("��ֻ���ܷ���"+flyDistance +"��");
	}
	
	public static void main(String[] args) {
		Application client = new Application();	
		Sparrow sparrow = new Sparrow();					//sparrow�ܷ���100��
		Bird sparrowDecorator1 = 
				new SparrowDecorator(sparrow);				//sparrowDecorator1�ܷ���150��
		Bird sparrowDecorator2 = 
				new SparrowDecorator(sparrowDecorator1);	//sparrowDecorator2�ܷ���200��
		
		client.needBird(sparrowDecorator1);
		client.needBird(sparrowDecorator2);
		
		Bird bird1 = new SparrowDecoratorTwo(new Sparrow());
		Bird bird2 = new SparrowDecorator(bird1);
		Bird bird3 = new SparrowDecorator(bird2);
		Bird bird4 = new SparrowDecoratorTwo(bird3);
		client.needBird(bird1);
		client.needBird(bird2);
		client.needBird(bird3);
		client.needBird(bird4);
	}

}

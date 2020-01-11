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
		SparrowDecorator sparrowDecorator1 = 
				new SparrowDecorator(sparrow);				//sparrowDecorator1�ܷ���150��
		SparrowDecorator sparrowDecorator2 = 
				new SparrowDecorator(sparrowDecorator1);	//sparrowDecorator2�ܷ���200��
		
		client.needBird(sparrowDecorator1);
		client.needBird(sparrowDecorator2);

	}

}

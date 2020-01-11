package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020��1��11��10:12:41
 * @description װ��ģʽ
 */
//4.����װ��
public class SparrowDecorator extends Decorator {
	
	public final int DISTANCE = 50; 		//eleFly�����ܷ�50��
	
	public SparrowDecorator(Bird bird) {
		super(bird);						//���ø����вι��캯��
	}
	
	@Override
	public int fly() {
		int distance = 0;
		distance = bird.fly() + eleFly();	//ί�б�װ����bird����fly(),Ȼ���ٵ���eleFly()
		return distance;
	}
	
	private int eleFly() {					//װ��������ӵķ���
		return DISTANCE;
	}
}

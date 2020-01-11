package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020��1��11��10:12:41
 * @description װ��ģʽ
 */
//�ڶ���װ����
public class SparrowDecoratorTwo extends Decorator {
	public final int DISTANCE = 20;		//eleFly�����ܷ�20��
	public SparrowDecoratorTwo(Bird bird) {
		super(bird);
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

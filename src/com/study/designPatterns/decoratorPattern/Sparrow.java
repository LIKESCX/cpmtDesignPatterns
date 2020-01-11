package com.study.designPatterns.decoratorPattern;
/**
 * @author shangchuanxiang
 * @date 2020��1��11��10:12:41
 * @description װ��ģʽ
 */
//2.�������
public class Sparrow extends Bird {
	
	public final int DISTANCE = 100;

	@Override
	public int fly() {
		
		return DISTANCE;
	}
	
}

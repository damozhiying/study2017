package com.edu.tery.composite;
/**
 * @author Create by tery007
 * @date   2017��8��23��
 *���ģʽ���ó�����
 *1�����������벿�ֵĹ�ϵ
 *2�����÷�����������벿�ֵ�����
 */
public class Test {

	public static void main(String[] args) {
		Picture p=new Picture();
		p.add(new Line());
		p.add(new Rectangle());
		
		Picture sub=new Picture();
		sub.add(new Text());
		sub.add(new Line());
		sub.add(new Rectangle());
		
		p.add(sub);
		p.draw();
	}
}

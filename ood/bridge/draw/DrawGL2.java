package com.edu.tery.bridge.draw;
/**
 * @author Create by tery007
 * @date   2017��8��26��
 *
 */
public class DrawGL2 implements Draw{

	@Override
	public void drawCircle(int x, int y, int r) {
		System.out.println("��һ��Բ��Ϊ("+x+","+y+"),�뾶Ϊ��"+r+"��Բ��");
	}

	@Override
	public void drawTriangle(int a, int b, int c, int degree) {
		System.out.println("��һ���߳��ֱ�Ϊa:"+a+" b:"+b+" c:"+c+" b��c�ļн�Ϊ:"+degree+"���������");
	}

}

package com.edu.tery.bridge.shape;

import com.edu.tery.bridge.draw.Draw;

/**
 * @author Create by tery007
 * @date   2017��8��26��
 *bridge�Ž�ģʽ�����仯�Ĳ��ֳַ����������Ĳ���A��B��A����B
 *�˰�������һ��ͼ�ο⣬��һ�����߿⣬��ͬ��ͼ�ο��еĶ���������ù��߿�Ĳ�ͬ��������ʵ�ֻ�ͼ
 */
public interface Shape {

	void setDrawing(Draw draw);
	void draw();
}

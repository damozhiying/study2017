package com.edu.tery.bridge.shape;

import com.edu.tery.bridge.draw.Draw;

/**
 * @author Create by tery007
 * @date   2017��8��26��
 *
 */
public class CircleShape implements Shape{

	private int x,y,r;
	private Draw draw;
	@Override
	public void setDrawing(Draw draw) {
		this.draw=draw;
	}
	public void draw(){
		draw.drawCircle(x,y,r);
	}

	public CircleShape(int x,int y,int r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	
}

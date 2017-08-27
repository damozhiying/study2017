package com.edu.tery.command.cmd;

import com.edu.tery.command.Cook;

/**
 * @author Create by tery007
 * @date   2017��8��27��
 *
 */
public class OrderPorkCommand implements Command{

	private Cook cook;
	public OrderPorkCommand(Cook cook) {
		this.cook=cook;
	}
	@Override
	public void excute() {
		cook.cookPork();
	}

}

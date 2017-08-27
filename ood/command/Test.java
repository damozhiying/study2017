package com.edu.tery.command;

import com.edu.tery.command.cmd.Command;
import com.edu.tery.command.cmd.OrderPorkCommand;
import com.edu.tery.command.cmd.OrderSteakCommand;

/**
 * @author Create by tery007
 * @date   2017��8��27��
 *
 */
public class Test {

	public static void main(String[] args) {
		Cook cook=new Cook();//
		Waiter waiter=new Waiter();//����Ա����
		Command cmd1=new OrderPorkCommand(cook);
		Command cmd2=new OrderSteakCommand(cook);
		waiter.addOrder(cmd1);
		waiter.addOrder(cmd2);
		waiter.sendOrders();
	}
}

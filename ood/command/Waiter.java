package com.edu.tery.command;

import com.edu.tery.command.cmd.Command;

/**
 * @author Create by tery007
 * @date   2017��8��27��
 *��С��
 */
public class Waiter {

	Command[] cmds=new Command[2];
	int p=0;
	void addOrder(Command command){
		cmds[p++]=command;
	}
	void sendOrders(){
		for(int i=0;i<p;i++){
			cmds[i].excute();
		}
	}
}

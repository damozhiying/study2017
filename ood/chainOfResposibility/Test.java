package com.edu.tery.chainOfResposibility;
/**
 * @author Create by tery007
 * @date   2017��8��27��
 *
 */
public class Test {

	public static void main(String[] args) {
		Logger logger=new StandardLogger(Logger.DEBUG).setNext(new EmailLogger(Logger.NOTICE).setNext(new FileLogger(Logger.ERR)));
		logger.message("�������", Logger.DEBUG);
		logger.message("�����ʼ�", Logger.NOTICE);
	}
}

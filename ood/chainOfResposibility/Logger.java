package com.edu.tery.chainOfResposibility;
/**
 * @author Create by tery007
 * @date   2017��8��27��
 *������ģʽ��
 *Ӧ�ó�������һ������֪����˭�����ʱ��
 */
public abstract class Logger {

	Logger nextLogger;
	public String type;
	
	public static final String DEBUG="debug";
	public static final String NOTICE="notice";
	public static final String ERR="error";
	public Logger setNext(Logger logger) {
		this.nextLogger=logger;
		return this;
	}

	public abstract void message(String msg, String type);
	

}

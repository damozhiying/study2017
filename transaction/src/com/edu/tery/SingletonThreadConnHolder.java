package com.edu.tery;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Create by tery007
 * @date   2017��8��6��
 *�̰߳�ȫ
 *��֤һ���̶߳����ݿ�Ķ�β�������Ӧ��connection����ͬһ��
 *�������
 */
public class SingletonThreadConnHolder {

	//ThreadLocal��ÿ���̶߳�������һ��Connection����
	private static ThreadLocal<ConnectionHolder> threadLocal=new ThreadLocal<>();
	
	//Ϊÿ���̴߳���һ��connectionHolder����
	public static ConnectionHolder getConnectionHolder(){
		ConnectionHolder holder=threadLocal.get();
		if(holder==null){
			holder=new ConnectionHolder();
			threadLocal.set(holder);
		}
		return holder;
	}
	
	//��connectionHolder�����ȡ���ݿ�����
	public static Connection getConnection(DataSource source) throws SQLException{
		return getConnectionHolder().getConnection(source);
	}
}

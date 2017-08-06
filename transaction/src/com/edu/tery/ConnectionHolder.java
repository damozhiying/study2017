package com.edu.tery;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

/**
 * @author Create by tery007
 * @date   2017��8��6��
 * 
 *ʵ��DataSource�����ݿ�ܵ���·��
 *���̰߳�ȫ
 */
public class ConnectionHolder {

	//��map��֤ÿ������Դ��connection����һһ��Ӧ
	private Map<DataSource,Connection> map=new HashMap<DataSource, Connection>();
	//�ⲿ��ȡconnection�Ľӿ�
	public Connection getConnection(DataSource source) throws SQLException{
		Connection conn=map.get(source);
		if(conn==null || conn.isClosed()){
			conn=source.getConnection();
			map.put(source, conn);
		}
		return conn;
	}
	
}

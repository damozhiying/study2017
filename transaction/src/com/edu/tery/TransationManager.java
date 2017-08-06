package com.edu.tery;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Create by tery007
 * @date   2017��8��6��
 *���������
 */
public class TransationManager {

	private DataSource source;
	
	public TransationManager(DataSource source){
		this.source=source;
	}
	
	public Connection getConnection() throws SQLException{
		return SingletonThreadConnHolder.getConnection(source);
	}
	
	//��������
	public void start() throws SQLException{
		Connection connection=getConnection();
		connection.setAutoCommit(false);
	}
	
	//�ع�����
	public void rollback(){
		Connection connection=null;
		try {
			connection=getConnection();
			connection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//�ر�����
	public void closeTransaction(){
		Connection connection=null;
		try {
			connection=getConnection();
			connection.setAutoCommit(false);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

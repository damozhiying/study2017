package com.edu.tery;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Create by tery007
 * @date   2017��8��6��
 *ģ������һ���߳�ȡ��
 */
public class AchieveDataJobDao {

	private DataSource source;
	
	public AchieveDataJobDao(DataSource source){
		this.source=source;
	}
	
	public void achieveData() throws SQLException{
		Connection connection=SingletonThreadConnHolder.getConnection(source);
		
		System.out.println("@��ǰȡ�����߳�Ϊ��"+Thread.currentThread().getName());
		System.out.println("@ȡ���ݵĹܵ�Ϊ��"+connection.hashCode());
	}
}

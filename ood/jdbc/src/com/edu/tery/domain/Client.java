package com.edu.tery.domain;

import java.sql.Connection;

import com.edu.tery.driver.JDBCDriver;
import com.edu.tery.properties.Properties;

/**
 * @author Create by tery007
 * @date   2017��8��17��
 *ģ��ͻ��˻�ȡmysql����
 */
public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class<?> clz=Class.forName("com.edu.tery.mysql.MysqlDriver");//װ��MysqlDriver
			JDBCDriver factory=(JDBCDriver)clz.newInstance();
			Properties info=new Properties();
			info.put("host", "localhost");
			info.put("port", "3306");
			info.put("database", "student");
			info.put("username", "root");
			info.put("password", "root");
			//����MysqlConnection
			Connection conn=factory.create(info);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}

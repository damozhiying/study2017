package com.edu.tery.db2;

import java.sql.Connection;

import com.edu.tery.driver.JDBCDriver;
import com.edu.tery.properties.Properties;

/**
 * @author Create by tery007
 * @date   2017��8��17��
 *	DB2��Driver�����࣬���𴴽�һ��DB2����
 */
public class DB2Driver implements JDBCDriver{

	
	public Connection create(Properties info){
		return new DB2Connection(info);
	}
}

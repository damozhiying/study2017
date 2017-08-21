package com.edu.tery.factory.db2;

import java.sql.Connection;

import com.edu.tery.factory.driver.JDBCDriver;
import com.edu.tery.factory.properties.Properties;


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

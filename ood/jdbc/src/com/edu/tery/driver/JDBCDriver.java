package com.edu.tery.driver;

import java.sql.Connection;

import com.edu.tery.properties.Properties;

/**
 * @author Create by tery007
 * @date   2017��8��17��
 *
 *JDBC��DriverFactory�����������ݿ������ĳ���
 */
public interface JDBCDriver {

	public Connection create(Properties info);
}

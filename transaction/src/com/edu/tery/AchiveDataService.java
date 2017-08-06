package com.edu.tery;

import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Create by tery007
 * @date   2017��8��6��
 *ģ��ȡ��Service
 */
public class AchiveDataService implements Runnable{

	private AchieveDataDao achieveDataDao;
	private AchieveDataJobDao dataJobDao;
	private TransationManager manager;
	
	//��ʼ��ʱ���������඼����ͬһ��DataSource����
	public AchiveDataService(DataSource source){
		achieveDataDao=new AchieveDataDao(source);
		dataJobDao=new AchieveDataJobDao(source);
		manager=new TransationManager(source);
	}
	public void  beginGetData(){
		try {
			manager.start();
			achieveDataDao.achieveData();
			dataJobDao.achieveData();
			manager.closeTransaction();
		} catch (SQLException e) {
			e.printStackTrace();
			manager.rollback();
		}
		
	}
	@Override
	public void run() {
		beginGetData();
	}
}

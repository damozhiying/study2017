package com.edu.tery.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Create by tery007
 * @date   2017��8��23��
 *���ģʽ�ı���
 */
public class Employee {

	private String name;
	private String dept;//����
	private List<Employee> subordinates=new ArrayList<>();//����
	
	public void add(Employee employee){
		this.subordinates.add(employee);
	}
	
	public List<Employee> getSubordinates(){
		return this.subordinates;
	}
	
	public String toString(){
		return ("Employee :[name:"+name+",dept:"+dept+"]");
	}
}

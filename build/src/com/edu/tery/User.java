package com.edu.tery;
/**
 * @author Create by tery007
 * @date   2017��8��20��
 *ʹ�ó�������һ����Ĺ������ԱȽ϶��ʱ����builder�������Ժܷ����ʵ���������Ե�ʵ������
 */
public class User {

	private final String name;
	private final String idCardNum;
	private final int age;
	private final String address;
	private final String phone;
	private final int weight;
	
	private User(Builder builder){
		this.name=builder.name;
		this.idCardNum=builder.idCardNum;
		this.age=builder.age;
		this.address=builder.address;
		this.phone=builder.phone;
		this.weight=builder.weight;
	}
	
	public static class Builder{
		private String name;
		private String idCardNum;
		private int age;
		private String address;
		private String phone;
		private int weight;
		
		public Builder(String name,String idCardNum){
			this.name=name;
			this.idCardNum=idCardNum;
		}
		
		public Builder age(int age){
			this.age=age;
			return this;
		}
		
		public Builder address(String address){
			this.address=address;
			return this;
		}
		
		public Builder phone(String phone){
			this.phone=phone;
			return this;
		}
		
		public Builder weight(int weight){
			this.weight=weight;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
	}
	
	public static void main(String[] args) {
		User user1=new Builder("", "").address("").build();
	}
}

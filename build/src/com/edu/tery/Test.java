package com.edu.tery;

import com.edu.tery.User.Builder;

/**
 * @author Create by tery007
 * @date   2017��8��20��
 *
 */
public class Test {

	public static void main(String[] args) {
		User user=new User.Builder("", "").build();//������һ��ֻ��name��idCardNum��User
		Builder builder=new Builder("", "");//��̬�ڲ�����Բ��ð�User�Ϳ���new����
		builder.address("");
		
	}
}

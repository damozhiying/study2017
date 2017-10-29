package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *	��һ�����������ֽ���ָ�������
 */
public abstract class OneOprandCmd extends ByteCommand{

	private int oprand;//�����룬һ������ֽ�
	protected OneOprandCmd(String opcode,ClassFile clzFile) {
		super(opcode,clzFile);
		// TODO Auto-generated constructor stub
	}
	public int getOprand() {
		return oprand;
	}
	public void setOprand(int oprand) {
		this.oprand = oprand;
	}
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 2;
	}

}

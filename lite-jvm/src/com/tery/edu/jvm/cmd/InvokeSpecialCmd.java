package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *	invokespecial  indexbyte1 indexbyte2 
	��һ��������г�ʼ���� ����ĳ�ʼ���� ����˽�з���
 *
 */
public class InvokeSpecialCmd extends TwoOprandCmd{

	protected InvokeSpecialCmd(String opcode, ClassFile clzFile) {
		super(opcode, clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		
	}

}

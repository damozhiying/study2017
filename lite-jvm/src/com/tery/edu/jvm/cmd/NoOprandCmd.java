package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *	û�в��������ֽ���ָ�������
 */
public class NoOprandCmd extends ByteCommand{

	
	protected NoOprandCmd(String opcode, ClassFile clzFile) {
		super(opcode, clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLength() {
		return 1;
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		// TODO Auto-generated method stub
		
	}

}

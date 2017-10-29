package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.Heap;
import com.tery.edu.jvm.engine.JavaObject;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *Bipush byte 
�� byte ��������չΪһ�� int ���͵�ֵ value��Ȼ�� value ѹ�뵽������ջ�С�
 */
public class BipushCmd extends OneOprandCmd{

	protected BipushCmd(String opcode,ClassFile clzFile) {
		super(opcode,clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		int value=this.getOprand();
		JavaObject obj = Heap.getInstance().newInt(value);
		stackFrame.getOprandStack().push(obj);
	}

	
}

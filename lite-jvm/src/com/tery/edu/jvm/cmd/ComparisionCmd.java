package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *	�Ƚ�ָ�if_icmpeq if_icmpne if_icmplt if_icmpge if_icmpgt 
 *�Ƚ�ջ���� int ����ֵ��С�������0�Ƚϣ�������ת
 */
public class ComparisionCmd extends TwoOprandCmd{

	protected ComparisionCmd(String opcode,ClassFile clzFile) {
		super(opcode, clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		// TODO Auto-generated method stub
		
	}

}

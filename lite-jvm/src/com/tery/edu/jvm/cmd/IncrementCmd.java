package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *	iinc index const 
 *index ��һ������ǰջ֡�оֲ���������������޷��� byte ��
��������const ��һ���з��ŵ� byte ������ֵ.�� index ��λ���ľֲ���
�������� int ���ͣ�const ���ȴ�������չ��һ�� int ������ֵ��Ȼ��ӵ�
�� index ��λ���ľֲ�������
 */
public class IncrementCmd extends TwoOprandCmd{

	protected IncrementCmd(String opcode, ClassFile clzFile) {
		super(opcode, clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		// TODO Auto-generated method stub
		
	}

}

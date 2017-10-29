package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.constant.ClassInfo;
import com.tery.edu.jvm.constant.FieldRefInfo;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.JavaObject;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 * getfield indexbyte1 indexbyte2 
 *��ȡ������ֶ�ֵ:�޷����� indexbyte1 �� indexbyte2 ���ڹ���һ��
	��ǰ�������ʱ�����ص�����ֵ��������ʽΪ��indexbyte1 << 8��
| indexbyte2����������ָ�������ʱ��������Ӧ����һ���ֶ� 
 */
public class GetFieldCmd extends TwoOprandCmd{

	protected GetFieldCmd(String opcode, ClassFile clzFile) {
		super(opcode, clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		FieldRefInfo info=(FieldRefInfo)getConstantPool().getConstantInfo(this.getConstantpoolIndex());
		String name=info.getFieldName();
		JavaObject obj=stackFrame.getOprandStack().pop();
		JavaObject fieldValue=obj.getFieldValue(name);
		stackFrame.getOprandStack().push(fieldValue);
		
	}

}

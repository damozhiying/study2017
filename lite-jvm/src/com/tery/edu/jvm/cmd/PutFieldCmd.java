package com.tery.edu.jvm.cmd;

import com.tery.edu.jvm.clsMsg.ClassFile;
import com.tery.edu.jvm.constant.FieldRefInfo;
import com.tery.edu.jvm.constant.NameAndTypeInfo;
import com.tery.edu.jvm.engine.ExcutorResult;
import com.tery.edu.jvm.engine.JavaObject;
import com.tery.edu.jvm.engine.StackFrame;

/**
 * @author Create by tery007
 * @date   2017��10��18��
 *putfield indexbyte1 indexbyte2 
 *���ö����ֶ� :
 *�޷����� indexbyte1 �� indexbyte2 ���ڹ���һ����ǰ�����
��ʱ�����ص�����ֵ��������ʽΪ��indexbyte1 << 8��| indexbyte2��
��������ָ�������ʱ��������Ӧ����һ���ֶεķ������ã�����
�����ֶε����ƺ����������Լ��������ֶε���ķ������á�
 */
public class PutFieldCmd extends TwoOprandCmd{

	protected PutFieldCmd(String opcode,ClassFile clzFile) {
		super(opcode,clzFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(StackFrame stackFrame, ExcutorResult result) {
		FieldRefInfo info=(FieldRefInfo)getConstantPool().getConstantInfo(getConstantpoolIndex());
		String fieldName=info.getFieldName();
		JavaObject fieldValue=stackFrame.getOprandStack().pop();
		JavaObject ref=stackFrame.getOprandStack().pop();
		ref.setFieldValue(fieldName,fieldValue);
	}

}

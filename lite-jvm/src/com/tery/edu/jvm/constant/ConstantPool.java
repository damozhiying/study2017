package com.tery.edu.jvm.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Create by tery007
 * @date   2017��10��9��
 *	������
 */
public class ConstantPool {

	List<ConstantInfo> infos=new ArrayList<>();//�볣��������ģʽ
	public void addConstantInfo(ConstantInfo info){
		infos.add(info);
	}
	public ConstantInfo getConstantInfo(int index) {
		return infos.get(index);
	}
	public String getUTF8String(int attrNameIndex) {
		Utf8Info info=(Utf8Info)getConstantInfo(attrNameIndex);
		return info.getValue();
	}

}

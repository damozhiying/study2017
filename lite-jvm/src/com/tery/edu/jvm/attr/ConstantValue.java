package com.tery.edu.jvm.attr;
/**
 * @author Create by tery007
 * @date   2017��10��15��
 *
 */
public class ConstantValue extends AttributeInfo{

	private int  constantvalueIndex;
	public ConstantValue(int attrNameIndex, int attrLength) {
		super(attrNameIndex, attrLength);
	}
	public void  setConstantValueIndex(int constValueIndex){
		this.constantvalueIndex=constValueIndex;
	}

}

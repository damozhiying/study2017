package com.tery.edu.jvm.attr;
/**
 * @author Create by tery007
 * @date   2017��10��15��
 *	Field��Method�����Գ�����
 */
public class AttributeInfo {

	public static final String CONSTANT_VALUE="ConstantValue";
	public static final String CODE="Code";
	public static final String STACKMAPTABLE="StackMapTable";
	public static final String EXCEPTIONS="Exceptions";
	public static final String LINENUMBERTABLE="LineNumberTable";
	public static final String LOCALVARIABLETABLE="LocalVariableTable";
	
	private int attrNameIndex;
	private int attrLength;
	public AttributeInfo(int attrNameIndex,int attrLength){
		this.attrLength=attrNameIndex;
		this.attrNameIndex=attrNameIndex;
	}
	
}

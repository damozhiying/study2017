package com.tery.edu.jvm.engine;

/**
 * @author Create by tery007
 * @date 2017��10��20�� 
 * ��,δʵ����������,������һ���������ֻ����һ���ѣ�
 */
public class Heap {

	private static Heap instance = new Heap();

	private Heap() {
	}

	public static Heap getInstance() {
		return instance;
	}

	public JavaObject newObject(String clzName) {
		JavaObject javaObject = new JavaObject(JavaObject.OBJECT);
		javaObject.setClassName(clzName);
		return javaObject;
	}

	public JavaObject newString(String value) {
		JavaObject obj = new JavaObject(JavaObject.STRING);
		obj.setsValue(value);
		return obj;
	}

	public JavaObject newInt(int value) {
		JavaObject obj = new JavaObject(JavaObject.INT);
		obj.setIntValue(value);
		return obj;
	}

	public JavaObject newFloat(float value) {
		JavaObject obj = new JavaObject(JavaObject.FLOAT);
		obj.setFloatValue(value);
		return obj;
	}
}

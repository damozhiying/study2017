package com.edu.tery.arraylist;

import java.util.Arrays;

/**
 * @author Create by tery007
 * @date   2017��7��29��
 *
 */
public class ArrayList {

	private int size;
	private static final int CAMACITY = 16;
	private Object[] elementData;

	public int size() {
		return size;
	}

	public ArrayList() {
		elementData = new Object[CAMACITY];
	}

	// ��
	public void add(Object o) {
		if (isFull()) {
			increseSize();
		}
		elementData[size] = o;
		size++;
	}

	// ɾ
	public Object remove(int index) {
		if (isEmpty()) {
			throw new RuntimeException("the list is null");
		}
		if (index > elementData.length || index < 0) {
			throw new IllegalArgumentException("IllegalArgument index:" + index);
		}
		System.arraycopy(elementData, index + 1, elementData, index, size - index);
		size--;
		return elementData[index];
	}

	// ָ��λ������
	public void add(int index, Object o) {
		if (isFull()) {
			increseSize();
		}
		Object[] elements = new Object[elementData.length];
		for (int i = index; i < size && i >= 0; i++) {
			elements[i + 1] = elementData[i];
		}
		elements[index] = o;
		elementData = elements;
		size++;
		/**
		 * �ڶ��ַ�ʽ System.arraycopy(elementData, index, elementData, index+1,
		 * size-index); ��index���￪ʼ����������index+1���λ�ã���СΪ��������Ԫ�ص��ܸ�����size-index��
		 * elementData[index]=o;
		 */

	}

	// ��
	public Object get(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("the argument is an illegalArgument");
		}
		Object o = new Object();
		for (int i = 0; i < size; i++) {
			o = elementData[index];
		}
		return o;
	}

	// ����
	public void increseSize() {
		// Object[] newElementData=new Object[CAMACITY*2];
		// for(int i=0;i<newElementData.length;i++){
		// newElementData[i]=elementData[i];
		// }
		elementData = Arrays.copyOf(elementData, size * 2);

	}

	// �����Ƿ�����
	public boolean isFull() {
		if (size == elementData.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	// �����Ƿ�Ϊ��
	public boolean isEmpty() {
		return size <= 0;
	}

	public ListIterator iterator() {
		return new ListIterator();
	}

	/**
	 * ������
	 * 
	 * @author tery
	 *
	 */
	public class ListIterator implements java.util.Iterator<Object> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			return currentIndex < size;
		}

		@Override
		public Object next() {
			Object o = new Object();
			o = elementData[currentIndex++];
			return o;
		}

		/**
		 * ɾ����ǰ�����Ķ����ȵ���next�������ٵ���ɾ������
		 */
		@Override
		public void remove() {
			System.arraycopy(elementData, currentIndex, elementData, currentIndex - 1, size - currentIndex + 1);
			currentIndex--;// ���뽫������1����֤��������ȷ��
			size--;
		}
	}
}

package com.tery.edu.jvm.util;

import java.util.Arrays;

/**
 * @author Create by tery007
 * @date   2017��10��9��
 *	��ȡָ�����ȵ��ֽ��룬��ת��Ϊ��Ҫ������
 */
public class BinaryCodeIterator {

	byte[] codes;
	int position=0;
	public BinaryCodeIterator(byte[] codes) {
		this.codes=codes;
	}
	
	public byte[] getBytes(int len){
		if(position+len>=codes.length){
			throw new IndexOutOfBoundsException();
		}
		byte[] bytes=Arrays.copyOfRange(codes, position, position+len);
		position+=len;
		return bytes;
	}
	
	public String nextU4ToHexString() {
		return Util.byteToHexString(new byte[]{codes[position++],codes[position++],codes[position++],codes[position++]});
		
	}
	public int nextU2ToInt() {
		return Util.byteToInt(new byte[]{codes[position++],codes[position++]});
	}
	public int nextU1ToInt() {
		return Util.byteToInt(new byte[]{codes[position++]});
	}

	public int nextU4ToInt() {
		return Util.byteToInt(new byte[]{codes[position++],codes[position++],codes[position++],codes[position++]});
	}

	public String nextUxToHexString(int codeLength) {
		byte[] codes=getBytes(codeLength);
		return Util.byteToHexString(codes);
	}

	public void back(int len) {
		position-=len;
	}

	
}

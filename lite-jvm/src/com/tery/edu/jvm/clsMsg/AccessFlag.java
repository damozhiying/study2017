package com.tery.edu.jvm.clsMsg;
/**
 * @author Create by tery007
 * @date   2017��10��9��
 *	���ʱ�־,�ܶೡ���»��õ������Գ����һ����
 */
public class AccessFlag {

	private int accessFlagValue;

	public AccessFlag(int accessFlagValue){
		this.accessFlagValue=accessFlagValue;
	}
	public int getAccessFlagValue() {
		return accessFlagValue;
	}

	public void setAccessFlagValue(int accessFlagValue) {
		this.accessFlagValue = accessFlagValue;
	}
	/**
	 * �Ƿ���PUBLIC
	 * @return
	 */
	public boolean isPublicAccess(){
		return (this.accessFlagValue & 0x0001) != 0;
	}
	/**
	 * �Ƿ���FINAL
	 * @return
	 */
	public boolean isFinalAccess(){
		return (this.accessFlagValue & 0x0010) != 0;
	}
}

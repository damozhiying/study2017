package v1;

import v1.Test;

/**
 * @author Create by tery007
 * @date   2017��9��1��
 *
 */
public class TestFailure {

	protected Test faildedTest;//����ʧ�ܵ�test
	protected Throwable thrownException;//��Ӧ�׳����쳣
	
	public TestFailure(Test faildedTest, Throwable thrownException) {
		this.faildedTest=faildedTest;
		this.thrownException=thrownException;
	}
	/**
	 * Gets the failed test.
	 */
	public Test getFaildedTest(){
		return faildedTest;
	}
	/**
	 * Gets the thrown exception.
	 */
	public Throwable thrownException(){
		return thrownException;
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append(faildedTest+":"+thrownException.getMessage());
		return sb.toString();
	}
}

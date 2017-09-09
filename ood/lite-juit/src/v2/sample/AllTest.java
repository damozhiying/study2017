package v2.sample;

import v2.Test;
import v2.TestSuite;
import v2.extend.TestSetUp;

/**
 * @author Create by tery007
 * @date   2017��9��4��
 *
 */
public class AllTest {

	public static Test suite(){
		TestSuite suite=new TestSuite("All test");
		suite.addTest(CalculatorSuite.suite());
		return suite;//�Ǿ�̬�ڲ���д����new AllTest().new OverAllTestSetup(suite)����ʵ�������
	}
	
	static class OverAllTestSetup extends TestSetUp{
		OverAllTestSetup(Test test){
			super(test);
		}
		protected void setUp(){
			System.out.println("All test is start");
		}
		protected void tearDown(){
			System.out.println("All test is end");
		}
	}
}

package v2.sample;

import v2.Test;
import v2.TestSuite;

/**
 * @author Create by tery007
 * @date   2017��9��4��
 *һ����������TestSuite
 */
public class CalculatorSuite {

	public static Test suite(){
		TestSuite suite=new TestSuite("Calculator All test");
		suite.addTestCase(CalculatorTest.class);
		return suite;
	}
}

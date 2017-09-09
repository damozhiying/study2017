package v2.extend;

import v2.Protectable;
import v2.Test;
import v2.TestResult;

/**
 * @author Create by tery007
 * @date   2017��9��4��
 *װ���ߣ��ڲ���ǰ�����setup��teardown����
 */
public class TestSetUp extends TestDecorator{

	public TestSetUp(Test test) {
		super(test);
	}

	public void run(final TestResult tr){
		Protectable p=new Protectable() {
			@Override
			public void protect() throws Throwable {
				setUp();
				basicRun(tr);//�����ڲ���ֻ�ܷ���final���εı�������Ϊ����final��jvm�������ڲ���Ĺ��췽����ָ��һ������Ʒ������ı䲻Ӱ��ԭ�еĶ���
				tearDown();
			}
		};
	}
	private void tearDown() {
		// TODO Auto-generated method stub
		
	}

	private void setUp() {
		// TODO Auto-generated method stub
		
	}
}

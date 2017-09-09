package v2;
/**
 * @author Create by tery007
 * @date   2017��9��3��
 *�۲���ģʽ�������ԵĽ��������Դ����չʾ�Ͳ����߼�����
 */
public interface TestListener {

	public void startTest(Test test);
	public void addFailure(Test test,Throwable t);
	public void addError(Test test,AssertionFailedError error);
	public void endTest(Test test);
}

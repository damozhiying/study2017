package v001v;
/**
 * @author Create by tery007
 * @date   2017��9��1��
 * ���������ĳ����࣬��װ��һ��ִ��ģ��
 */
public abstract class TestCase implements Test{
	
	private String name;
	
	public TestCase(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		setUp();
		try{
			runTest();
		}finally{
			tearDown();
		}
		
	}

	protected void tearDown() {
		// TODO Auto-generated method stub
		
	}

	protected void runTest() {
		// TODO Auto-generated method stub
		
	}

	protected void setUp() {
		// TODO Auto-generated method stub
		
	}

}

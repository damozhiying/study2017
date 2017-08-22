package com.edu.tery.proxy;
/**
 * @author Create by tery007
 * @date   2017��8��22��
 *������ʵ�ֽӿڣ�����ϻ��������ǿ�˴���ҵ��ǰ����߼�
 */
public class UserManagerProxy implements UserManager{

	private UserManager userManager;//���
	private Cache<User> cache;//���
	
	@Override
	public User getUser(String id) {
		User user=cache.getUser(id);
		if(user!=null){
			return user;
		}
		user=userManager.getUser(id);
		cache.putUser(id,user);
		return user;
	}

	public static void main(String[] args) {
		UserManager manager=new UserManagerProxy();
		manager.getUser("67");
		
	}
}

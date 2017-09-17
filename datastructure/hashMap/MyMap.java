package com.edu.tery.map;
/**
 * @author Create by tery007
 * @date   2017��8��9��
 *Map�ӿ�
 */
public interface MyMap<K,V> {

	public V put(K k,V v);
	public V get(K k);
	
	/**
	 * �ڲ��ӿ�
	 * @author tery
	 *
	 * @param <K>
	 * @param <V>
	 */
	interface Entry<K,V>{
		public K getKey();
		public V getValue();
	}
}

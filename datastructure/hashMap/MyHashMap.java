package com.edu.tery.map;
/**
 * @author Create by tery007
 * @date   2017��8��9��
 *
 */
public class MyHashMap<K,V> implements MyMap<K, V>{

	//�����ʼ������Ϊ8
	private static final int INITIAL_CAPACITY=1<<4;
	//��ֵ����
	private static final float LOAD_FACTOR=0.75f;
	//�Զ���������С
	private int size;
	//�Զ������ֵ
	private float factor;
	
	//Map����Entry������
	private int entrySize;
	
	//Entry����
	private Entry<K,V>[] table=null;
	//����ģʽ
	public  MyHashMap() {
		this(INITIAL_CAPACITY,LOAD_FACTOR);
	}
	@SuppressWarnings("unchecked")
	private MyHashMap(int size,float factor){
		if(size<0){
			throw new IllegalArgumentException("illegal size:"+size);
		}
		if(factor<0||Float.isNaN(factor)){
			throw new IllegalArgumentException("illegal factor:"+factor);
		}
		this.size=size;
		this.factor=factor;
		table=new Entry[this.size];
	}
	
	
	@Override
	public V put(K k, V v) {
		if(size>=entrySize*factor){
			resize(2*entrySize);
			
		}
		V oldValue=null;
		int index=getIndex(k,entrySize);
		if(table[index]==null){
			table[index]=new Entry<K,V>(k,v,null);
			entrySize++;
		}else{
			Entry<K,V> entry=table[index];
			Entry<K,V> e=entry;
			//������������ڵ㣬ȥ��keyֵ�ظ���Ԫ��
			while(e!=null){
				//���key��ͬ���򸲸Ǿ�ֵ�����ؾ�ֵ
				if(k==e.getKey() || k.equals(e.getKey())){
					oldValue=e.value;
					e.value=v;
					return oldValue;
				}
				e=e.next;
			}
			//���ظ���indexλ������Ԫ��:����λ��ԭ�ȵ�ֵ����Ϊ��entry��next
			table[index]=new Entry<K,V>(k,v,entry);
		}
		return null;
	}

	private int getIndex(K k, int entrySize2) {
		int m=entrySize-1;//���һ��Ԫ�ص��±�
		int index=hash(k.hashCode())&m;
		return index>=0?index:-index;
	}
	private int hash(int hashCode) {
		hashCode=hashCode^((hashCode>>>20)^(hashCode>>>12));  
        return hashCode^((hashCode>>>7)^(hashCode>>>4));  
	}
	private void resize(int newSize) {
		Entry<K,V>[] oldEntry=table;
		int oldSize=table.length;
		Entry<K,V>[] newEntry=new Entry[newSize];
		transfer(newEntry);
	}
	private void transfer(Entry<K, V>[] newEntry) {
		int newSize=newEntry.length;
		for(Entry<K,V> e:table){
			while(null !=e){
				Entry<K,V> next=e.next;
				int index=getIndex(e.getKey(),newSize);
				e.next=newEntry[index];//����ǰentry��nextָ���µ�����λ��
				newEntry[index]=e;//���µ�entryλ�ø�ֵ
				e=next;
			}
		}
	}
	@Override
	public V get(K k) {
		// TODO Auto-generated method stub
		return null;
	}
	
	static class Entry<K,V> implements MyMap.Entry<K, V>{

		private K key;
		private V value;
		private Entry<K,V> next;//�������һ������
		public Entry(){
			
		}
		
		public Entry(K key,V value,Entry<K,V> next){
			this.key=key;
			this.value=value;
			this.next=next;
		}
		@Override
		public K getKey() {
			return this.key;
		}

		@Override
		public V getValue() {
			return this.value;
		}
		
	}

}

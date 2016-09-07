package com.w.observer;

/**
 * @��Ŀ����:jfds2.0
 * @����:Subject.java
 * @����:
 * @������: �Ŵ���
 * @����ʱ��: 2016��9��5������6:25:58
 * @�޸���:
 * @�޸�ʱ��:
 * @�޸ı�ע��
 * @version 2.0
 */
public interface Subject {
	/* ���ӹ۲��� */
	public void add(Observer observer);

	/* ɾ���۲��� */
	public void del(Observer observer);

	/* ֪ͨ���еĹ۲��� */
	public void notifyObservers();

	/* ����Ĳ��� */
	public void operation();

}

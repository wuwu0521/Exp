package com.w.observer;

/**
 * @��Ŀ����:jfds2.0
 * @����:MySubject.java
 * @����:
 * @������: �Ŵ���
 * @����ʱ��: 2016��9��5������6:32:26
 * @�޸���:
 * @�޸�ʱ��:
 * @�޸ı�ע��
 * @version 2.0
 */
public class MySubject extends AbstractSubject {
	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}

package com.w.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @��Ŀ����:jfds2.0
 * @����:AbstractSubject.java
 * @����:
 * @������: �Ŵ���
 * @����ʱ��: 2016��9��5������6:28:25
 * @�޸���:
 * @�޸�ʱ��:
 * @�޸ı�ע��
 * @version 2.0
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

	@Override
	public void operation() {

	}

}

package com.w.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @项目名称:jfds2.0
 * @类名:AbstractSubject.java
 * @描述:
 * @创建人: 张传浩
 * @创建时间: 2016年9月5日下午6:28:25
 * @修改人:
 * @修改时间:
 * @修改备注：
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

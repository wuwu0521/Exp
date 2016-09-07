package com.w.observer;

/**
 * @项目名称:jfds2.0
 * @类名:MySubject.java
 * @描述:
 * @创建人: 张传浩
 * @创建时间: 2016年9月5日下午6:32:26
 * @修改人:
 * @修改时间:
 * @修改备注：
 * @version 2.0
 */
public class MySubject extends AbstractSubject {
	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}

package com.w.observer;

/**
 * @项目名称:jfds2.0
 * @类名:Subject.java
 * @描述:
 * @创建人: 张传浩
 * @创建时间: 2016年9月5日下午6:25:58
 * @修改人:
 * @修改时间:
 * @修改备注：
 * @version 2.0
 */
public interface Subject {
	/* 增加观察者 */
	public void add(Observer observer);

	/* 删除观察者 */
	public void del(Observer observer);

	/* 通知所有的观察者 */
	public void notifyObservers();

	/* 自身的操作 */
	public void operation();

}

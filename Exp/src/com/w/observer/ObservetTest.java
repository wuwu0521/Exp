package com.w.observer;

/**
 * @项目名称:jfds2.0
 * @类名:ObservetTest.java
 * @描述:
 * @创建人: 张传浩
 * @创建时间: 2016年9月5日下午6:33:29
 * @修改人:
 * @修改时间:
 * @修改备注：
 * @version 2.0
 */
public class ObservetTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();

	}

}

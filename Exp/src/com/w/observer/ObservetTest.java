package com.w.observer;

/**
 * @��Ŀ����:jfds2.0
 * @����:ObservetTest.java
 * @����:
 * @������: �Ŵ���
 * @����ʱ��: 2016��9��5������6:33:29
 * @�޸���:
 * @�޸�ʱ��:
 * @�޸ı�ע��
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

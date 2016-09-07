package com.w.observer;
/** 
 * @项目名称:jfds2.0
 * @类名:Observer2.java 
 * @描述:
 * @创建人: 张传浩 
 * @创建时间: 2016年9月5日下午6:24:42 
 * @修改人: 
 * @修改时间: 
 * @修改备注：
 * @version 2.0
 */
public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("观察者2接受到修改信息");
	}

}

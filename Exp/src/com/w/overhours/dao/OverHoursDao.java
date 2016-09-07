package com.w.overhours.dao;

import java.util.List;

import com.w.overhours.bean.OverHoursBean;

/** 
 * @项目名称:jfds2.0
 * @类名:OverHoursDao.java 
 * @描述:
 * @创建人: 张传浩 
 * @创建时间: 2016年9月6日下午5:25:04 
 * @修改人: 
 * @修改时间: 
 * @修改备注：
 * @version 2.0
 */
public interface OverHoursDao {
	/**
	 * 查询所有内容
	 * 时间：2016年9月6日 下午5:28:41
	 * 作者：张传浩
	 * @param Month
	 * @return
	 */
	public List<OverHoursBean> findAll();
}

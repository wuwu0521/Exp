package com.w.overhours.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.w.overhours.bean.OverHoursBean;
import com.w.overhours.dao.OverHoursDao;

/** 
 * @项目名称:jfds2.0
 * @类名:OverHoursService.java 
 * @描述:
 * @创建人: 张传浩 
 * @创建时间: 2016年9月6日下午5:22:29 
 * @修改人: 
 * @修改时间: 
 * @修改备注：
 * @version 2.0
 */
@Service("ohService")
public class OverHoursService {
	@Resource
	private OverHoursDao ohDao;
	
	public List<OverHoursBean> findAll(String month){
		return ohDao.findAll(month);
	}
}

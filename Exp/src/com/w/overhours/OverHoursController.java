package com.w.overhours;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.w.overhours.bean.OverHoursBean;
import com.w.overhours.service.OverHoursService;


/** 
 * @项目名称:jfds2.0
 * @类名:OverHoursController.java 
 * @描述:
 * @创建人: 张传浩 
 * @创建时间: 2016年9月6日下午4:04:52 
 * @修改人: 
 * @修改时间: 
 * @修改备注：
 * @version 2.0
 */
@Controller
public class OverHoursController {
	
	@Resource
	private OverHoursService ohservice;
	/**
	 * 根据月查询所有数据
	 * 时间：2016年9月6日 下午4:12:20
	 * 作者：张传浩
	 * @param month
	 * @return
	 */
	@RequestMapping("findByMonth")
	@ResponseBody
	public List<OverHoursBean> findAll(String month){
		return ohservice.findAll(month);
	}
}

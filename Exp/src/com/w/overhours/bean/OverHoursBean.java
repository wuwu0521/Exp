package com.w.overhours.bean;
/** 
 * @项目名称:jfds2.0
 * @类名:OverHoursBean.java 
 * @描述:
 * @创建人: 张传浩 
 * @创建时间: 2016年9月6日下午5:26:15 
 * @修改人: 
 * @修改时间: 
 * @修改备注：
 * @version 2.0
 */
public class OverHoursBean {
	//日期
	private String dateTime;

	private String overTime;
	
	private String workContent;
	
	private String id;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getOverTime() {
		return overTime;
	}

	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}

	public String getWorkContent() {
		return workContent;
	}

	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

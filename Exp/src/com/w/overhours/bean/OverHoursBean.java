package com.w.overhours.bean;
/** 
 * @��Ŀ����:jfds2.0
 * @����:OverHoursBean.java 
 * @����:
 * @������: �Ŵ��� 
 * @����ʱ��: 2016��9��6������5:26:15 
 * @�޸���: 
 * @�޸�ʱ��: 
 * @�޸ı�ע��
 * @version 2.0
 */
public class OverHoursBean {
	//����
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

package com.w.utils;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.common.collect.Lists;

/** 
 * @项目名称:jfds2.0
 * @类名:DataGridJson.java 
 * @描述:
 * @创建人: 张传浩 
 * @创建时间: 2016年9月7日下午2:28:36 
 * @修改人: 
 * @修改时间: 
 * @修改备注：
 * @version 2.0
 */
public class DataGridJson<T> {
	/**数据量 */
	private Long total;
	
	/**数据 */
	private List<T> rows = Lists.newArrayList();
	

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

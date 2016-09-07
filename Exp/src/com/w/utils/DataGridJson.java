package com.w.utils;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.common.collect.Lists;

/** 
 * @��Ŀ����:jfds2.0
 * @����:DataGridJson.java 
 * @����:
 * @������: �Ŵ��� 
 * @����ʱ��: 2016��9��7������2:28:36 
 * @�޸���: 
 * @�޸�ʱ��: 
 * @�޸ı�ע��
 * @version 2.0
 */
public class DataGridJson<T> {
	/**������ */
	private Long total;
	
	/**���� */
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

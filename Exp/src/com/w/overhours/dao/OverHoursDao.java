package com.w.overhours.dao;

import java.util.List;

import com.w.overhours.bean.OverHoursBean;

/** 
 * @��Ŀ����:jfds2.0
 * @����:OverHoursDao.java 
 * @����:
 * @������: �Ŵ��� 
 * @����ʱ��: 2016��9��6������5:25:04 
 * @�޸���: 
 * @�޸�ʱ��: 
 * @�޸ı�ע��
 * @version 2.0
 */
public interface OverHoursDao {
	/**
	 * ��ѯ��������
	 * ʱ�䣺2016��9��6�� ����5:28:41
	 * ���ߣ��Ŵ���
	 * @param Month
	 * @return
	 */
	public List<OverHoursBean> findAll();
}

package com.w.overhours.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.w.overhours.bean.OverHoursBean;
import com.w.overhours.dao.OverHoursDao;

/** 
 * @��Ŀ����:jfds2.0
 * @����:OverHoursService.java 
 * @����:
 * @������: �Ŵ��� 
 * @����ʱ��: 2016��9��6������5:22:29 
 * @�޸���: 
 * @�޸�ʱ��: 
 * @�޸ı�ע��
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

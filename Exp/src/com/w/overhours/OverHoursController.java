package com.w.overhours;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.w.overhours.bean.OverHoursBean;
import com.w.overhours.service.OverHoursService;


/** 
 * @��Ŀ����:jfds2.0
 * @����:OverHoursController.java 
 * @����:
 * @������: �Ŵ��� 
 * @����ʱ��: 2016��9��6������4:04:52 
 * @�޸���: 
 * @�޸�ʱ��: 
 * @�޸ı�ע��
 * @version 2.0
 */
@Controller
public class OverHoursController {
	
	@Resource
	private OverHoursService ohservice;
	/**
	 * �����²�ѯ��������
	 * ʱ�䣺2016��9��6�� ����4:12:20
	 * ���ߣ��Ŵ���
	 * @param month
	 * @return
	 */
	@RequestMapping("findByMonth")
	@ResponseBody
	public List<OverHoursBean> findAll(String month){
		return ohservice.findAll(month);
	}
}

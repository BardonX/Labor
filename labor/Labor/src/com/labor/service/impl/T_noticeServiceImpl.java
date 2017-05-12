package com.labor.service.impl;

import com.labor.dao.T_noticeDao;
import com.labor.dao.impl.T_noticeIDaompl;
import com.labor.domain.T_notice;
import com.labor.service.T_noticeService;

public class T_noticeServiceImpl implements T_noticeService {
	private T_noticeDao noticeDao=new T_noticeIDaompl();

	@Override
	public T_notice findNoticeByCourse_id(int course_id) {
		// TODO Auto-generated method stub
		return noticeDao.findNoticeByCourse_id(course_id);
	}

}

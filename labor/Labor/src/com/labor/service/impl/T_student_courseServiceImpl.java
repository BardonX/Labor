package com.labor.service.impl;

import java.util.HashMap;
import java.util.List;

import com.labor.dao.T_student_courseDao;
import com.labor.dao.impl.T_student_courseDaoImpl;
import com.labor.service.T_student_courseService;

public class T_student_courseServiceImpl implements T_student_courseService {
	private T_student_courseDao student_courseDao=new T_student_courseDaoImpl();

	@Override
	public List<Integer> findCourse_idsByStudent_id(int student_id) {
		return student_courseDao.findCourse_idsByStudent_id(student_id);
	}

	@Override
	public String findEvaluation_toTeaByStudent_id(int student_id,int course_id) {
		// TODO Auto-generated method stub
		return student_courseDao.findEvaluation_toTeaByStudent_id(student_id, course_id);
	}

	@Override
	public void updateEvaluation_toTea(int student_id, int course_id,
			String evaluation) {
		// TODO Auto-generated method stub
		student_courseDao.updateEvaluation_toTea(student_id, course_id, evaluation);
		
	}

	@Override
	public HashMap<Integer, String> findEvaluation_toTeaByStudent_id(int student_id) {
		// TODO Auto-generated method stub
		return student_courseDao.findEvaluation_toTeaByStudent_id(student_id);
	}

}

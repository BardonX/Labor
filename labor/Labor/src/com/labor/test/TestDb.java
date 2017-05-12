package com.labor.test;

import java.util.HashMap;
import java.util.List;

import com.labor.dao.T_courseDao;
import com.labor.dao.T_studentDao;
import com.labor.dao.T_student_courseDao;
import com.labor.dao.impl.T_courseDaoImpl;
import com.labor.dao.impl.T_studentDaoImpl;
import com.labor.dao.impl.T_student_courseDaoImpl;
import com.labor.service.impl.T_noticeServiceImpl;

public class TestDb {

	public static void main(String[] args) {
		/*T_courseDao courseDao=new T_courseDaoImpl();
		String string=courseDao.findTimeLocation_1ByCourse_id(1);
		System.out.println(string);*/
		/*T_studentDao studentDao=new T_studentDaoImpl();
		System.out.println(studentDao.findBalanceByStudent_id(1));*/
		/*T_student_courseDao student_courseDao=new T_student_courseDaoImpl();
		System.out.println(student_courseDao.findCourse_idsByStudent_id(1));*/
		/*T_noticeServiceImpl noticeServiceImpl=new T_noticeServiceImpl();
		int s=noticeServiceImpl.findNoticeByCourse_id(3).getNotice_id();
		System.out.println(s);
		System.out.println(noticeServiceImpl.findNoticeByCourse_id(2));*/
		/*T_student_courseDaoImpl student_courseDaoImpl=new T_student_courseDaoImpl();
		String string="";
		string=student_courseDaoImpl.findEvaluation_toTeaByStudent_id(1, 1);
		System.out.println(string);
		HashMap<Integer, String> list=student_courseDaoImpl.findEvaluation_toTeaByStudent_id(1);
		System.out.println(list);*/
		/*for (String string2 : list) {
			String[] ary=string2.split("@");
			if(ary[0]==null||ary[0].equals("null")){
				System.out.println("空");
			}else{
				System.out.println(ary[0]);
			}
		}*/
		T_student_courseDaoImpl student_courseDaoImpl=new T_student_courseDaoImpl();
		/*System.out.println();
		HashMap<Integer, String> m=student_courseDaoImpl.findEvaluation_toTeaByStudent_id(1);
		String string=m.get(2);
		String[] strings=string.split("@");
		System.out.println(strings.length);
		System.out.println(strings[0]+"  "+strings[1]);*/
		System.out.println(student_courseDaoImpl.findCourse_idsByStudent_id(1));
	}
}

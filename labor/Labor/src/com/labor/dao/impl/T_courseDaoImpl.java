package com.labor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.labor.dao.T_courseDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

/**
 * 
 *<p>Title:T_courseDaoImpl</p>
 *<p>Description: 实现T_courseDao,用于查询t_course表相关数据</p>
 *<p>Copyright:Copyright(c)2017-</p>
 *<p>Company:Hubei University</p>
 *@author: Bardon
 *@date: 2017年5月10日上午9:20:21
 *@version1.0
 */
public class T_courseDaoImpl implements T_courseDao {

	@Override
	public String findTimeLocation_1ByCourse_id(int Course_id) {
		String time="";
		ResultSet rs=null;
		try {
			String sql="select timeLocation_1 from t_course where course_id=?";
			Object [] params={Course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				time=rs.getString("timeLocation_1");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return time;
	}

	@Override
	public String findTimeLocation_2ByCourse_id(int Course_id) {
		String time="";
		ResultSet rs=null;
		try {
			String sql="select timeLocation_2 from t_course where course_id=?";
			Object [] params={Course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				time=rs.getString("timeLocation_2");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return time;
	}

	@Override
	public String findTimeLocation_3ByCourse_id(int Course_id) {
		String time="";
		ResultSet rs=null;
		try {
			String sql="select timeLocation_3 from t_course where course_id=?";
			Object [] params={Course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				time=rs.getString("timeLocation_3");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return time;
	}

	public static void main(String[] args) {
		//为什么在这里面不能查询输出呢？？？
		T_courseDao sCourseDao=new T_courseDaoImpl();
		System.out.println(1);
		String string=sCourseDao.findTimeLocation_1ByCourse_id(2);
		System.out.println(2);
		System.out.println(string);
	}

	@Override
	public String findCourseNameByCourse_id(int Course_id) {
		String courseName="";
		ResultSet rs=null;
		try {
			String sql="select course_name from t_course where course_id=?";
			Object [] params={Course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				courseName=rs.getString("course_name");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return courseName;
	}

	@Override
	public String findCreditByCourse_id(int Course_id) {
		String credit="";
		ResultSet rs=null;
		try {
			String sql="select eg3 from t_course where course_id=?";
			Object [] params={Course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				credit=rs.getString("eg3");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return credit;
	}

	@Override
	public List<List<String>> findElective_courseByeg4(String eg4) {
		List<List<String>> list=new ArrayList<List<String>>();
		
		ResultSet rs=null;
		try {
			String sql="select course_id,course_name,timeLocation_1,eg3 from t_course where eg4=?";
			Object [] params={eg4};
			rs=DbAssist.executeQuery(sql, params);
			while(rs.next()){
				List<String> message=new ArrayList<String>();
				//StringBuilder stringBuilder=new StringBuilder();
				String course_name=rs.getString("course_name");
				int course_id=rs.getInt("course_id");
				String timeLocation=rs.getString("timeLocation_1");
				String time="";
				String addr="";
				if(Character.isDigit(timeLocation.charAt(6))){
					//三节课
					time=timeLocation.substring(0,8);
					addr=timeLocation.substring(8);							
				}else {
					//两节课
					time=timeLocation.substring(0,6);
					addr=timeLocation.substring(6);
				}
				String credit=rs.getString("eg3");
				String id=course_id+"";
				message.add(id);
				message.add(course_name);
				message.add(time);
				message.add(addr);
				message.add(credit);
				list.add(message);
				//stringBuilder.append(course_id).append("@").append(course_name).append("@").append(timeLocation).append("@").append(credit);
				//list.add(stringBuilder.toString());
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return list;
	}
}

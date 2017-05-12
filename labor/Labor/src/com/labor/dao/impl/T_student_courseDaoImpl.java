package com.labor.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.labor.dao.T_student_courseDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_student_courseDaoImpl implements T_student_courseDao {

	@Override
	public List<Integer> findCourse_idsByStudent_id(int student_id) {
		List<Integer> ids=new ArrayList<Integer>();
		ResultSet rs=null;
		try {
			String sql="select course_id from t_student_course where student_id=?";
			Object [] params={student_id};
			rs=DbAssist.executeQuery(sql, params);
			while(rs.next()){
				int course_id;
				course_id=rs.getInt("course_id");
				ids.add(course_id);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return ids;
	}

	@Override
	public String findEvaluation_toTeaByStudent_id(int student_id,int course_id) {
		/*String evaluation="";
		StringBuilder stringBuilder=new StringBuilder();
		ResultSet rs=null;
		try {
			String sql="select evaluation_toTea,eg1 from t_student_course where student_id=? and course_id=?";
			Object [] params={student_id,course_id};
			rs=DbAssist.executeQuery(sql, params);
			while(rs.next()){
				//int course_id;
				evaluation=rs.getString("evaluation_toTea");
				evaluation+="@"+rs.getString("eg1");
				//ids.add(course_id);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		if(evaluation.equals("")||evaluation==null){
			return null;
		}else {
			stringBuilder.append(course_id).append("@").append(evaluation);
			return stringBuilder.toString();
		}*/
		return null;
		
	}

	@Override
	public void updateEvaluation_toTea(int student_id, int course_id,
			String evaluation) {
		// update t_student_course set evaluation_toTea='优秀'  where student_id=1 and course_id=1
		try {
			String sql="update t_student_course set evaluation_toTea='?'  where student_id=? and course_id=?";
			Object [] params={evaluation,student_id,course_id};
			DbAssist.executeUpdate(sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public HashMap<Integer, String> findEvaluation_toTeaByStudent_id(int student_id) {
		//List<HashMap<Integer, String>> message=new ArrayList<HashMap<Integer,String>>();
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		ResultSet rs=null;
		try {
			String sql="select course_id,evaluation_toTea,eg1 from t_student_course where student_id=?";
			Object [] params={student_id};
			rs=DbAssist.executeQuery(sql, params);
			while(rs.next()){
				
				int course_id;
				course_id=rs.getInt("course_id");
				String evaluation_toTea=rs.getString("evaluation_toTea");
				String eg1=rs.getString("eg1");
				map.put(course_id, evaluation_toTea+"@"+eg1);
				//evaluation_toTea+="@"+course_id;
				//message.add(map);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return map;
	}

}

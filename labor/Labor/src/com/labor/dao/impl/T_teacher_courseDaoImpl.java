package com.labor.dao.impl;

import java.sql.ResultSet;

import com.labor.dao.T_teacher_courseDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_teacher_courseDaoImpl implements T_teacher_courseDao {

	@Override
	public int findTeacheridByCourse_id(int course_id) {
		int teacher_id=0;
		ResultSet rs=null;
		try {
			String sql="select teacher_id from t_teachr_couse where course_id=?";
			Object [] params={course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				teacher_id=rs.getInt("teacher_id");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return teacher_id;
	}

}

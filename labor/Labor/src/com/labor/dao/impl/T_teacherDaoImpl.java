package com.labor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.labor.dao.T_teacherDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_teacherDaoImpl implements T_teacherDao{

	@Override
	public String fingTeachernameByTeacher_id(int teacher_id) {
		String teacher_name="";
		ResultSet rs=null;
		try {
			String sql="select teacher_name from t_teacher where teacher_id=?";
			Object [] params={teacher_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				teacher_name=rs.getString("teacher_name");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return teacher_name;
	}

}

package com.labor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.labor.dao.T_testDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_testDaoImpl implements T_testDao{

	@Override
	public String findAverageByCourse_id(int course_id) {
		String average="";
		ResultSet rs=null;
		try {
			String sql="select eg1 from t_test where course_id=?";
			Object [] params={course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				average=rs.getString("eg1");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return average;
	}

	@Override
	public int findTestidByCourse_id(int course_id) {
		int test_id=0;
		ResultSet rs=null;
		try {
			String sql="select test_id from t_test where course_id=?";
			Object [] params={course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				test_id=rs.getInt("test_id");
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return test_id;
	}

}

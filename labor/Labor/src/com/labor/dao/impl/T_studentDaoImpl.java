package com.labor.dao.impl;

import java.sql.ResultSet;

import com.labor.dao.T_studentDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_studentDaoImpl implements T_studentDao {

	@Override
	public String findStudetByStudent_id(int student_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findBalanceByStudent_id(int student_id) {
		int balance=0;
		ResultSet rs=null;
		try {
			String sql="select student_balance from t_student where student_id=?";
			Object [] params={student_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				balance=rs.getInt("student_balance");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return balance;
	}

}

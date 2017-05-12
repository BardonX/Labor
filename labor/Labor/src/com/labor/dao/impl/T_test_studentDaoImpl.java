package com.labor.dao.impl;

import java.sql.ResultSet;

import com.labor.dao.T_test_studentDao;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_test_studentDaoImpl implements T_test_studentDao {

	@Override
	public int findscoreByStudentAndTest_id(int student_id, int test_id) {
		// select score from t_test_student where student_id=1 and test_id=1
		int score=0;
		ResultSet rs=null;
		try {
			String sql="select score from t_test_student where student_id=? and test_id=?";
			Object [] params={student_id,test_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				score=rs.getInt("score");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return score;
	}

}

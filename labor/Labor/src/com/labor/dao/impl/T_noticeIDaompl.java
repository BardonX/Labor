package com.labor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.labor.dao.T_noticeDao;
import com.labor.domain.T_notice;
import com.labor.util.C3P0Util;
import com.labor.util.DbAssist;

public class T_noticeIDaompl implements T_noticeDao {


	@Override
	public T_notice findNoticeByCourse_id(int course_id) {
		T_notice notice=new T_notice();
		ResultSet rs=null;
		try {
			String sql="select * from t_notice where course_id=?";
			Object [] params={course_id};
			rs=DbAssist.executeQuery(sql, params);
			if(rs.next()){
				notice.setCourse_id(rs.getInt("course_id"));
				notice.setEg1(rs.getString("eg1"));
				notice.setEg2(rs.getString("eg2"));
				notice.setEg3(rs.getString("eg3"));
				notice.setEg4(rs.getString("eg4"));
				notice.setNotice_contrent(rs.getString("notice_contrent"));
				notice.setNotice_id(rs.getInt("notice_id"));
				notice.setNotice_regenerator(rs.getString("notice_regenerator"));
				notice.setNotice_uploader(rs.getString("notice_uploader"));

				notice.setNotice_updateTime(rs.getDate("notice_updateTime"));
				notice.setNotice_uploadTime(rs.getDate("notice_uploadTime"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			C3P0Util.release(rs, DbAssist.getPs(), DbAssist.getConn());
		}
		return notice;
	}

}

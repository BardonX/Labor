package com.labor.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Util {
	    //c3p0-config.xml中，默认为SQL Server
		private static ComboPooledDataSource cpds =new ComboPooledDataSource();
		//private static ComboPooledDataSource cpds =new ComboPooledDataSource("MySQL");
		/**
		 * 获取链接
		 *@Title: getConnection
		 *@Author: Bardon
		 *@Time: 2017年5月10日上午9:22:09
		 *@params: @return
		 *@return: Connection
		 *@throws
		 */
		public static Connection getConnection(){
				
				try {
					return cpds.getConnection();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
		}
		/**
		 * 释放资源
		 *@Title: release
		 *@Author: Bardon
		 *@Time: 2017年5月10日上午9:21:55
		 *@params: @param rs
		 *@params: @param ps
		 *@params: @param conn
		 *@return: void
		 *@throws
		 */
		public static void release(ResultSet rs, Statement ps, Connection conn) {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					rs = null;
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					ps = null;
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					conn = null;
				}
			}
		}
		
}

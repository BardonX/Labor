package com.labor.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 *<p>Title:DbAssist</p>
 *<p>Description: 数据库查询工具类</p>
 *<p>Copyright:Copyright(c)2017-</p>
 *<p>Company:Hubei University</p>
 *@author: Bardon
 *@date: 2017年5月10日上午9:24:15
 *@version1.0
 */
public class DbAssist {
	private static Connection conn;
	private static PreparedStatement ps;
	private static ResultSet rs;

	public static Connection getConn() {
		return conn;
	}


	public static PreparedStatement getPs() {
		return ps;
	}


	/**
	 * 增删改操作
	 *@Title: executeUpdate
	 *@Author: Bardon
	 *@Time: 2017年5月10日上午9:23:06
	 *@params: @param sql
	 *@params: @param parameters
	 *@params: @return
	 *@return: int
	 *@throws
	 */
	public static int executeUpdate(String sql,Object[] parameters){
		int res=0;
		
		try {
			conn=C3P0Util.getConnection();
			ps=conn.prepareStatement(sql);
			//给？赋值
			if(parameters!=null && parameters.length>0){
				
				for(int i=0;i<parameters.length;i++){
					
					ps.setObject(i+1, parameters[i]);
				}
			}
			res=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			//JdbcUtil.release(null, ps, conn);
			//DBCPUtil.release(null, ps, conn);
			C3P0Util.release(null, ps, conn);
		}
		
		//影响的行数？？
		return res;
	}
	
	/**
	 * 查询操作
	 *@Title: executeQuery
	 *@Author: Bardon
	 *@Time: 2017年5月10日上午9:23:39
	 *@params: @param sql
	 *@params: @param parameters
	 *@params: @return
	 *@return: ResultSet
	 *@throws
	 */
	public static ResultSet executeQuery(String sql,Object[] parameters){
		
		try {
			conn=C3P0Util.getConnection();
			ps=conn.prepareStatement(sql);
			//给？赋值
			if(parameters!=null && parameters.length>0){
				
				for(int i=0;i<parameters.length;i++){
					
					ps.setObject(i+1, parameters[i]);
				}
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{	
			//C3P0Util.release(null, ps, conn);//?
		}
		return rs;
	}
}

package com.labor.controller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.labor.domain.T_notice;
import com.labor.service.T_courseService;
import com.labor.service.T_noticeService;
import com.labor.service.T_studentService;
import com.labor.service.T_student_courseService;
import com.labor.service.T_teacherService;
import com.labor.service.T_teacher_courseService;
import com.labor.service.T_testService;
import com.labor.service.T_test_studentService;
import com.labor.service.impl.T_courseServiceImpl;
import com.labor.service.impl.T_noticeServiceImpl;
import com.labor.service.impl.T_studentServiceImpl;
import com.labor.service.impl.T_student_courseServiceImpl;
import com.labor.service.impl.T_teacherServiceImpl;
import com.labor.service.impl.T_teacher_courseServiceImpl;
import com.labor.service.impl.T_testServiceImpl;
import com.labor.service.impl.T_test_studentServiceImpl;

/**
 * 
 *<p>Title:Stu_Servlet</p>
 *<p>Description: 学生模块控制类</p>
 *<p>Copyright:Copyright(c)2017-</p>
 *<p>Company:Hubei University</p>
 *@author: Bardon
 *@date: 2017年5月10日下午2:20:35
 *@version1.0
 */
public class Stu_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private T_studentService studentService=new T_studentServiceImpl();
	private T_student_courseService student_courseService=new T_student_courseServiceImpl();
	private T_courseService courseService=new T_courseServiceImpl();
	private T_testService testService=new T_testServiceImpl();
	private T_test_studentService test_studentService=new T_test_studentServiceImpl();
	private T_noticeService noticeService=new T_noticeServiceImpl();
	private T_teacherService teacherService=new T_teacherServiceImpl();
	private T_teacher_courseService teacher_courseService=new T_teacher_courseServiceImpl(); 
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String type=req.getParameter("type");
		String stu_id=req.getParameter("student_id");
		int student_id=Integer.parseInt(stu_id);
		if("che_timetable".equals(type)){
			che_timetable(req,resp,student_id);
		}else if ("che_message".equals(type)) {
			che_message(req,resp,student_id);
		}else if ("che_grades".equals(type)) {
			che_grades(req,resp,student_id);
		}else if ("che_balace".equals(type)) {
			che_balace(req,resp,student_id);
		}else if ("select".equals(type)) {
			verify_conflict(req,resp,student_id);
		}else if ("elective_course_back".equals(type)) {
			elective_course_back(req,resp,student_id);
		}else if ("course_evaluation".equals(type)) {
			course_evaluation(req,resp,student_id);
		}
	}
	/**
	 * 获取课表
	 *@Title: che_timetable
	 *@Author: Bardon
	 *@Time: 2017年5月10日下午2:21:01
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void che_timetable(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		List<List<String>> course_timetable=new ArrayList<List<String>>();
		List<Integer> course_ids=student_courseService.findCourse_idsByStudent_id(student_id);
		try {
			T_courseService obj=T_courseServiceImpl.class.newInstance();
			for (Integer id : course_ids) {
				String coursename=courseService.findCourseNameByCourse_id(id);
				int teacher_id=teacher_courseService.findTeacheridByCourse_id(id);
				String teacher_name=teacherService.fingTeachernameByTeacher_id(teacher_id);
				for(int i=1;i<4;i++){
					//StringBuilder message=new StringBuilder();
					//StringBuilder classtime=new StringBuilder();
					List<String> message=new ArrayList<String>();
					Method method;
					String methodname="findTimeLocation_"+i+"ByCourse_id";
					method=T_courseServiceImpl.class.getMethod(methodname, new Class[]{int.class});
					String result=(String) method.invoke(obj, id);
					if(result!=null){
						//System.out.println(result);
						String time=null;
						String addr=null;
						if(Character.isDigit(result.charAt(6))){
							//三节课
							time=result.substring(0,8);
							addr=result.substring(8);							
						}else {
							//两节课
							time=result.substring(0,6);
							addr=result.substring(6);
						}
						String course_id=id+"";
						message.add(course_id);
						message.add(time);
						message.add(coursename);
						message.add(addr);
						message.add(teacher_name);
						course_timetable.add(message);
					}
				}
			}
			String json=JSONUtil.serialize(course_timetable);
			//System.out.println(course_timetable);
			System.out.println(json);
			resp.getWriter().print(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取通知消息
	 *@Title: che_message
	 *@Author: Bardon
	 *@Time: 2017年5月10日下午5:10:42
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void che_message(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		List<T_notice>list=new ArrayList<T_notice>();
		List<Integer> course_ids=student_courseService.findCourse_idsByStudent_id(student_id);
		for (Integer id : course_ids) {
			T_notice notice=new T_notice();
			notice=noticeService.findNoticeByCourse_id(id);
			if(notice.getNotice_id()!=0){
				list.add(notice);
			}
		}
		String message=null;
		try {
			message=JSONUtil.serialize(list);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(message);
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().print(message);
	}
	/**
	 * 查看成绩
	 *@Title: che_grades
	 *@Author: Bardon
	 *@Time: 2017年5月10日下午4:10:29
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void che_grades(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		List<String[]>list=new ArrayList<String[]>();
		List<Integer> course_ids=student_courseService.findCourse_idsByStudent_id(student_id);
		for (Integer id : course_ids) {
			//新的一年怎么搞？？？？
			String coursename=courseService.findCourseNameByCourse_id(id);
			String credit=courseService.findCreditByCourse_id(id);
			String average=testService.findAverageByCourse_id(id);
			int test_id=testService.findTestidByCourse_id(id);
			int score=test_studentService.findscoreByStudentAndTest_id(student_id, test_id);
			String scores=score+"";
			String [] data={coursename,credit,average,scores};
			//System.out.println(data);
			//System.out.println(coursename+credit+average+score);
			list.add(data);
		}
		//System.out.println(list);
		String message;
		try {
			message = JSONUtil.serialize(list);
			System.out.println(message);
			resp.getWriter().print(message);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 查看余额
	 *@Title: che_balace
	 *@Author: Bardon
	 *@Time: 2017年5月10日下午2:29:39
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void che_balace(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		int balance=studentService.findBalanceByStudent_id(student_id);
		//System.out.println(balance);
		resp.getWriter().print(balance);
	}
	/**
	 * 验证课程时间是否冲突
	 *@Title: verify_conflict
	 *@Author: Bardon
	 *@Time: 2017年5月11日下午8:16:06
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void verify_conflict(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		List<String> selected_classtime=new ArrayList<String>();
		boolean flag=true;
		String message=req.getParameter("message");
		//System.out.println(message);
		String[] time=message.split(" ");//010102
		String classtime=time[1];
		String day=classtime.substring(0,2);
		List<Integer> course_ids=student_courseService.findCourse_idsByStudent_id(student_id);
		try {
			T_courseService obj=T_courseServiceImpl.class.newInstance();
			for (Integer id : course_ids) {
				for(int i=1;i<4;i++){
					Method method;
					String methodname="findTimeLocation_"+i+"ByCourse_id";
					method=T_courseServiceImpl.class.getMethod(methodname, new Class[]{int.class});
					String result=(String) method.invoke(obj, id);
					if(result!=null){
						String time_1=null;
						if(Character.isDigit(result.charAt(6))){
							//三节课
							time_1=result.substring(0,8);						
						}else {
							//两节课
							time_1=result.substring(0,6);
						}
						selected_classtime.add(time_1);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (String selected : selected_classtime) {
			//同一天
			if(selected.substring(0,2).equals(day)){
				if(classtime.length()==6){
					//System.out.println("两节课");
					String[] classtimes={classtime.substring(2,4),classtime.substring(4,6)};
					for (String string : classtimes) {
						if(string.equals(selected.substring(2,4))||string.equals(selected.substring(4,6))){
							flag=false;
							break;
						}
					}
				}else {
					System.out.println("三节课");
					String[] classtimes={classtime.substring(2,4),classtime.substring(4,6),classtime.substring(6,8)};
					for (String string : classtimes) {
						if(string.equals(selected.substring(2,4))||string.equals(selected.substring(4,6))||string.equals(selected.substring(6,8))){
							flag=false;
							break;
						}
					}
				}
			}
		}
		if(flag){
			//不冲突
			//更新数据库
			resp.getWriter().print("不冲突");
		}else {
			resp.getWriter().print("冲突");
		}
		
	}
	/**
	 * 选课退课  还要过滤已选的课程
	 *@Title: elective_course_back
	 *@Author: Bardon
	 *@Time: 2017年5月10日下午9:50:30
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void elective_course_back(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		List<List<String>> list=courseService.findElective_courseByeg4("选修");
		String message="";
		try {
			message=JSONUtil.serialize(list);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		System.out.println(message);
		resp.getWriter().print(message);
	}
	/**
	 * 课程评价
	 *@Title: course_evaluation
	 *@Author: Bardon
	 *@Time: 2017年5月10日下午9:50:09
	 *@params: @param req
	 *@params: @param resp
	 *@params: @param student_id
	 *@params: @throws ServletException
	 *@params: @throws IOException
	 *@return: void
	 *@throws
	 */
	private void course_evaluation(HttpServletRequest req, HttpServletResponse resp,int student_id)
			throws ServletException, IOException{
		HashMap<Integer, String> map=student_courseService.findEvaluation_toTeaByStudent_id(student_id);
		List<List<String>> message=new ArrayList<List<String>>();
		List<Integer> course_ids=student_courseService.findCourse_idsByStudent_id(student_id);
		for (Integer id : course_ids) {
			String course_name=courseService.findCourseNameByCourse_id(id);
			int teacher_id=teacher_courseService.findTeacheridByCourse_id(id);
			String teacher_name=teacherService.fingTeachernameByTeacher_id(teacher_id);
			//String value=map.get(id);
			List<String> list=new ArrayList<String>(); 
			//value+="@"+course_name+"@"+teacher_name;
			//map.put(id, value);
			String course_id=id+"";
			String teacher=teacher_id+"";
			list.add(course_id);
			String string=map.get(id);
			String []strings=string.split("@");
			list.add(strings[0]);
			list.add(course_name);
			list.add(teacher_name);
			list.add(teacher);
			list.add(strings[1]);
			message.add(list);			
		}
		//System.out.println(list);
		//System.out.println(map);
		String string="";
		try {
			string=JSONUtil.serialize(message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(string);
		resp.getWriter().print(string);		
	}

	
}

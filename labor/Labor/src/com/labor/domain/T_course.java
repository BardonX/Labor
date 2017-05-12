package com.labor.domain;

import java.io.Serializable;
import java.sql.Date;

public class T_course implements Serializable {

	private static final long serialVersionUID = 1L;
	private int course_id;
	private String course_name;
	private int totalclass;
	//money
	private int course_price;
	private String course_introdution;
	private String course_plan;
	private Date course_startTime;
	private Date course_endTime;
	private String course_category;
	private int major_id;
	private String timeLocation_1;
	private String timeLocation_2;
	private String timeLocation_3;
	private String eg1;
	private String eg2;
	private String eg3;
	private String eg4;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getTotalclass() {
		return totalclass;
	}
	public void setTotalclass(int totalclass) {
		this.totalclass = totalclass;
	}
	public int getCourse_price() {
		return course_price;
	}
	public void setCourse_price(int course_price) {
		this.course_price = course_price;
	}
	public String getCourse_introdution() {
		return course_introdution;
	}
	public void setCourse_introdution(String course_introdution) {
		this.course_introdution = course_introdution;
	}
	public String getCourse_plan() {
		return course_plan;
	}
	public void setCourse_plan(String course_plan) {
		this.course_plan = course_plan;
	}
	public Date getCourse_startTime() {
		return course_startTime;
	}
	public void setCourse_startTime(Date course_startTime) {
		this.course_startTime = course_startTime;
	}
	public Date getCourse_endTime() {
		return course_endTime;
	}
	public void setCourse_endTime(Date course_endTime) {
		this.course_endTime = course_endTime;
	}
	public String getCourse_category() {
		return course_category;
	}
	public void setCourse_category(String course_category) {
		this.course_category = course_category;
	}
	public int getMajor_id() {
		return major_id;
	}
	public void setMajor_id(int major_id) {
		this.major_id = major_id;
	}
	public String getTimeLocation_1() {
		return timeLocation_1;
	}
	public void setTimeLocation_1(String timeLocation_1) {
		this.timeLocation_1 = timeLocation_1;
	}
	public String getTimeLocation_2() {
		return timeLocation_2;
	}
	public void setTimeLocation_2(String timeLocation_2) {
		this.timeLocation_2 = timeLocation_2;
	}
	public String getTimeLocation_3() {
		return timeLocation_3;
	}
	public void setTimeLocation_3(String timeLocation_3) {
		this.timeLocation_3 = timeLocation_3;
	}
	public String getEg1() {
		return eg1;
	}
	public void setEg1(String eg1) {
		this.eg1 = eg1;
	}
	public String getEg2() {
		return eg2;
	}
	public void setEg2(String eg2) {
		this.eg2 = eg2;
	}
	public String getEg3() {
		return eg3;
	}
	public void setEg3(String eg3) {
		this.eg3 = eg3;
	}
	public String getEg4() {
		return eg4;
	}
	public void setEg4(String eg4) {
		this.eg4 = eg4;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}


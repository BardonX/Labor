package com.labor.domain;

import java.io.Serializable;

public class T_student_course implements Serializable {

	private static final long serialVersionUID = 1L;
	private int student_id;
	private int course_id;
	private String evaluation_toStu;
	private String evaluation_toTea;
	private int class_finish;
	private int class_remain;
	private String eg1;
	private String eg2;
	private String eg3;
	private String eg4;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getEvaluation_toStu() {
		return evaluation_toStu;
	}
	public void setEvaluation_toStu(String evaluation_toStu) {
		this.evaluation_toStu = evaluation_toStu;
	}
	public String getEvaluation_toTea() {
		return evaluation_toTea;
	}
	public void setEvaluation_toTea(String evaluation_toTea) {
		this.evaluation_toTea = evaluation_toTea;
	}
	public int getClass_finish() {
		return class_finish;
	}
	public void setClass_finish(int class_finish) {
		this.class_finish = class_finish;
	}
	public int getClass_remain() {
		return class_remain;
	}
	public void setClass_remain(int class_remain) {
		this.class_remain = class_remain;
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
 
}

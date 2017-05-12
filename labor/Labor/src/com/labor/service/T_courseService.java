package com.labor.service;

import java.util.List;

public interface T_courseService {
	public String findTimeLocation_1ByCourse_id(int Course_id);
	public String findTimeLocation_2ByCourse_id(int Course_id);
	public String findTimeLocation_3ByCourse_id(int Course_id);
	public String findCourseNameByCourse_id(int Course_id);
	public String findCreditByCourse_id(int Course_id);
	public List<List<String>> findElective_courseByeg4(String eg4);

}

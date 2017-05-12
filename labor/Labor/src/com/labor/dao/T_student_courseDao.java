package com.labor.dao;

import java.util.HashMap;
import java.util.List;

public interface T_student_courseDao {
	public List<Integer> findCourse_idsByStudent_id(int student_id);
	public String findEvaluation_toTeaByStudent_id(int student_id,int course_id);
	public HashMap<Integer, String> findEvaluation_toTeaByStudent_id(int student_id);
	public void updateEvaluation_toTea(int student_id,int course_id,String evaluation);

}

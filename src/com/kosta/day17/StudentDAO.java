package com.kosta.day17;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	List<StudentVO> StudentList = new ArrayList<>();
	
	public List<StudentVO> selectAll() {
		return StudentList;
		
	}
}

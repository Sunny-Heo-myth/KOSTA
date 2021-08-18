package com.kosta.day10;

//DAO : All DB's format file.
public interface DataAccessObject {

	void select();
	void insert();
	void update();
	void delete();
}

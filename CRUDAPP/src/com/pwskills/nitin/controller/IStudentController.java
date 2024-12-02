package com.pwskills.nitin.controller;

import java.sql.SQLException;

import com.pwskills.nitin.dto.Student;

public interface IStudentController {

	// C -> Create
	// R -> Read
	// U -> Update
	// D -> Delete

	public int insertRecord(Student student) throws SQLException;

}

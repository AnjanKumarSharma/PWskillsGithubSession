package com.pwskills.nitin.service;

import java.sql.SQLException;

import com.pwskills.nitin.dto.Student;

public interface IStudentService {

	// C -> Create
	// R -> Read
	// U -> Update
	// D -> Delete

	public int insertRecord(Student student) throws SQLException;

}

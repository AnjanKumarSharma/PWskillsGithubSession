package com.pwskills.nitin.repository;

import java.sql.SQLException;

import com.pwskills.nitin.dto.Student;

public interface IStudentRepo {

	// C -> Create
	// R -> Read
	// U -> Update
	// D -> Delete

	public int insertRecord(Student student) throws SQLException;

}

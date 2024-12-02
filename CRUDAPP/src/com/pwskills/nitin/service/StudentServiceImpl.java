package com.pwskills.nitin.service;

import java.sql.SQLException;

import com.pwskills.nitin.dto.Student;
import com.pwskills.nitin.factory.StudentRepoFactory;
import com.pwskills.nitin.repository.IStudentRepo;

public class StudentServiceImpl implements IStudentService {

	@Override
	public int insertRecord(Student student) throws SQLException {
		//abstraction
		IStudentRepo repo = StudentRepoFactory.getStudentRepo();
		return repo.insertRecord(student);
	}
}

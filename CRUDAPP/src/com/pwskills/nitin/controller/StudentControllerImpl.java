package com.pwskills.nitin.controller;

import java.sql.SQLException;

import com.pwskills.nitin.dto.Student;
import com.pwskills.nitin.factory.StudentServiceFactory;
import com.pwskills.nitin.service.IStudentService;

public class StudentControllerImpl implements IStudentController {

	@Override
	public int insertRecord(Student student) throws SQLException {

		IStudentService service = StudentServiceFactory.getStudentService();
		return service.insertRecord(student);
	}

}

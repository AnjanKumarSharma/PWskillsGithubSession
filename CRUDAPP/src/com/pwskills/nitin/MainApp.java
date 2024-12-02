package com.pwskills.nitin;

import java.sql.SQLException;
import java.util.Scanner;

import com.pwskills.nitin.controller.IStudentController;
import com.pwskills.nitin.dto.Student;
import com.pwskills.nitin.factory.StudentControllerFactory;

public class MainApp {

	//main() : driver code
	public static void main(String[] args) {

		IStudentController controller = StudentControllerFactory.getStudentControllerObj();

		Student student = new Student();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the sid :: ");
		Integer sid = scanner.nextInt();

		System.out.print("Enter the sname:: ");
		String sname = scanner.next();

		System.out.print("Enter the sage:: ");
		int sage = scanner.nextInt();

		System.out.print("Enter the saddress:: ");
		String saddress = scanner.next();

		student.setSid(sid);
		student.setSname(sname);
		student.setSaddress(saddress);
		student.setSage(sage);

		try {
			System.out.println("No of records inserted is :: " + controller.insertRecord(student));
		} catch (SQLException e) {
			System.out.println("Insertion failure....");
		}
		scanner.close();
	}
}

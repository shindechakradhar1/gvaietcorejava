package com.gvacharya.multithreading.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeReflection {

	public static void main(String[] args) {
		Class<Student> classStudent = Student.class;

		try {
			Student student = classStudent.getDeclaredConstructor().newInstance();
			student.setName("ABC");
			student.setRollNo(10);
			System.out.println(student);

			Method[] methods = classStudent.getDeclaredMethods();
			for (Method method : methods)
				System.out.println(method.getName());

			Field[] fields = classStudent.getDeclaredFields();
			for (Field field : fields)
				System.out.println(field.getName());

			Method setName = classStudent.getDeclaredMethod("setName", String.class);
			setName.invoke(student, "BBC");

			Method setRollNo = classStudent.getDeclaredMethod("setRollNo", Integer.class);
			setRollNo.invoke(student, 20);

			Field rollNo = classStudent.getDeclaredField("rollNo");
			rollNo.setAccessible(true);
			rollNo.set(student, 230);

			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

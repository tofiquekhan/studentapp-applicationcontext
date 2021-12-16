package myproject.studentapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.studentapp.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/studentapp/resources/applicationContext.xml");
		Student stdBean = (Student)context.getBean("stdBean");
		stdBean.getStudentDetails();
	}
}

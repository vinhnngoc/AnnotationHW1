package com.vinh.annotationHW;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Class studentClass = Student.class;
		for(Method method:studentClass.getDeclaredMethods()){
			StudentAnnotation studentAnnotationAnnotation = (StudentAnnotation) method.getDeclaredAnnotation(StudentAnnotation.class);
			if (studentAnnotationAnnotation != null) {
				System.out.println(" Method Name : " + method.getName());
			}
		}
		
		for(Field field:studentClass.getDeclaredFields()) {
			StudentAnnotation studentAnnotationAnnotation = (StudentAnnotation) field.getDeclaredAnnotation(StudentAnnotation.class);
			if (studentAnnotationAnnotation != null) {
				System.out.println(" FIELD Name : " + field.getName());
				field.setAccessible(true);
				System.out.println(" FIELD value : " + field.get(null));
			}
		}
		
		
	}

}

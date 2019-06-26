package com.vinh.annotationHW;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface StudentAnnotation {
	String name() default "name";
	int age() default 0;
	int score() default 0;
}

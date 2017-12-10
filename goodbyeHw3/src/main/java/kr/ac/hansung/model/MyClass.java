package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MyClass {
	int year;
	int term;
	
	@Size(min=2,max=20, message="fail")
	@NotEmpty(message="cannot be empty")
	String code;
	@Size(min=2,max=20, message="fail")
	String subject;
	String division;
	int grade;
}

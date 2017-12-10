package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.MyClassDAO;
import kr.ac.hansung.model.MyClass;
import kr.ac.hansung.model.Offer;

@Service
public class MyClassController {

	@Autowired
	private MyClassDAO myclassdao;
	
	public List<MyClass> getCurrent(){
		return myclassdao.getMyclass();
	}
	
	public List<MyClass> getCurrent2(){
		return myclassdao.getYear();
	}
	
	public List<MyClass> getYearTerm(String arg1, String arg2){
		return myclassdao.getYearTerm(arg1, arg2);
	}
	
	public List<MyClass> getDivision(){
		return myclassdao.getDivision();
	}
	
	public void insertSubject(MyClass arg){
		myclassdao.insertSubject(arg);
	}
	
	public List<MyClass> getPreSubject(){
		return myclassdao.getPreSubject();
	}
	
	public MyClass getTotalGrade() {
		return myclassdao.getTotalGrade();
	}
}

package kr.ac.hansung.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.model.MyClass;

@Controller
public class MyClassController {
	@Autowired
	private MyClassController myClassService;

	@RequestMapping("/View1")
	public String showMyLecture(Model model) {
		List<MyClass> myclass = myClassService.getCurrent2();
		model.addAttribute("mylecture", myclass);
		return "View1";
	}

	@RequestMapping(value = "/View1Link", method = RequestMethod.GET)
	public String showMyLecture2(HttpServletRequest httpServletRequest, Model model) {
		String year = httpServletRequest.getParameter("year");
		String term = httpServletRequest.getParameter("term");
		List<MyClass> myclassdao = myClassService.getYearTerm(year, term);
		model.addAttribute("mylecture", myclassdao);
		System.out.print(year);

		return "View1Link";
	}

	@RequestMapping("/View2")
	public String showMyLecture3(Model model) {
		List<MyClass> mylecture = myClassService.getDivision();
		MyClass total = myClassService.getTotalGrade();
		model.addAttribute("mylecture", mylecture);
		model.addAttribute("total", total);
		return "View2";
	}

	@RequestMapping("/register")
	public String showMyLecture4(Model model) {
		model.addAttribute("mylecture", new MyClass());
		return "register";
	}

	@RequestMapping("/docreate")
	public String docreate(Model model, @Valid MyClass mylecture, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("잘못된 입력 값입니다.");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "register";
		}

		myClassService.insertSubject(mylecture);
		List<MyClass> myLecture = myClassService.getPreSubject();

		model.addAttribute("mylecture", myLecture);

		return "View3";
	}

	@RequestMapping("/View3")
	public String docreate(Model model) {
		List<MyClass> mylecture = myClassService.getPreSubject();
		model.addAttribute("mylecture", mylecture);

		return "View3";
	}

}

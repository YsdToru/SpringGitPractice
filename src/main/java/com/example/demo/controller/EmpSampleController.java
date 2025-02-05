package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("GitSample")
public class EmpSampleController {

	@GetMapping("top")
	public ModelAndView showTopPage(ModelAndView mav) {

		mav.setViewName("top");

		return mav;

	}

}

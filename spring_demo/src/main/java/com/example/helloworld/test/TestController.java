package com.example.helloworld.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "test")
public class TestController {

	 @ModelAttribute
	 public TestForm setUpTestForm() {
		 TestForm form = new TestForm();
		 return form;
	 }

	 @RequestMapping
	 public String index(Model model) {
		 return "test/index";
	 }
}
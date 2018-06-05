package com.example.helloworld.Apisample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Apisample")
public class ApiController {
	 @ModelAttribute
	 public ApiForm setUpTestForm() {
		 ApiForm form = new ApiForm();
		 return form;
	 }

	 @RequestMapping("Apisample")
	 public String index(Model model) {
		 return "test/index";
	 }
}

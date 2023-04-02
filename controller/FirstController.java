package com.example.controller;

import java.util.Iterator;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myprograms.PetersonNumber;

@RestController
public class FirstController {
	
	@GetMapping("/First")
	public String HelloWorld() {
		return "Hi There, I'm First Hello World! API";
	}
	@GetMapping("/vadepeer")
	public String vade() {
		return "vadepeer class representative aadha tarbuzz";
	}
	@GetMapping("/fayaz")
	public String faya() {
		return "fayaz cse department fullstack developer";
	}
	
	
	@GetMapping("/Add")
	@ResponseBody
	public String add(@RequestParam  int a, @RequestParam(required = false, defaultValue = "test") String b) {
		return "Sum up value is:" + (a + b);
	}
	
	@GetMapping("/nparam")
	@ResponseBody
	public String add(@RequestParam Map<String, String> list) {
		int b =0;
		for(String a: list.values()) {
			b += Integer.parseInt(a);	
		}
		
		return "Me from n-param" + b;
	}
	
	@GetMapping("/peterson")
	@ResponseBody
	public boolean peterson(@RequestParam int input) {
		PetersonNumber peter = new PetersonNumber();		
		return peter.checkPetersonValue(input);
		
	}


}

package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.CalcService;

@Controller
public class CalcController {

	@Autowired
	private CalcService service;

	@PostMapping("resAdd")
	public String resAdd(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB

	) {

		model.addAttribute("kotae", service.calculateAdd(NumA, NumB));

		return "res";

	}
	@PostMapping("resSubtract")
	public String resSubtract(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB
	) {

		model.addAttribute("kotae", service.calculateSubtract(NumA, NumB));

		return "res";

	}
	@PostMapping("resMultiply")
	public String resMultiply(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB
	) {

		model.addAttribute("kotae", service.calculateMultiply(NumA, NumB));

		return "res";

	}
	@PostMapping("resDivide")
	public String resDivide(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB
		
     ) {
		model.addAttribute("kotae", service.calculateDivide(NumA, NumB));

		return "res";
	}
}
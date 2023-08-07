package com.robert.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		int countInc = (int) session.getAttribute("count");
		countInc++;
		session.setAttribute("count", countInc);
		return "counterPage.jsp";
	}
	
	@GetMapping("/get/count")
	public String getCount() {
		return "getCount.jsp";
	}
	
	@GetMapping("/search")
	public String searchForm(@RequestParam("keyword") String keywordFromForm,Model model) {
		model.addAttribute("searched", keywordFromForm);
		return "searchForm/searchForm.jsp";
	}
	
	@GetMapping("/review/form")
	public String reviewForm() {
		return "postForm/reviewForm.jsp";
	}
	
	@PostMapping("/review/form/process")
	public String processReviewForm(@RequestParam("movie") String movie, @RequestParam("comment") String comment, @RequestParam("rating") Integer rating, HttpSession session, RedirectAttributes redirectAttributes, @RequestParam("userName") String reviewer ) {
		
		if(rating < 0 || rating > 5) {
			redirectAttributes.addFlashAttribute("ratingError", "Rating must be between 0 - 5");
			return "redirect:/review/form";
		}
		session.setAttribute("movie", movie);
		session.setAttribute("reviewer", reviewer);
		session.setAttribute("comment", comment);
		session.setAttribute("rating", rating);
		return "redirect:/review/form/display";
		
	}
	
	@GetMapping("/review/form/display")
	public String reviewFormDisplay() {
		return "postForm/displayReviewForm.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

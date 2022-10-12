package com.gl.caseStudy3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy3.bean.CompanyShare;
import com.gl.caseStudy3.service.CompanyService;


@RestController
public class ShareController {
	
	@Autowired
	private CompanyService service;
	
	@GetMapping("/index")
	public ModelAndView showIndex() {
		List<CompanyShare> companyList = service.findAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("companyList",companyList);
		return mv;
	}
	
	@GetMapping("/company")
	public ModelAndView showCompanyEntry() {
		CompanyShare compShare = new CompanyShare();
		ModelAndView mv = new ModelAndView("companyEntry");
		mv.addObject("companyRecord",compShare);
		return mv;
	}
	
	@PostMapping("/company")
	public ModelAndView enterACompany(@ModelAttribute("companyRecord") CompanyShare compShare) {
		long id = service.generateCompanyId();
		compShare.setCompanyId(id);
		service.save(compShare);
		return new ModelAndView("redirect:/index");
	}
	
	@GetMapping("/edit-company/{id}")
	public ModelAndView editACompany(@PathVariable long id) {
		CompanyShare compShare = service.findById(id);
		ModelAndView mv = new ModelAndView("companyEdit");
		mv.addObject("companyRecord",compShare); 
		return mv;
	}
	
	@PostMapping("/edit-company/edit-share-price")
	public ModelAndView editShareprice(@ModelAttribute("companyRecord") CompanyShare compShare) {
		service.save(compShare);
		return new ModelAndView("redirect:/index");
	}
	
	@GetMapping("/delete-company/{id}")
	public ModelAndView deleteACompany(@PathVariable long id) {
		service.delete(id);
		return new ModelAndView("redirect:/index");
	}
	
	
}

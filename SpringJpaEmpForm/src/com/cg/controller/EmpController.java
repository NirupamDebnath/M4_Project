package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.Employee;
import com.cg.service.IEmpService;
@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private IEmpService empService;
	
	@RequestMapping("/home")
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping("/next")
	public String getNext(Model m)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("finance");
		list.add("support");
		list.add("testing");
		list.add("developing");
		
		m.addAttribute("emp", new Employee());
		m.addAttribute("dList", list);
		return "next";
	}

	@RequestMapping(value="/store" ,method=RequestMethod.POST)
	public String validateData(Model m,@Valid@ModelAttribute("emp") Employee emp,BindingResult br)
	{
		String target=null;
		if(br.hasErrors())
		{
			System.out.println("error");
			target="next";
		}
		else
		{
			empService.add(emp);
			m.addAttribute("name", emp.getEmpName());
			m.addAttribute("dept", emp.getDept());
			target="success";
		}
		return target;
	}
	
	@RequestMapping("/viewall")
	public String getData(Model m)
	{
		List<Employee> list=new ArrayList<Employee>();
		list=empService.getData();
		m.addAttribute("eList", list);
		return "viewall";
	}
	
}

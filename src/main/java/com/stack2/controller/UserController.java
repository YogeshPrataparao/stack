package com.stack2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stack2.model.User;
import com.stack2.repo.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	private UserRepo urepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/reg")
	public String myreg()
	{
		return "registration";
	}
	@RequestMapping("/register")
	public String myregistration(ModelMap map,User use)
	{
		User uu=urepo.save(use);
		if(uu != null)
		{
			System.out.println(uu.toString());
		}
		return "login";
	}
	@RequestMapping("/log")
	public String mylog()
	{
		return "login";
	}
	@RequestMapping("/login")
	public String mylogin(ModelMap map,User use)
	{
		User uu=urepo.getUser(use.getUname(),use.getPassword());
		if(uu != null)
		{
			map.addAttribute("message","login success");
			return "home";
		}
		else
		{
			map.addAttribute("message","Invalid credentials");
			return "login";
		}
		
	}
}

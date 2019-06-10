package com.njit.dianyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.njit.dianyi.pojo.TbUser;
import com.njit.dianyi.service.UserService;
import com.njit.dianyi.utils.exception.LoginMissingArgumentsException;

@Controller
@RequestMapping("/page")
public class PageController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String index(String username,String password,Model model) {
		try {
			TbUser user = userService.login(username, password);
			if(user==null) {
				model.addAttribute("message", "用户名或密码错误！");
				return "login";
			}
			model.addAttribute("user", user);
			return "main";
		} catch (LoginMissingArgumentsException e) {
			System.out.println(e.getMessage());
			model.addAttribute("message", e.getMessage());
			return "login";
		}
		
	}
}

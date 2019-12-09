package com.neuedu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Address;
import com.neuedu.pojo.User;

@Controller
@RequestMapping("/user")
public class UserLikesController {

	@RequestMapping("user.do")
	public ModelAndView likes(String[] likes){
		ModelAndView mv = new ModelAndView();
		String s = "";
		for(String str : likes){
			s += str +"<br>";
		}
		mv.addObject("likes", s);
		mv.setViewName("show.jsp");
		return mv;
	}
	
	
	
	@RequestMapping("user2.do")
	public ModelAndView likes2(String[] likes,User user){
		ModelAndView mv = new ModelAndView();
		String s = "";
		for(String str : likes){
			s += str +"<br>";
		}
		
		List<Address> list = user.getAddrList();
		String mobiles= "";
		for(Address s1: list){
			mobiles += s1.getMobile()+"<br>";
		}
		mv.addObject("likes", s);
		mv.addObject("mobileSize", mobiles);
		mv.setViewName("show.jsp");
		return mv;
	}
}

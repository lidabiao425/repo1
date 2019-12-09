package com.neuedu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {

	//当前方法userReg 对应的请求url是 reg.do, 这个url只接受post方式请求数据
	@RequestMapping(value="reg.do",method={RequestMethod.POST})
//	@RequestMapping(value="reg.do")
	public ModelAndView userReg(String uname,String pwd){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", uname);
		mv.addObject("pp", pwd);
		mv.setViewName("hello.jsp");
//		mv.setViewName("reg2.do");
		return mv;
	}
	
	@RequestMapping(value="reg2.do",params={"uname=admin","pwd"})
	public ModelAndView reg02(String uname,String pwd){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello.jsp");
		return mv;
	}
	
	@RequestMapping("reg3.do")
	public String userReg3(String uname,String pwd,HttpServletRequest request){
		
		request.setAttribute("user", uname);
		request.setAttribute("pp", pwd);
		//转发到hello.jsp
//		return "forward:hello.jsp";
		return "redirect:hello.jsp";
	
	}
	
	
	@RequestMapping("reg4.do")
	public void userReg4(String uname,String pwd,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		request.setAttribute("user", uname);
		request.setAttribute("pp", pwd);

		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}
	
	@RequestMapping("reg5.do")
	public ModelAndView reg5(String uname,double height,int age,boolean mar){
		ModelAndView mv = new ModelAndView();
		mv.addObject("username", uname);
		mv.addObject("height", height);
		mv.addObject("age", age);
		mv.addObject("mar", mar);
		mv.setViewName("hello.jsp");
		return mv;
	}
	
	
	@RequestMapping("reg6.do")
	public ModelAndView reg6(User user){
		ModelAndView mv = new ModelAndView();
		mv.addObject("username", user.getUname());
		mv.addObject("height", user.getHeight());
		mv.addObject("age", user.getAge());
		mv.addObject("mar", user.isMar());
		mv.addObject("prov", user.getAddress().getProv());
		mv.addObject("city", user.getAddress().getCity());
		mv.addObject("mobile", user.getAddress().getMobile());
		mv.addObject("birthday", user.getBirthday());
		mv.setViewName("hello.jsp");
	
		
		return mv;
	}
}

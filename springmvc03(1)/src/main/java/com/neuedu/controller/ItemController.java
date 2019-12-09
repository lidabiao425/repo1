package com.neuedu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.pojo.Item;

@Controller
@RequestMapping("/item")
public class ItemController {

	@RequestMapping("add.do")
	public ModelAndView addItem(@Validated Item item,BindingResult result){
		ModelAndView mv = new ModelAndView();
		String errorMsg = "";
		//获取校验结果,hasErrors()方法判断是否有错误消息
		if (result.hasErrors()) {
			//获取所有的错误消息
			List<ObjectError> errors = result.getAllErrors();
			//循环，将错误信息放入errorMsg中
			for(ObjectError err: errors){
				errorMsg += err.getDefaultMessage()+"<br>";
			}
		}
		
		//判断是否有错误消息进行分析定向页面
		if(errorMsg.equals("")){
			mv.addObject("item", item);
			mv.setViewName("itemshow.jsp");
		} else {
			mv.addObject("error", errorMsg);
			mv.setViewName("add.jsp");
		}
		return mv;
	}
	
	
	
}

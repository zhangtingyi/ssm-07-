package com.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.editor.DateEditor;
import com.spring.entity.FormatTest;
import com.spring.entity.User;


@Controller
public class TestController {

	@RequestMapping("/toRegister")
	public String toRegister()
	{
		return "register";
	}
	
	@RequestMapping("/toFomatTest")
	public String toFomatTest(){
		return  "input";
	}
	
	@RequestMapping("/register")
	public ModelAndView register(@Validated User user, BindingResult result, Errors errors){
		ModelAndView mv=new ModelAndView();
		//判断是否校验通过
		if (result.hasErrors()) {
			//有错误信息，表示未通过校验
			//获取错误
			List<ObjectError> listErrors=errors.getAllErrors();
			String errorStr="";
			for (ObjectError objectError :listErrors) {
				errorStr+=objectError.getDefaultMessage()+"\n";
			}
			mv. addObject ("message", errorStr);
		}else {
			mv.addObject ("message", "注册成功");
		}
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/fomatTest")
	public ModelAndView fomatTest(FormatTest formatTest){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success");
		mv.addObject("data",formatTest);
		return mv;
	}
	
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(Date date){
        System.out.println(date);
        return date.toString();
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        binder.registerCustomEditor(Date.class,new DateEditor());
    }

}

package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class createProjectController {
	
	@RequestMapping(value="/client/create")
	public ModelAndView create() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createProject");
		return mv;
	}
	
	@RequestMapping(value="/client/create/skill", method = RequestMethod.POST)
	public List<Map<String, Object>> showskills(){
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", 1);
		map.put("skill", "Bootstrap");
		for(int i=0;i<10;i++) list.add(map);
		return list;
	}
}
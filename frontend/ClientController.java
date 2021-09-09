package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Bid;
import com.example.demo.model.Job;
import com.example.demo.repository.BidRepository;
import com.example.demo.repository.JobRepository;
import com.example.demo.service.adminService;
import com.example.demo.service.workerService;
import com.example.demo.service.clientService; //new

@RestController
public class ClientController {
	@Autowired
	BidRepository bi;
	@Autowired
	clientService cl;
	
	@RequestMapping(value="/client")
	public ModelAndView client() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("clientdash");
		return mv;
	}

@RequestMapping(value="/client/inform", method = RequestMethod.GET)
	public Map<String, Object> showinform(){
		Map<String, Object> map = new HashMap<>();
		map.put("client_username", "Penggao");
		map.put("project_num", 3);
		map.put("posted_num", 5);
		return map;
	}

@RequestMapping(value="/client/process_projects", method = RequestMethod.GET)
	public List<Map<String, Object>> showprocessproject(){
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		map.put("title", "Search Engine");
		map.put("payment", 20);
		map.put("end_date", "2019-12-18");
		map.put("worker_name", "Tony");
		for(int i=0; i<5; i++) {
			list.add(map);
		}
		return list;
	}

@RequestMapping(value="/client/reviewed_projects", method = RequestMethod.GET)
	public List<Map<String, Object>> showreviewedproject(){
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		map.put("title", "Binary Search Tree");
		map.put("payment", 15);
		map.put("end_date", "2019-12-22");
		for(int i=0; i<5; i++) {
			list.add(map);
		}
		return list;
	}
}
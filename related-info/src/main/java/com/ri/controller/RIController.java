package com.ri.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RIController {

	@GetMapping(value="/getDocument/{docGuid}")
	@ResponseBody
	public List<String> getDocGuid(@PathVariable("docGuid") String docGuid){
	  final List<String> list = new ArrayList<>();
	  list.add(docGuid+ "1");
	  list.add(docGuid+ "2");
	  list.add(docGuid+ "3");
	  return list;	
	}
}

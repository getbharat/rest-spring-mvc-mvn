package com.alert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1")
public class AlertController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping(value="/get/{docGuid}")
	@ResponseBody
	public List<String> retrieveDocGuid(@PathVariable("docGuid") String docGuid){
	  final List<String> list = restTemplate.getForObject("http://localhost:8091/RelatedInfo/v1/getDocument/{docGuid}", List.class, docGuid);
	  return list;
	}

	@GetMapping(value="/healthCheck")
	@ResponseBody
	public ResponseEntity<?> healthCheck(){
		return ResponseEntity.ok().build();
	}
}

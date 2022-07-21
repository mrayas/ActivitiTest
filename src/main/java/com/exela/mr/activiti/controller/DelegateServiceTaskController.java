package com.exela.mr.activiti.controller;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("activiti")
public class DelegateServiceTaskController {

	@Autowired
	private RuntimeService runtimeService;

	@GetMapping("service/delegate")
	public String startTheProcess() {
		try {
		runtimeService.startProcessInstanceByKey("java-delegate-service-task-process");

		return "[DelegateServiceTaskController] Mario please check the console log...";
		}catch(Exception e) {
			return "[DelegateServiceTaskController] Exception: "+
					e.toString();
		}
	}
}

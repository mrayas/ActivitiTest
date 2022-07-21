package com.exela.mr.activiti.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
//import org.activiti. engine.impl.pvm.delegate.ActivityBehavior;
//import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.springframework.stereotype.Service;

@Service
//public class JavaDelegateService implements ActivityBehavior {
public class JavaDelegateService implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) {
		try {

		System.out.println("Java Delegate Service Task executed successfully.");

		System.out.println("And the Sum of 2 + 2= " + (2 + 2));
		}catch(Exception e) {
			System.out.println("Java Delegate Service Task executed not  successfully.");
			System.out.println(e.toString());
		}

	}

	/*@Override
	public void execute(ActivityExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Java Delegate Service Task executed successfully.");

		System.out.println("And the Sum of 2 + 2= " + (2 + 2));
	}*/
}

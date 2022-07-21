package com.exela.mr.activiti;

import java.net.InetAddress;

/*
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;*/

import org.activiti.spring.boot.SecurityAutoConfiguration;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) 
public class ActivitiApplication {

	public static void main(String[] args) {
		String sLocalIP="";
		
        try{
            InetAddress ip = InetAddress.getLocalHost();
            sLocalIP =(ip.getHostAddress()).trim();
        }
        catch(Exception ex)
        {
        	sLocalIP="localhost";
        }
		SpringApplication.run(ActivitiApplication.class, args);
		System.out.print("http://"+sLocalIP+":8080/activiti/service/expression\n");
		System.out.print("http://"+sLocalIP+":8080/activiti/service/delegate\n");
	}
	
	/*
	@Bean
    InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {

        return new InitializingBean() {
            public void afterPropertiesSet() throws Exception {

                Group group = identityService.newGroup("user");
                group.setName("users");
                group.setType("security-role");
                identityService.saveGroup(group);

                User admin = identityService.newUser("admin");
                admin.setPassword("admin");
                identityService.saveUser(admin);

            }
        };
    }*/

}

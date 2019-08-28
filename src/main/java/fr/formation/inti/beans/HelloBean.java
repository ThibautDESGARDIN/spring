package fr.formation.inti.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloBean {

	@Autowired
	@Qualifier("halobine")
	MessageBean m;
	
	public MessageBean getM() {
		return m;
	}

	public void setM(MessageBean m) {
		this.m = m;
	}

	public HelloBean() {
	}
	
	public void hello() {
		System.out.println("Hellow !");
		
	}
	
	public static HelloBean createInstance() {
		System.out.println("Creation de Hello Bean");
		return new HelloBean();
	}
	
}

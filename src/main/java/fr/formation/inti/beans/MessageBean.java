package fr.formation.inti.beans;

import org.springframework.stereotype.Component;

@Component("halobine")
public class MessageBean {

	public MessageBean() {
		System.out.println("Messeîdch !");
	}
	
	@Override
	public String toString() {
		return "messageBean";
	}
	
}

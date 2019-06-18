package com.app.model;

import javax.xml.bind.annotation.XmlElement;

import org.springframework.stereotype.Component;

@Component
public class AppModel extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9146436180359430739L;
	@XmlElement
	private Return return1;

	public Return getReturn1() {
		return return1;
	}

	public void setReturn1(Return return1) {
		this.return1 = return1;
	}
}

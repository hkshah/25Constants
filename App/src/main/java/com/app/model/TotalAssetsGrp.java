package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "TotalAssetsGrp")
public class TotalAssetsGrp extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7278804304744059849L;

	@XmlElement
	@Column
	private String EOYAmt;

	@XmlElement
	@Column
	private String BOYAmt;

	public String getEOYAmt() {
		return EOYAmt;
	}

	public void setEOYAmt(String EOYAmt) {
		this.EOYAmt = EOYAmt;
	}

	public String getBOYAmt() {
		return BOYAmt;
	}

	public void setBOYAmt(String BOYAmt) {
		this.BOYAmt = BOYAmt;
	}
}

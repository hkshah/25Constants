package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "IRS990ScheduleB")
public class IRS990ScheduleB extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7958480364931309061L;
	@XmlElement
	@Column
	private String documentId;

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

}

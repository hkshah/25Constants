package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "ReturnData")
public class ReturnData extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -248426526780588865L;

	@XmlElement
	@OneToOne(mappedBy = "ReturnData", cascade = CascadeType.PERSIST)
	private IRS990ScheduleA IRS990ScheduleA;

	@XmlElement
	@OneToOne(mappedBy = "ReturnData", cascade = CascadeType.PERSIST)
	private IRS990ScheduleB IRS990ScheduleB;

	@XmlElement
	@Column
	private String documentCnt;

	@XmlElement
	@OneToOne(mappedBy = "ReturnData", cascade = CascadeType.PERSIST)
	private IRS990 IRS990;

	public IRS990ScheduleA getIRS990ScheduleA() {
		return IRS990ScheduleA;
	}

	public void setIRS990ScheduleA(IRS990ScheduleA iRS990ScheduleA) {
		IRS990ScheduleA = iRS990ScheduleA;
	}

	public IRS990ScheduleB getIRS990ScheduleB() {
		return IRS990ScheduleB;
	}

	public void setIRS990ScheduleB(IRS990ScheduleB iRS990ScheduleB) {
		IRS990ScheduleB = iRS990ScheduleB;
	}

	public String getDocumentCnt() {
		return documentCnt;
	}

	public void setDocumentCnt(String documentCnt) {
		this.documentCnt = documentCnt;
	}

	public IRS990 getIRS990() {
		return IRS990;
	}

	public void setIRS990(IRS990 iRS990) {
		IRS990 = iRS990;
	}

}

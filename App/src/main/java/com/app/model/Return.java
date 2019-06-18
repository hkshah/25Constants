package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Return")
@XmlRootElement
public class Return extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -721557333473406026L;
	@XmlElement
	@Column
	private String returnVersion;
	@XmlElement
	@OneToOne(mappedBy = "Return", cascade = CascadeType.PERSIST)
	private ReturnHeader ReturnHeader;

	@Column
	private String xmlns;
	@XmlElement
	@OneToOne(mappedBy = "Return", cascade = CascadeType.PERSIST)
	private ReturnData ReturnData;

	public String getReturnVersion() {
		return returnVersion;
	}

	public void setReturnVersion(String returnVersion) {
		this.returnVersion = returnVersion;
	}

	public ReturnHeader getReturnHeader() {
		return ReturnHeader;
	}

	public void setReturnHeader(ReturnHeader ReturnHeader) {
		this.ReturnHeader = ReturnHeader;
	}

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public ReturnData getReturnData() {
		return ReturnData;
	}

	public void setReturnData(ReturnData ReturnData) {
		this.ReturnData = ReturnData;
	}

	@Override
	public String toString() {
		return "ClassPojo [returnVersion = " + returnVersion + ", ReturnHeader = " + ReturnHeader + ", xmlns = " + xmlns
				+ ", ReturnData = " + ReturnData + "]";
	}
}

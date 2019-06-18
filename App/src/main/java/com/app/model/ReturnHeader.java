package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "ReturnHeader")
public class ReturnHeader extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1002988246647044909L;

	@XmlElement
	@Column
	private String TaxPeriodEndDt;

	@XmlElement
	@Column
	private String ReturnTs;

	@XmlElement
	@Column
	private String BuildTS;

	@XmlElement
	@Column
	private String TaxPeriodBeginDt;

	public String getTaxPeriodEndDt() {
		return TaxPeriodEndDt;
	}

	public void setTaxPeriodEndDt(String taxPeriodEndDt) {
		TaxPeriodEndDt = taxPeriodEndDt;
	}

	public String getReturnTs() {
		return ReturnTs;
	}

	public void setReturnTs(String returnTs) {
		ReturnTs = returnTs;
	}

	public String getBuildTS() {
		return BuildTS;
	}

	public void setBuildTS(String buildTS) {
		BuildTS = buildTS;
	}

	public String getTaxPeriodBeginDt() {
		return TaxPeriodBeginDt;
	}

	public void setTaxPeriodBeginDt(String taxPeriodBeginDt) {
		TaxPeriodBeginDt = taxPeriodBeginDt;
	}

}

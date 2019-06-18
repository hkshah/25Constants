package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "IRS990ScheduleA")
public class IRS990ScheduleA extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6495140881651358506L;
	@XmlElement
	@Column
	private String PublicSupportTotal170Amt;
	@XmlElement
	@Column
	private String GrossReceiptsRltdActivitiesAmt;
	@XmlElement
	@Column
	private String PublicSupportPY170Pct;
	@XmlElement
	@Column
	private String PublicSupportCY170Pct;
	@XmlElement
	@Column
	private String ThirtyThrPctSuprtTestsCY170Ind;

	public String getPublicSupportTotal170Amt() {
		return PublicSupportTotal170Amt;
	}

	public void setPublicSupportTotal170Amt(String publicSupportTotal170Amt) {
		PublicSupportTotal170Amt = publicSupportTotal170Amt;
	}

	public String getGrossReceiptsRltdActivitiesAmt() {
		return GrossReceiptsRltdActivitiesAmt;
	}

	public void setGrossReceiptsRltdActivitiesAmt(String grossReceiptsRltdActivitiesAmt) {
		GrossReceiptsRltdActivitiesAmt = grossReceiptsRltdActivitiesAmt;
	}

	public String getPublicSupportPY170Pct() {
		return PublicSupportPY170Pct;
	}

	public void setPublicSupportPY170Pct(String publicSupportPY170Pct) {
		PublicSupportPY170Pct = publicSupportPY170Pct;
	}

	public String getPublicSupportCY170Pct() {
		return PublicSupportCY170Pct;
	}

	public void setPublicSupportCY170Pct(String publicSupportCY170Pct) {
		PublicSupportCY170Pct = publicSupportCY170Pct;
	}

	public String getThirtyThrPctSuprtTestsCY170Ind() {
		return ThirtyThrPctSuprtTestsCY170Ind;
	}

	public void setThirtyThrPctSuprtTestsCY170Ind(String thirtyThrPctSuprtTestsCY170Ind) {
		ThirtyThrPctSuprtTestsCY170Ind = thirtyThrPctSuprtTestsCY170Ind;
	}

}

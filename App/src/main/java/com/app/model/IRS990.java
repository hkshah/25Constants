package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "IRS990")
public class IRS990 extends PersistentObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3764453434094481221L;
	@XmlElement
	@OneToOne(mappedBy = "IRS990", cascade = CascadeType.PERSIST)
	private TotalAssetsGrp TotalAssetsGrp;

	@XmlElement
	@Column
	private String RelatedOrganizationCtrlEntInd;

	@XmlElement
	@Column
	private String InfoInScheduleOPartIIIInd;

	@XmlElement
	@Column
	private String MoreThan5000KToIndividualsInd;

	@XmlElement
	@Column
	private String GrantsToOrganizationsInd;

	public TotalAssetsGrp getTotalAssetsGrp() {
		return TotalAssetsGrp;
	}

	public void setTotalAssetsGrp(TotalAssetsGrp totalAssetsGrp) {
		TotalAssetsGrp = totalAssetsGrp;
	}

	public String getRelatedOrganizationCtrlEntInd() {
		return RelatedOrganizationCtrlEntInd;
	}

	public void setRelatedOrganizationCtrlEntInd(String relatedOrganizationCtrlEntInd) {
		RelatedOrganizationCtrlEntInd = relatedOrganizationCtrlEntInd;
	}

	public String getInfoInScheduleOPartIIIInd() {
		return InfoInScheduleOPartIIIInd;
	}

	public void setInfoInScheduleOPartIIIInd(String infoInScheduleOPartIIIInd) {
		InfoInScheduleOPartIIIInd = infoInScheduleOPartIIIInd;
	}

	public String getMoreThan5000KToIndividualsInd() {
		return MoreThan5000KToIndividualsInd;
	}

	public void setMoreThan5000KToIndividualsInd(String moreThan5000KToIndividualsInd) {
		MoreThan5000KToIndividualsInd = moreThan5000KToIndividualsInd;
	}

	public String getGrantsToOrganizationsInd() {
		return GrantsToOrganizationsInd;
	}

	public void setGrantsToOrganizationsInd(String grantsToOrganizationsInd) {
		GrantsToOrganizationsInd = grantsToOrganizationsInd;
	}

}
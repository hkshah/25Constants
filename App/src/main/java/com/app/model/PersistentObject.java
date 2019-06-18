package com.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

@MappedSuperclass
public class PersistentObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1435847551262025591L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column
	private String fileId;
	@Column
	private String fileType;
	@Column
	private Date createdOn;
	@Column
	private String createdBy;
	@Column
	private Date modifiedOn;
	@Column
	private String modifiedBy;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Date getCreatedOn() {
		return new Date();
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return "Hardik Shah";
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}

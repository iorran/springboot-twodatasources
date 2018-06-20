package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the CD_ATTACHMENT_JOURNAL database table.
 *
 */
@Entity
@Table(name="CD_ATTACHMENT_JOURNAL")
@NamedQuery(name="CdAttachmentJournal.findAll", query="SELECT c FROM CdAttachmentJournal c")
@Getter
@Setter
public class CdAttachmentJournal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ATTACHMENT_JOURNAL_ID")
	private String attachmentJournalId;

	@Temporal(TemporalType.DATE)
	@Column(name="ATTACHMENT_DATE")
	private Date attachmentDate;

	@Column(name="ATTACHMENT_ID")
	private String attachmentId;

	@Column(name="ATTACHMENT_LOCATOR")
	private String attachmentLocator;

	@Column(name="ATTACHMENT_NAME")
	private String attachmentName;

	@Column(name="ATTACHMENT_POINT")
	private String attachmentPoint;

	@Column(name="ATTACHMENT_TYPE")
	private BigDecimal attachmentType;

	@Column(name="CREATE_APP_ID")
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID")
	private String createUserId;

	private String description;

	private String flags;

	@Column(name="IS_COMPRESSED")
	private String isCompressed;

	@Column(name="IS_VISIBLE")
	private String isVisible;

	@Column(name="MIME_TYPE")
	private String mimeType;

	private String reference;

	@Column(name="UPDATE_APP_ID")
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID")
	private String updateUserId;
}
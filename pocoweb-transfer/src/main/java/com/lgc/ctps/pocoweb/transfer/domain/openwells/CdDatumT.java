package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CD_DATUM_T database table.
 *
 */
@Entity
@Table(name="CD_DATUM_T")
@NamedQuery(name="CdDatumT.findAll", query="SELECT c FROM CdDatumT c")
@Getter
@Setter
public class CdDatumT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdDatumTPK id;

	@Column(name="CONTRACTOR_ID", length=5)
	private String contractorId;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ESTABLISHED")
	private Date dateEstablished;

	@Column(name="DATUM_DESCRIPTION", length=60)
	private String datumDescription;

	@Column(name="DATUM_ELEVATION", precision=126)
	private double datumElevation;

	@Column(name="DATUM_ERROR", precision=126)
	private double datumError;

	@Column(name="DATUM_NAME", length=60)
	private String datumName;

	@Column(name="DATUM_TYPE", precision=5)
	private BigDecimal datumType;

	@Column(name="IS_DEFAULT", length=1)
	private String isDefault;

	@Column(length=10)
	private String phase;

	@Column(length=2000)
	private String remarks;

	@Column(name="RIG_ID", length=5)
	private String rigId;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;
}
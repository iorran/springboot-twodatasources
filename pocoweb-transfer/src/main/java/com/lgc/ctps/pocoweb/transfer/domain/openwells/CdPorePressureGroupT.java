package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the CD_PORE_PRESSURE_GROUP_T database table.
 *
 */
@Entity
@Table(name="CD_PORE_PRESSURE_GROUP_T")
@NamedQuery(name="CdPorePressureGroupT.findAll", query="SELECT c FROM CdPorePressureGroupT c")
@Getter
@Setter
public class CdPorePressureGroupT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdPorePressureGroupTPK id;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(length=20)
	private String name;

	@Column(length=10)
	private String phase;

	@Column(length=2000)
	private String remarks;

	@Column(name="REPORT_JOURNAL_ID", length=10)
	private String reportJournalId;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="\"VERSION\"", length=20)
	private String version;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;

	//bi-directional many-to-one association to CdPorePressureT
//	@OneToMany(mappedBy="cdPorePressureGroupT")
//	private List<CdPorePressureT> cdPorePressureTs;
}
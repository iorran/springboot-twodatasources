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
 * The persistent class for the CD_TEMP_GRADIENT_GROUP_T database table.
 *
 */
@Entity
@Table(name="CD_TEMP_GRADIENT_GROUP_T")
@NamedQuery(name="CdTempGradientGroupT.findAll", query="SELECT c FROM CdTempGradientGroupT c")
@Getter
@Setter
public class CdTempGradientGroupT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdTempGradientGroupTPK id;

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

	@Column(name="GRAD_TVD", precision=126)
	private double gradTvd;

	@Column(name="MUDLINE_TEMP", precision=126)
	private double mudlineTemp;

	@Column(length=40)
	private String name;

	@Column(length=10)
	private String phase;

	@Column(length=2000)
	private String remarks;

	@Column(name="REPORT_JOURNAL_ID", length=10)
	private String reportJournalId;

	@Column(name="SURFACE_AMBIENT_TEMP", precision=126)
	private double surfaceAmbientTemp;

	@Column(name="TEMP_OR_GRAD_IND", length=12)
	private String tempOrGradInd;

	@Column(name="TEMP_TVD", precision=126)
	private double tempTvd;

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

	//bi-directional many-to-one association to CdTempGradientT
//	@OneToMany(mappedBy="cdTempGradientGroupT")
//	private List<CdTempGradientT> cdTempGradientTs;
}
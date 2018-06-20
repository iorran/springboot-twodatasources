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
 * The persistent class for the CD_SCENARIO_T database table.
 *
 */
@Entity
@Table(name="CD_SCENARIO_T")
@NamedQuery(name="CdScenarioT.findAll", query="SELECT c FROM CdScenarioT c")
@Getter
@Setter
public class CdScenarioT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdScenarioTPK id;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Column(name="DATUM_ID", length=5)
	private String datumId;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="FORMATION_INFLUX_GROUP_ID", length=5)
	private String formationInfluxGroupId;

	@Column(name="FORMATION_SEGMENT_WIDTH", precision=126)
	private double formationSegmentWidth;

	@Column(name="FRAC_GRADIENT_GROUP_ID", length=5)
	private String fracGradientGroupId;

	@Column(name="IS_ASSEMBLY_GROUP_USED", length=1)
	private String isAssemblyGroupUsed;

	@Column(name="IS_CO2_HAZARD", length=1)
	private String isCo2Hazard;

	@Column(name="IS_DISPLAYING_PRIOR_STIMS", length=1)
	private String isDisplayingPriorStims;

	@Column(name="IS_H2S_HAZARD", length=1)
	private String isH2sHazard;

	@Column(name="IS_READONLY", length=1)
	private String isReadonly;

	@Column(length=60)
	private String name;

	@Column(name="ORIGINAL_TUBULAR_DATUM_ID", length=5)
	private String originalTubularDatumId;

	@Column(length=10)
	private String phase;

	@Column(name="PORE_PRESSURE_GROUP_ID", length=5)
	private String porePressureGroupId;

	@Column(length=2000)
	private String remarks;

	@Column(name="TEMP_GRADIENT_GROUP_ID", length=5)
	private String tempGradientGroupId;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="\"VERSION\"", length=20)
	private String version;

	//bi-directional many-to-one association to CdDefinitiveSurveyHeaderT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="DEF_SURVEY_HEADER_ID", referencedColumnName="DEF_SURVEY_HEADER_ID"),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdDefinitiveSurveyHeaderT cdDefinitiveSurveyHeaderT;

	//bi-directional many-to-one association to CdSurveyHeaderT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="SURVEY_HEADER_ID", referencedColumnName="SURVEY_HEADER_ID"),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdSurveyHeaderT cdSurveyHeaderT;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;
}
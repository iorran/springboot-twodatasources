package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * The persistent class for the CD_DEFINITIVE_SURVEY_HEADER_T database table.
 *
 */
@Entity
@Table(name="CD_DEFINITIVE_SURVEY_HEADER_T")
@NamedQuery(name="CdDefinitiveSurveyHeaderT.findAll", query="SELECT c FROM CdDefinitiveSurveyHeaderT c")
@Getter
@Setter
public class CdDefinitiveSurveyHeaderT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdDefinitiveSurveyHeaderTPK id;

	@Column(name="ACSCAN_MD_MAX", precision=126)
	private double acscanMdMax;

	@Column(name="ACSCAN_MD_MIN", precision=126)
	private double acscanMdMin;

	@Column(name="ACSCAN_RADIUS_MAX", precision=126)
	private double acscanRadiusMax;

	@Column(name="ACSCAN_RATIO_MAX", precision=126)
	private double acscanRatioMax;

	@Column(name="AVERAGE_DOGLEG", precision=126)
	private double averageDogleg;

	@Column(name="B_INTERP", length=1)
	private String bInterp;

	@Column(name="B_RANGE", length=1)
	private String bRange;

	@Column(name="B_RATIO", length=1)
	private String bRatio;

	@Column(name="BH_MD", precision=126)
	private double bhMd;

	@Column(name="BH_TVD", precision=126)
	private double bhTvd;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Column(name="DEFINITIVE_PATH", precision=5)
	private BigDecimal definitivePath;

	@Column(name="DEFINITIVE_VERSION", precision=126)
	private double definitiveVersion;

	@Column(length=50)
	private String description;

	@Column(name="DIRECTIONAL_DIFFICULTY_INDEX", precision=126)
	private double directionalDifficultyIndex;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="FINAL_EAST", precision=126)
	private double finalEast;

	@Column(name="FINAL_ERROR", precision=126)
	private double finalError;

	@Column(name="FINAL_NORTH", precision=126)
	private double finalNorth;

	@Column(length=1)
	private String interpolate;

	@Column(name="INTERPOLATION_INTERVAL", precision=126)
	private double interpolationInterval;

	@Column(name="IS_DEFINITIVE", length=1)
	private String isDefinitive;

	@Column(name="IS_READONLY", length=1)
	private String isReadonly;

	@Column(name="IS_SURVEY_PROGRAM_READ_ONLY", length=1)
	private String isSurveyProgramReadOnly;

	@Column(name="KO_EAST", precision=126)
	private double koEast;

	@Column(name="KO_MD", precision=126)
	private double koMd;

	@Column(name="KO_NORTH", precision=126)
	private double koNorth;

	@Column(name="KO_TVD", precision=126)
	private double koTvd;

	@Column(name="MAXIMUM_DLS_DEPTH", precision=126)
	private double maximumDlsDepth;

	@Column(name="MAXIMUM_DLS_VALUE", precision=126)
	private double maximumDlsValue;

	@Column(length=30)
	private String name;

	@Column(length=10)
	private String phase;

	@Column(name="PLANNED_AZIMUTH", precision=126)
	private double plannedAzimuth;

	@Column(length=2000)
	private String remarks;

	@Column(precision=126)
	private double tortuosity;

	@Column(name="TORTUOSITY_PERIOD", precision=126)
	private double tortuosityPeriod;

	@Column(name="TORTUOSITY_TYPE", precision=5)
	private BigDecimal tortuosityType;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="USE_ACTUAL_DATA", length=1)
	private String useActualData;

	@Column(name="USE_PLANNED_PROGRAM", length=1)
	private String usePlannedProgram;

	@Column(name="\"VERSION\"", length=20)
	private String version;

	@Column(name="VS_EAST", precision=126)
	private double vsEast;

	@Column(name="VS_NORTH", precision=126)
	private double vsNorth;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;

	//bi-directional many-to-one association to CdDefinitiveSurveyStationT
//	@OneToMany(mappedBy="cdDefinitiveSurveyHeaderT")
//	private List<CdDefinitiveSurveyStationT> cdDefinitiveSurveyStationTs;

	//bi-directional many-to-one association to CdScenarioT
//	@OneToMany(mappedBy="cdDefinitiveSurveyHeaderT")
//	private List<CdScenarioT> cdScenarioTs;
}
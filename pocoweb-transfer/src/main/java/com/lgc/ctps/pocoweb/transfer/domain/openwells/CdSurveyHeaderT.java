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
 * The persistent class for the CD_SURVEY_HEADER_T database table.
 *
 */
@Entity
@Table(name="CD_SURVEY_HEADER_T")
@NamedQuery(name="CdSurveyHeaderT.findAll", query="SELECT c FROM CdSurveyHeaderT c")
@Getter
@Setter
public class CdSurveyHeaderT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdSurveyHeaderTPK id;

	@Column(name="AVERAGE_DOGLEG", precision=126)
	private double averageDogleg;

	@Column(name="AZIMUTH_CORRECTION", precision=126)
	private double azimuthCorrection;

	@Column(name="AZIMUTH_REFERENCE", length=1)
	private String azimuthReference;

	@Column(name="BEND_ANGLE", precision=126)
	private double bendAngle;

	@Column(name="CASE_ID", length=5)
	private String caseId;

	@Column(length=60)
	private String company;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_END")
	private Date dateEnd;

	@Column(name="DEFINITIVE_PLAN", precision=5)
	private BigDecimal definitivePlan;

	@Column(name="DEPTH_CORRECTION", precision=126)
	private double depthCorrection;

	@Column(name="DEPTH_REFERENCE", length=255)
	private String depthReference;

	@Column(length=1024)
	private String description;

	@Column(name="DIRECTIONAL_DIFFICULTY_INDEX", precision=126)
	private double directionalDifficultyIndex;

	@Column(length=60)
	private String engineer;

	@Temporal(TemporalType.DATE)
	@Column(name="HEADER_DATE")
	private Date headerDate;

	@Column(name="INCLINATION_CORRECTION", precision=126)
	private double inclinationCorrection;

	@Column(name="INTERFERENCE_CORRECTION", precision=126)
	private double interferenceCorrection;

	@Column(name="IS_INTERFERENCE_APPLIED", length=1)
	private String isInterferenceApplied;

	@Column(name="IS_MERGED", length=1)
	private String isMerged;

	@Column(name="IS_READONLY", length=1)
	private String isReadonly;

	@Column(name="IS_SAG_APPLIED", length=1)
	private String isSagApplied;

	@Column(name="IS_STRETCH_APPLIED", length=1)
	private String isStretchApplied;

	@Column(name="MAGNETIC_INTERFERENCE", precision=126)
	private double magneticInterference;

	@Column(name="MAXIMUM_DLS_DEPTH", precision=126)
	private double maximumDlsDepth;

	@Column(name="MAXIMUM_DLS_VALUE", precision=126)
	private double maximumDlsValue;

	@Column(name="MD_MAX", precision=126)
	private double mdMax;

	@Column(name="MD_MIN", precision=126)
	private double mdMin;

	@Column(name="MERGE_INTERVAL", precision=126)
	private double mergeInterval;

	@Column(name="MERGE_SURVEY_IDS", length=255)
	private String mergeSurveyIds;

	@Column(name="MERGE_TOOL_IDS", length=255)
	private String mergeToolIds;

	@Column(name="NUMBER_MERGED", precision=10)
	private BigDecimal numberMerged;

	@Column(name="OFFSET_WELL_ID", length=10)
	private String offsetWellId;

	@Column(name="OVERRIDE_REASON", length=50)
	private String overrideReason;

	@Column(length=10)
	private String phase;

	@Column(name="POLICY_ID", length=10)
	private String policyId;

	@Column(name="PROCESSING_OPTION", precision=5)
	private BigDecimal processingOption;

	@Column(length=2000)
	private String remarks;

	@Column(name="SAG_DATA", length=255)
	private String sagData;

	@Column(name="SCAN_OFFSET_WELL", length=1)
	private String scanOffsetWell;

	@Column(name="SENSOR_FROM_BIT", precision=126)
	private double sensorFromBit;

	@Column(name="STRETCH_FACTOR", precision=126)
	private double stretchFactor;

	@Column(name="STRETCH_FORMULA", length=255)
	private String stretchFormula;

	@Column(name="SURVEY_NAME", length=50)
	private String surveyName;

	@Column(name="SURVEY_TOOL_ID", length=5)
	private String surveyToolId;

	@Column(name="SURVEY_TYPE", precision=5)
	private BigDecimal surveyType;

	@Column(name="TIE_ON_DEPTH", precision=126)
	private double tieOnDepth;

	@Column(name="TIE_ON_TYPE", precision=5)
	private BigDecimal tieOnType;

	@Column(name="TIE_SURVEY_HEADER_ID", length=5)
	private String tieSurveyHeaderId;

	@Column(name="TIE_WELLBORE_ID", length=10)
	private String tieWellboreId;

	@Column(name="TOOL_FACE_ANGLE", precision=126)
	private double toolFaceAngle;

	@Column(precision=126)
	private double tortuosity;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="VERSION_NO", precision=5)
	private BigDecimal versionNo;

	@Column(name="WELL_DESC", length=80)
	private String wellDesc;

	//bi-directional many-to-one association to CdScenarioT
//	@OneToMany(mappedBy="cdSurveyHeaderT")
//	private List<CdScenarioT> cdScenarioTs;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;

	//bi-directional many-to-one association to CdSurveyStationT
//	@OneToMany(mappedBy="cdSurveyHeaderT")
//	private List<CdSurveyStationT> cdSurveyStationTs;
}
package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CD_SURVEY_STATION_T database table.
 *
 */
@Entity
@Table(name="CD_SURVEY_STATION_T")
@NamedQuery(name="CdSurveyStationT.findAll", query="SELECT c FROM CdSurveyStationT c")
@Getter
@Setter
public class CdSurveyStationT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdSurveyStationTPK id;

	@Column(precision=126)
	private double azimuth;

	@Column(name="BUILD_RATE", precision=126)
	private double buildRate;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Column(name="DOGLEG_SEVERITY", precision=126)
	private double doglegSeverity;

	@Column(name="GRAV_AXIAL_RAW", precision=126)
	private double gravAxialRaw;

	@Column(name="GRAV_TRAN1_RAW", precision=126)
	private double gravTran1Raw;

	@Column(name="GRAV_TRAN2_RAW", precision=126)
	private double gravTran2Raw;

	@Column(precision=126)
	private double inclination;

	@Column(name="MAG_AXIAL_RAW", precision=126)
	private double magAxialRaw;

	@Column(name="MAG_TRAN1_RAW", precision=126)
	private double magTran1Raw;

	@Column(name="MAG_TRAN2_RAW", precision=126)
	private double magTran2Raw;

	@Column(precision=126)
	private double md;

	@Column(name="OFFSET_EAST", precision=126)
	private double offsetEast;

	@Column(name="OFFSET_NORTH", precision=126)
	private double offsetNorth;

	@Column(name="PLAN_METHOD", precision=5)
	private BigDecimal planMethod;

	@Column(name="PROJECT_ID", length=10)
	private String projectId;

	@Column(name="PROJECT_TARGET_ID", length=5)
	private String projectTargetId;

	@Column(length=255)
	private String remarks;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(name="STATION_TYPE", precision=5)
	private BigDecimal stationType;

	@Temporal(TemporalType.DATE)
	@Column(name="SURVEY_DATE")
	private Date surveyDate;

	@Column(name="TOOL_FACE_ANGLE", precision=126)
	private double toolFaceAngle;

	@Column(name="TURN_RATE", precision=126)
	private double turnRate;

	@Column(precision=126)
	private double tvd;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="VERTICAL_SECT", precision=126)
	private double verticalSect;

	//bi-directional many-to-one association to CdSurveyHeaderT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="SURVEY_HEADER_ID", referencedColumnName="SURVEY_HEADER_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdSurveyHeaderT cdSurveyHeaderT;
}
package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the CD_DEFINITIVE_SURVEY_STATION_T database table.
 *
 */
@Entity
@Table(name="CD_DEFINITIVE_SURVEY_STATION_T")
@NamedQuery(name="CdDefinitiveSurveyStationT.findAll", query="SELECT c FROM CdDefinitiveSurveyStationT c")
@Getter
@Setter
public class CdDefinitiveSurveyStationT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdDefinitiveSurveyStationTPK id;

	@Column(precision=126)
	private double azimuth;

	@Column(name="CASING_RADIUS", precision=126)
	private double casingRadius;

	@Column(name="COVARIANCE_XX", precision=126)
	private double covarianceXx;

	@Column(name="COVARIANCE_XY", precision=126)
	private double covarianceXy;

	@Column(name="COVARIANCE_XZ", precision=126)
	private double covarianceXz;

	@Column(name="COVARIANCE_YY", precision=126)
	private double covarianceYy;

	@Column(name="COVARIANCE_YZ", precision=126)
	private double covarianceYz;

	@Column(name="COVARIANCE_ZZ", precision=126)
	private double covarianceZz;

	@Column(name="DATA_ENTRY_MODE", length=1)
	private String dataEntryMode;

	@Column(name="DOGLEG_SEVERITY", precision=126)
	private double doglegSeverity;

	@Column(name="DOGLEG_SEVERITY_MAX", precision=126)
	private double doglegSeverityMax;

	@Column(name="ELLIPSE_EAST", precision=126)
	private double ellipseEast;

	@Column(name="ELLIPSE_NORTH", precision=126)
	private double ellipseNorth;

	@Column(name="ELLIPSE_VERTICAL", precision=126)
	private double ellipseVertical;

	@Column(name="GLOBAL_LATERAL_ERROR", precision=126)
	private double globalLateralError;

	@Column(precision=126)
	private double inclination;

	@Column(precision=126)
	private double md;

	@Column(name="OFFSET_EAST", precision=126)
	private double offsetEast;

	@Column(name="OFFSET_NORTH", precision=126)
	private double offsetNorth;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(precision=126)
	private double tvd;

	@Column(name="VERTICAL_SECT", precision=126)
	private double verticalSect;

	//bi-directional many-to-one association to CdDefinitiveSurveyHeaderT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="DEF_SURVEY_HEADER_ID", referencedColumnName="DEF_SURVEY_HEADER_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdDefinitiveSurveyHeaderT cdDefinitiveSurveyHeaderT;
}
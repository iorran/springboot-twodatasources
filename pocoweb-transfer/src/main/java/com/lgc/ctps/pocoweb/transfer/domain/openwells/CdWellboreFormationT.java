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
 * The persistent class for the CD_WELLBORE_FORMATION_T database table.
 *
 */
@Entity
@Table(name="CD_WELLBORE_FORMATION_T")
@NamedQuery(name="CdWellboreFormationT.findAll", query="SELECT c FROM CdWellboreFormationT c")
@Getter
@Setter
public class CdWellboreFormationT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdWellboreFormationTPK id;

	@Column(name="AGE_CODE", length=32)
	private String ageCode;

	@Column(name="BIT_LIFE", precision=126)
	private double bitLife;

	@Column(name="BIT_TYPE", length=20)
	private String bitType;

	@Column(length=100)
	private String comments;

	@Column(name="COMPETENT_LAYER", length=1)
	private String competentLayer;

	@Column(precision=126)
	private double conductivity;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Column(name="DIFF_STICKING_LIMIT", precision=126)
	private double diffStickingLimit;

	@Column(name="DIP_ANGLE", precision=126)
	private double dipAngle;

	@Column(name="DIP_DIRECTION", precision=126)
	private double dipDirection;

	@Column(name="ELASTIC_MODULUS", precision=126)
	private double elasticModulus;

	@Column(name="END_GEO_MAP_EASTING", precision=126)
	private double endGeoMapEasting;

	@Column(name="END_GEO_MAP_NORTHING", precision=126)
	private double endGeoMapNorthing;

	@Column(name="FORMATION_DENSITY", precision=126)
	private double formationDensity;

	@Column(name="FORMATION_NAME", length=50)
	private String formationName;

	@Column(name="FORMATION_NET_PAY", precision=126)
	private double formationNetPay;

	@Column(name="FROZEN_CONDUCTIVITY", precision=126)
	private double frozenConductivity;

	@Column(name="FROZEN_DENSITY", precision=126)
	private double frozenDensity;

	@Column(name="HEAT_OF_FUSION", precision=126)
	private double heatOfFusion;

	@Column(name="IS_PERMEABLE", length=1)
	private String isPermeable;

	@Column(name="LITHOLOGY_ID", length=16)
	private String lithologyId;

	@Column(name="MELTING_POINT", precision=126)
	private double meltingPoint;

	@Column(name="OVERBALANCE_MARGIN", precision=126)
	private double overbalanceMargin;

	@Column(precision=126)
	private double permeability;

	@Column(length=10)
	private String phase;

	@Column(name="POISSONS_RATIO", precision=126)
	private double poissonsRatio;

	@Column(precision=126)
	private double porosity;

	@Column(name="PROGNOSED_BASE_MD", precision=126)
	private double prognosedBaseMd;

	@Column(name="PROGNOSED_BASE_MD_SUBSEA", precision=126)
	private double prognosedBaseMdSubsea;

	@Column(name="PROGNOSED_BASE_TVD", precision=126)
	private double prognosedBaseTvd;

	@Column(name="PROGNOSED_BASE_TVD_SUBSEA", precision=126)
	private double prognosedBaseTvdSubsea;

	@Column(name="PROGNOSED_DEPTH_TYPE", precision=5)
	private BigDecimal prognosedDepthType;

	@Column(name="PROGNOSED_LITHOLOGY", length=50)
	private String prognosedLithology;

	@Column(name="PROGNOSED_MD", precision=126)
	private double prognosedMd;

	@Column(name="PROGNOSED_MD_SUBSEA", precision=126)
	private double prognosedMdSubsea;

	@Column(name="PROGNOSED_TVD", precision=126)
	private double prognosedTvd;

	@Column(name="PROGNOSED_TVD_END", precision=126)
	private double prognosedTvdEnd;

	@Column(name="PROGNOSED_TVD_SUBSEA", precision=126)
	private double prognosedTvdSubsea;

	@Column(name="PROGNOSED_UNCERTAINTY", precision=126)
	private double prognosedUncertainty;

	@Column(name="PROJECT_ID", length=10)
	private String projectId;

	@Column(name="RATE_OF_PENETRATION", precision=126)
	private double rateOfPenetration;

	@Column(name="RESERVOIR_ID", length=10)
	private String reservoirId;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(name="SPECIFIC_HEAT", precision=126)
	private double specificHeat;

	@Column(name="STABILITY_MIN_MW", precision=126)
	private double stabilityMinMw;

	@Column(name="START_GEO_MAP_EASTING", precision=126)
	private double startGeoMapEasting;

	@Column(name="START_GEO_MAP_NORTHING", precision=126)
	private double startGeoMapNorthing;

	@Column(name="STRAT_UNIT_ID", length=10)
	private String stratUnitId;

	@Column(name="SURFACE_ID", length=5)
	private String surfaceId;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	//bi-directional many-to-one association to CdScenarioFormationLinkT
//	@OneToMany(mappedBy="cdWellboreFormationT")
//	private List<CdScenarioFormationLinkT> cdScenarioFormationLinkTs;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;
}
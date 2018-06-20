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
 * The persistent class for the CD_PROJECT_SOURCE database table.
 *
 */
@Entity
@Table(name="CD_PROJECT_SOURCE")
@NamedQuery(name="CdProjectSource.findAll", query="SELECT c FROM CdProjectSource c")
@Getter
@Setter
public class CdProjectSource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROJECT_ID")
	private String projectId;

	@Column(name="ACTIVE_UI_UNITSYS_ID")
	private BigDecimal activeUiUnitsysId;

	@Column(name="BASIN_NAME")
	private String basinName;

	@Column(name="CREATE_APP_ID")
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID")
	private String createUserId;

	@Column(name="DEF_MAG_MODEL")
	private String defMagModel;

	private String description;

	@Column(name="DESCRIPTION_SUPPLEMENT")
	private String descriptionSupplement;

	@Column(name="ENABLE_DAYLIGHT")
	private String enableDaylight;

	@Column(name="FIELD_NO")
	private BigDecimal fieldNo;

	@Column(name="GEO_DATUM_ID")
	private String geoDatumId;

	@Column(name="GEO_SYSTEM_ID")
	private String geoSystemId;

	@Column(name="GEO_ZONE_ID")
	private String geoZoneId;

	@Column(name="IS_FACILITY")
	private String isFacility;

	@Column(name="IS_PROJECT_READONLY")
	private String isProjectReadonly;

	@Column(name="IS_READONLY")
	private String isReadonly;

	@Column(name="LOCAL_COORD_ORIGIN")
	private BigDecimal localCoordOrigin;

	@Column(name="MAG_CALC_MODEL")
	private String magCalcModel;

	@Column(name="PROJECT_CODE")
	private String projectCode;

	@Column(name="PROJECT_NAME")
	private String projectName;

	@Column(name="PROJECT_PASSWORD")
	private String projectPassword;

	private String remarks;

	@Column(name="RISK_DEPTH")
	private double riskDepth;

	@Column(name="RISK_FACTOR")
	private double riskFactor;

	@Column(name="STATE_NO")
	private String stateNo;

	@Column(name="SYSTEM_DATUM_DESC")
	private String systemDatumDesc;

	@Column(name="SYSTEM_DATUM_OFFSET")
	private double systemDatumOffset;

	@Column(name="TEMPLATE_ID")
	private String templateId;

	@Column(name="TIGHT_GROUP_ID")
	private String tightGroupId;

	@Column(name="TIME_ZONE")
	private double timeZone;

	@Column(name="TIME_ZONE_DESCRIPTION")
	private String timeZoneDescription;

	@Column(name="UPDATE_APP_ID")
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID")
	private String updateUserId;

	@Column(name="USE_LOCAL_SCALE_FACTOR")
	private BigDecimal useLocalScaleFactor;

	@Column(name="USE_RISK")
	private String useRisk;

	@Column(name="USE_VARIABLE_CONVERGENCE")
	private String useVariableConvergence;

	@Column(name="VERTICAL_COORD_ORIGIN")
	private BigDecimal verticalCoordOrigin;

	//bi-directional many-to-one association to CdPolicy
//	@ManyToOne
//	@JoinColumn(name="POLICY_ID")
//	private CdPolicy cdPolicy;
}
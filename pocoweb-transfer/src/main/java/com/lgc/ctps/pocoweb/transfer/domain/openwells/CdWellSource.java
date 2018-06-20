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
 * The persistent class for the CD_WELL_SOURCE database table.
 *
 */
@Entity
@Table(name="CD_WELL_SOURCE")
@NamedQuery(name="CdWellSource.findAll", query="SELECT c FROM CdWellSource c")
@Getter
@Setter
public class CdWellSource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="WELL_ID")
	private String wellId;

	@Column(name="ACTIVE_UI_UNITSYS_ID")
	private BigDecimal activeUiUnitsysId;

	@Column(name="API_NO")
	private String apiNo;

	private String battery;

	@Column(name="BATTERY_DIRECTIONS")
	private String batteryDirections;

	@Column(name="COMPLETION_WELL_ID")
	private String completionWellId;

	@Temporal(TemporalType.DATE)
	@Column(name="CONDUCTOR_INSTALL_DATE")
	private Date conductorInstallDate;

	private double convergence;

	@Column(name="COORD_TYPE")
	private BigDecimal coordType;

	@Column(name="CREATE_APP_ID")
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID")
	private String createUserId;

	@Column(name="DATUM_NAME")
	private String datumName;

	@Column(name="FIELD_NAME")
	private String fieldName;

	@Column(name="FIELD_NUMBER")
	private String fieldNumber;

	@Column(name="GEO_DESCRIPTION")
	private String geoDescription;

	@Column(name="GEO_LATITUDE")
	private double geoLatitude;

	@Column(name="GEO_LONGITUDE")
	private double geoLongitude;

	@Column(name="GEO_OFFSET_EAST")
	private double geoOffsetEast;

	@Column(name="GEO_OFFSET_NORTH")
	private double geoOffsetNorth;

	@Column(name="GEO_OFFSET_REFERENCE")
	private String geoOffsetReference;

	@Column(name="IS_CO2_PRESENT")
	private String isCo2Present;

	@Column(name="IS_H2S_PRESENT")
	private String isH2sPresent;

	@Column(name="IS_LAKE_DRILLED")
	private String isLakeDrilled;

	@Column(name="IS_LSA_PRESENT")
	private String isLsaPresent;

	@Column(name="IS_MULTILATERAL")
	private String isMultilateral;

	@Column(name="IS_OFFSHORE")
	private String isOffshore;

	@Column(name="IS_PLATFORM")
	private String isPlatform;

	@Column(name="IS_PROJECT_READONLY")
	private String isProjectReadonly;

	@Column(name="IS_READONLY")
	private String isReadonly;

	@Column(name="IS_SUBSEA")
	private String isSubsea;

	@Column(name="LAHEE_CLASS")
	private String laheeClass;

	@Column(name="LAKE_HEIGHT")
	private double lakeHeight;

	@Column(name="LEASE_TYPE")
	private String leaseType;

	@Column(name="LOC_COUNTRY")
	private String locCountry;

	@Column(name="LOC_COUNTY")
	private String locCounty;

	@Column(name="LOC_STATE")
	private String locState;

	@Column(name="MAASP_A")
	private double maaspA;

	@Column(name="MAASP_B")
	private double maaspB;

	@Column(name="MAASP_C")
	private double maaspC;

	@Column(name="MAASP_D")
	private double maaspD;

	@Column(name="PREVIOUS_WELL_NAME")
	private String previousWellName;

	@Column(name="PUMPER_ROUTE")
	private String pumperRoute;

	private String reason;

	@Column(name="REDRILL_NO")
	private String redrillNo;

	@Column(name="REDRILL_PREV_WELL_ID")
	private String redrillPrevWellId;

	private String remarks;

	@Column(name="ROAD_DESCRIPTION")
	private String roadDescription;

	@Column(name="SCALE_FACTOR")
	private double scaleFactor;

	@Column(name="SITE_ID")
	private String siteId;

	@Column(name="SLOT_EW")
	private double slotEw;

	@Column(name="SLOT_NAME")
	private String slotName;

	@Column(name="SLOT_NS")
	private double slotNs;

	@Column(name="SLOT_RADIAL_ERROR")
	private double slotRadialError;

	@Temporal(TemporalType.DATE)
	@Column(name="SPUD_DATE")
	private Date spudDate;

	@Column(name="TARGET_FORMATION")
	private String targetFormation;

	@Column(name="TIGHT_GROUP_ID")
	private String tightGroupId;

	@Column(name="UNIT_SET_ON_CREATE")
	private String unitSetOnCreate;

	@Column(name="UPDATE_APP_ID")
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID")
	private String updateUserId;

	@Column(name="USE_SLOT_AS_REFERENCE")
	private BigDecimal useSlotAsReference;

	@Column(name="USER_DEFINED_1")
	private String userDefined1;

	@Column(name="USER_DEFINED_10")
	private String userDefined10;

	@Column(name="USER_DEFINED_11")
	private String userDefined11;

	@Column(name="USER_DEFINED_12")
	private String userDefined12;

	@Column(name="USER_DEFINED_2")
	private String userDefined2;

	@Column(name="USER_DEFINED_3")
	private String userDefined3;

	@Column(name="USER_DEFINED_4")
	private String userDefined4;

	@Column(name="USER_DEFINED_5")
	private String userDefined5;

	@Column(name="USER_DEFINED_6")
	private String userDefined6;

	@Column(name="USER_DEFINED_7")
	private String userDefined7;

	@Column(name="USER_DEFINED_8")
	private String userDefined8;

	@Column(name="USER_DEFINED_9")
	private String userDefined9;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DEFINED_DATE_1")
	private Date userDefinedDate1;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DEFINED_DATE_2")
	private Date userDefinedDate2;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DEFINED_DATE_3")
	private Date userDefinedDate3;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DEFINED_DATE_4")
	private Date userDefinedDate4;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DEFINED_DATE_5")
	private Date userDefinedDate5;

	@Column(name="WATER_DEPTH")
	private double waterDepth;

	@Column(name="WELL_COMMON_NAME")
	private String wellCommonName;

	@Column(name="WELL_DESC")
	private String wellDesc;

	@Column(name="WELL_DESC_ALTERNATE")
	private String wellDescAlternate;

	@Column(name="WELL_DIRECTIONS")
	private String wellDirections;

	@Column(name="WELL_GEOMETRY")
	private String wellGeometry;

	@Column(name="WELL_LEGAL_NAME")
	private String wellLegalName;

	@Column(name="WELL_NET_INT")
	private double wellNetInt;

	@Column(name="WELL_OPERATOR")
	private String wellOperator;

	@Column(name="WELL_OPERATOR_ORIGINAL")
	private String wellOperatorOriginal;

	@Column(name="WELL_PURPOSE")
	private String wellPurpose;

	@Column(name="WELL_UWI")
	private String wellUwi;

	@Column(name="WELL_UWI_TYPE")
	private String wellUwiType;

	@Column(name="WELL_WORKING_INT")
	private double wellWorkingInt;

	@Column(name="WELLHEAD_DEPTH")
	private double wellheadDepth;

	@Column(name="WRP_AZIMUTH")
	private double wrpAzimuth;

	@Column(name="WRP_EW")
	private double wrpEw;

	@Column(name="WRP_INCLINATION")
	private double wrpInclination;

	@Column(name="WRP_MD")
	private double wrpMd;

	@Column(name="WRP_NS")
	private double wrpNs;

	@Column(name="WRP_OFFSET")
	private BigDecimal wrpOffset;

	@Column(name="WRP_TVD")
	private double wrpTvd;
}
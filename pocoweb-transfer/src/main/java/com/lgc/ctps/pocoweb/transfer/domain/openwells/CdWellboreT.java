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
 * The persistent class for the CD_WELLBORE_T database table.
 *
 */
@Entity
@Table(name="CD_WELLBORE_T")
@NamedQuery(name="CdWellboreT.findAllProjection", query="SELECT c FROM CdWellboreT c")
@Getter
@Setter
public class CdWellboreT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdWellboreTPK id;

	@Column(name="API_NO", length=20)
	private String apiNo;

	@Column(name="API_SUFFIX", length=8)
	private String apiSuffix;

	@Column(name="AUTHORIZED_MD", precision=126)
	private Double authorizedMd;

	@Column(name="AUTHORIZED_TVD", precision=126)
	private Double authorizedTvd;

	@Column(name="B_RANGE", precision=5)
	private BigDecimal bRange;

	@Column(name="B_RATIO", precision=5)
	private BigDecimal bRatio;

	@Column(name="BATCH_SET_CODE", length=6)
	private String batchSetCode;

	@Column(name="BH_MD", precision=126)
	private Double bhMd;

	@Column(name="BH_TVD", precision=126)
	private Double bhTvd;

	@Column(name="BUDGETED_MD", precision=126)
	private Double budgetedMd;

	@Column(name="BUDGETED_TVD", precision=126)
	private Double budgetedTvd;

	@Column(name="CONDUCTOR_SET_BY_DRILL_RIG", length=1)
	private String conductorSetByDrillRig;

	@Column(name="CONNECTION_ID", length=5)
	private String connectionId;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TD_REACHED")
	private Date dateTdReached;

	@Column(name="DEFAULT_FLUID_ID", length=5)
	private String defaultFluidId;

	@Column(name="END_STATUS", length=30)
	private String endStatus;

	@Column(name="EXTERNAL_WELL_ID", length=60)
	private String externalWellId;

	@Column(name="GEO_DESCRIPTION_BH", length=80)
	private String geoDescriptionBh;

	@Column(name="GEO_DESCRIPTION_KO", length=80)
	private String geoDescriptionKo;

	@Column(name="GEO_LATITUDE_BH", precision=126)
	private Double geoLatitudeBh;

	@Column(name="GEO_LATITUDE_KO", precision=126)
	private Double geoLatitudeKo;

	@Column(name="GEO_LONGITUDE_BH", precision=126)
	private Double geoLongitudeBh;

	@Column(name="GEO_LONGITUDE_KO", precision=126)
	private Double geoLongitudeKo;

	@Column(name="GEO_OFFSET_EAST_BH", precision=126)
	private Double geoOffsetEastBh;

	@Column(name="GEO_OFFSET_EAST_KO", precision=126)
	private Double geoOffsetEastKo;

	@Column(name="GEO_OFFSET_NORTH_BH", precision=126)
	private Double geoOffsetNorthBh;

	@Column(name="GEO_OFFSET_NORTH_KO", precision=126)
	private Double geoOffsetNorthKo;

	@Column(name="GEO_OFFSET_REFERENCE_BH", length=80)
	private String geoOffsetReferenceBh;

	@Column(name="GEO_OFFSET_REFERENCE_KO", length=80)
	private String geoOffsetReferenceKo;

	@Column(name="GEOLOGICAL_PLAY", length=50)
	private String geologicalPlay;

	@Column(name="GOVERNMENT_NO", length=20)
	private String governmentNo;

	@Column(name="HORIZONTAL_LENGTH", precision=126)
	private Double horizontalLength;

	@Column(length=1)
	private String interpolate;

	@Column(name="INTERPOLATION_INTERVAL", precision=126)
	private Double interpolationInterval;

	@Column(name="IS_COMPLEX", length=1)
	private String isComplex;

	@Column(name="IS_CONTINGENCY_SIDETRACK", length=1)
	private String isContingencySidetrack;

	@Column(name="IS_DEVIATED", length=1)
	private String isDeviated;

	@Column(name="IS_EXCEPTIONAL", length=1)
	private String isExceptional;

	@Column(name="IS_HIGH_PRESSURE", length=1)
	private String isHighPressure;

	@Column(name="IS_HIGH_TEMP", length=1)
	private String isHighTemp;

	@Column(name="IS_LOCATOR", length=1)
	private String isLocator;

	@Column(name="IS_MANAGED_PRESSURE", length=1)
	private String isManagedPressure;

	@Column(name="IS_MECHANICAL_SIDETRACK", length=1)
	private String isMechanicalSidetrack;

	@Column(name="IS_OFFLINE_SLOT_RECOVERY", length=1)
	private String isOfflineSlotRecovery;

	@Column(name="IS_PRODUCTION_CAPABLE", length=1)
	private String isProductionCapable;

	@Column(name="IS_PROJECT_READONLY", length=1)
	private String isProjectReadonly;

	@Column(name="IS_READONLY", length=1)
	private String isReadonly;

	@Column(name="IS_SUB_SALT", length=1)
	private String isSubSalt;

	@Column(name="IS_UNDERBALANCED", length=1)
	private String isUnderbalanced;

	@Temporal(TemporalType.DATE)
	@Column(name="KO_DATE")
	private Date koDate;

	@Column(name="KO_MD", precision=126)
	private Double koMd;

	@Column(name="KO_TVD", precision=126)
	private Double koTvd;

	@Temporal(TemporalType.DATE)
	@Column(name="LICENSE_DATE")
	private Date licenseDate;

	@Column(name="LICENSE_NO", length=20)
	private String licenseNo;

	@Column(length=60)
	private String licensee;

	@Column(name="NEW_TECHNIQUES", length=128)
	private String newTechniques;

	@Column(name="OW_WELL_UWI", length=26)
	private String owWellUwi;

	@Column(name="PARENT_WELLBORE_ID", length=10)
	private String parentWellboreId;

	@Column(length=10)
	private String phase;

	@Column(name="PLAY_TYPE", length=2)
	private String playType;

	@Column(name="PLUGBACK_MD", precision=126)
	private Double plugbackMd;

	@Column(name="PLUGBACK_TVD", precision=126)
	private Double plugbackTvd;

	@Column(length=30)
	private String reason;

	@Column(length=16)
	private String redrill;

	@Column(length=2000)
	private String remarks;

	@Column(name="RIG_NAME", length=60)
	private String rigName;

	@Column(name="RT_SAMPLE_DEPTH_INTERVAL", precision=126)
	private Double rtSampleDepthInterval;

	@Column(name="SUB_SALT_BASE_TVD", precision=126)
	private Double subSaltBaseTvd;

	@Column(name="SUB_SALT_TOP_TVD", precision=126)
	private Double subSaltTopTvd;

	@Column(name="TAML_CLASS", length=6)
	private String tamlClass;

	@Column(name="TIGHT_GROUP_ID", length=5)
	private String tightGroupId;

	@Column(name="TYPICAL_SCHEMATIC_TYPE", precision=10)
	private BigDecimal typicalSchematicType;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="WELL_LEGAL_NAME", length=60)
	private String wellLegalName;

	@Column(name="WELLBORE_LABEL", length=60)
	private String wellboreLabel;

	@Column(name="WELLBORE_NAME", length=60)
	private String wellboreName;

	@Column(name="WELLBORE_NO", length=2)
	private String wellboreNo;

	@Column(name="WELLBORE_TYPE_ID", length=5)
	private String wellboreTypeId;

	@Column(name="WELLBORE_TYPE_POLICY_ID", length=10)
	private String wellboreTypePolicyId;

	@Column(name="WELLBORE_UWI", length=60)
	private String wellboreUwi;

	@Column(name="WELLPATH_TYPE", precision=5)
	private BigDecimal wellpathType;
}
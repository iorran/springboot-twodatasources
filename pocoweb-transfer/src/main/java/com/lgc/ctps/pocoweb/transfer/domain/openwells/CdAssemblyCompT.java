package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CD_ASSEMBLY_COMP_T database table.
 *
 */
@Entity
@Table(name="CD_ASSEMBLY_COMP_T")
@NamedQuery(name="CdAssemblyCompT.findAll", query="SELECT c FROM CdAssemblyCompT c")
@Getter
@Setter
public class CdAssemblyCompT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdAssemblyCompTPK id;

	@Column(name="ANISOTROPIC_HOOP", precision=126)
	private double anisotropicHoop;

	@Column(name="ANISOTROPIC_RADIAL", precision=126)
	private double anisotropicRadial;

	@Column(name="ANNULAR_FLOW_AREA", precision=126)
	private double annularFlowArea;

	@Column(name="APPROXIMATE_WEIGHT", precision=126)
	private double approximateWeight;

	@Column(name="AREA_OPENING_INTERNAL", precision=126)
	private double areaOpeningInternal;

	@Column(name="AUDIT_REMARKS", length=255)
	private String auditRemarks;

	@Column(name="AVERAGE_JOINT_LENGTH", precision=126)
	private double averageJointLength;

	@Column(name="AXIAL_RATING", precision=126)
	private double axialRating;

	@Column(name="BITFLOW_RATE", precision=126)
	private double bitflowRate;

	@Column(name="BLADE_LENGTH", precision=126)
	private double bladeLength;

	@Column(name="BOT_CONN_LENGTH", precision=126)
	private double botConnLength;

	@Column(name="BOT_CONN_OD", precision=126)
	private double botConnOd;

	@Column(name="BOT_CONN_TYPE", length=50)
	private String botConnType;

	@Column(name="BOX_PIN_CONFIG", length=20)
	private String boxPinConfig;

	@Column(name="CATALOG_ID", length=5)
	private String catalogId;

	@Column(name="CATALOG_ITEM_ID", length=5)
	private String catalogItemId;

	@Column(name="CATALOG_KEY_DESC", length=255)
	private String catalogKeyDesc;

	@Column(precision=126)
	private double centers;

	@Column(name="CLOSED_END_DISPLACEMENT", precision=126)
	private double closedEndDisplacement;

	@Column(length=50)
	private String coating;

	@Column(name="COMP_COST", precision=126)
	private double compCost;

	@Column(name="COMP_GROUP", length=50)
	private String compGroup;

	@Column(name="COMP_NAME", length=255)
	private String compName;

	@Column(name="COMP_TYPE_CODE", length=6)
	private String compTypeCode;

	@Column(length=32)
	private String condition;

	@Column(precision=126)
	private double conductivity;

	@Column(name="CONNECTION_GRADE", length=60)
	private String connectionGrade;

	@Column(name="CONNECTION_NAME", length=255)
	private String connectionName;

	@Column(name="CONNECTION_TORSIONAL_YIELD", precision=126)
	private double connectionTorsionalYield;

	@Column(name="CONNECTION_TYPE", length=50)
	private String connectionType;

	@Column(name="CONTACT_LENGTH", precision=126)
	private double contactLength;

	@Column(name="CORING_MODE", length=1)
	private String coringMode;

	@Column(name="CORRECTION_FACTOR", precision=126)
	private double correctionFactor;

	@Column(name="COST_PER_LENGTH", precision=126)
	private double costPerLength;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Column(name="CRITICAL_PERCENT_AXIAL", precision=126)
	private double criticalPercentAxial;

	@Column(name="CRITICAL_PERCENT_COLLAPSE", precision=126)
	private double criticalPercentCollapse;

	@Column(name="CRITICAL_PERCENT_TRIAXIAL", precision=126)
	private double criticalPercentTriaxial;

	@Column(name="CRITICAL_PERCENT_TRIAXIAL_HOOP", precision=126)
	private double criticalPercentTriaxialHoop;

	@Column(name="CSG_COMP_GROUP_CODE", length=6)
	private String csgCompGroupCode;

	@Column(precision=126)
	private double density;

	@Column(length=255)
	private String description;

	@Column(precision=126)
	private double displacement;

	@Column(name="DISTANCE_FROM_BIT", precision=126)
	private double distanceFromBit;

	@Column(name="EVENT_ID", length=5)
	private String eventId;

	@Column(name="EXTERNAL_COMP_ACC_ID", length=5)
	private String externalCompAccId;

	@Column(name="EXTERNAL_PRESSURE_TEST", precision=126)
	private double externalPressureTest;

	@Column(name="FATIGUE_ENDURANCE_LIMIT", precision=126)
	private double fatigueEnduranceLimit;

	@Column(name="FISH_NECK_TYPE", length=32)
	private String fishNeckType;

	@Column(name="FISHNECK_LENGTH", precision=126)
	private double fishneckLength;

	@Column(name="FISHNECK_OD", precision=126)
	private double fishneckOd;

	@Column(name="FLOAT_ID", precision=126)
	private double floatId;

	@Column(name="FRICTION_COEFF", precision=126)
	private double frictionCoeff;

	@Column(length=60)
	private String grade;

	@Column(name="GRADE_ID", length=10)
	private String gradeId;

	@Column(name="HANGER_SIZE", precision=126)
	private double hangerSize;

	@Column(name="ID_BODY", precision=126)
	private double idBody;

	@Column(name="ID_CONNECTION", precision=126)
	private double idConnection;

	@Column(name="ID_COUPLING", precision=126)
	private double idCoupling;

	@Column(name="ID_DRIFT", precision=126)
	private double idDrift;

	@Column(name="ID_MIN", precision=126)
	private double idMin;

	@Column(name="ID_SLEEVE", precision=126)
	private double idSleeve;

	@Column(name="INTERNAL_PRESSURE_TEST", precision=126)
	private double internalPressureTest;

	@Column(name="INTERNAL_REF", length=16)
	private String internalRef;

	@Column(name="IS_BIT_FLOW", length=1)
	private String isBitFlow;

	@Column(name="IS_FLOW_OUT", length=1)
	private String isFlowOut;

	@Column(name="IS_PORT_OPEN", length=1)
	private String isPortOpen;

	@Column(name="IS_SLOT_ROUND", length=1)
	private String isSlotRound;

	@Column(name="IS_SLOTTED", length=1)
	private String isSlotted;

	@Column(name="IS_SPIRAL", length=1)
	private String isSpiral;

	@Column(name="IS_THREADLOCK_USED", length=1)
	private String isThreadlockUsed;

	@Column(name="JOINT_COST", precision=126)
	private double jointCost;

	@Column(name="JOINT_STRENGTH", precision=126)
	private double jointStrength;

	@Column(name="JOINT_STRENGTH_COMPRESSION", precision=126)
	private double jointStrengthCompression;

	@Column(precision=5)
	private BigDecimal joints;

	@Column(name="\"LENGTH\"", precision=126)
	private double length;

	@Column(name="LENGTH_INSIDE_COUPLING", precision=126)
	private double lengthInsideCoupling;

	@Column(name="LENGTH_OUTSIDE_COUPLING", precision=126)
	private double lengthOutsideCoupling;

	@Column(name="LENGTH_TOOL_JOINT", precision=126)
	private double lengthToolJoint;

	@Column(name="LENGTH_TOOL_JOINT_INSIDE", precision=126)
	private double lengthToolJointInside;

	@Column(name="LINEAR_CAPACITY", precision=126)
	private double linearCapacity;

	@Column(name="MAKEUP_TORQUE", precision=126)
	private double makeupTorque;

	@Column(length=60)
	private String manufacturer;

	@Column(name="MANUFACTURER_ID", length=5)
	private String manufacturerId;

	@Column(length=32)
	private String material;

	@Column(name="MATERIAL_ID", length=10)
	private String materialId;

	@Column(name="MATERIAL_NUM", length=16)
	private String materialNum;

	@Column(name="MAX_BEND", precision=126)
	private double maxBend;

	@Column(name="MAX_HOLE_SIZE", precision=126)
	private double maxHoleSize;

	@Column(name="MAX_REC_FLOW_RATE", precision=126)
	private double maxRecFlowRate;

	@Column(name="MAX_SEAL_PRESSURE", precision=126)
	private double maxSealPressure;

	@Column(name="MAX_SLIP_OD", precision=126)
	private double maxSlipOd;

	@Column(name="MD_BASE", precision=126)
	private double mdBase;

	@Column(name="MD_TOP", precision=126)
	private double mdTop;

	@Column(name="MIN_ID", precision=126)
	private double minId;

	@Column(name="MIN_OP_PRESSURE", precision=126)
	private double minOpPressure;

	@Column(name="MIN_SLIP_OD", precision=126)
	private double minSlipOd;

	@Column(name="MIN_YIELD_STRESS", precision=126)
	private double minYieldStress;

	@Column(length=30)
	private String model;

	@Column(name="NOMINAL_SIZE", length=18)
	private String nominalSize;

	@Column(name="NOMINAL_WEIGHT", length=12)
	private String nominalWeight;

	@Column(name="NOMINAL_WEIGHT_MEASURE", precision=126)
	private double nominalWeightMeasure;

	@Column(name="NUM_ROWS", precision=5)
	private BigDecimal numRows;

	@Column(name="NUMBER_SLOTS", precision=126)
	private double numberSlots;

	@Column(name="OD_AVERAGE", precision=126)
	private double odAverage;

	@Column(name="OD_BODY", precision=126)
	private double odBody;

	@Column(name="OD_CONNECTION", precision=126)
	private double odConnection;

	@Column(name="OD_EXTENDED", precision=126)
	private double odExtended;

	@Column(name="OD_MAX", precision=126)
	private double odMax;

	@Column(name="OD_RETRACTED", precision=126)
	private double odRetracted;

	@Column(name="OD_SLEEVE", precision=126)
	private double odSleeve;

	@Column(name="PERC_AREA_OPEN", precision=126)
	private double percAreaOpen;

	@Column(name="PERCENT_PLUGGED", precision=126)
	private double percentPlugged;

	@Column(name="PERF_DENSITY", precision=126)
	private double perfDensity;

	@Column(name="PERF_HOLE_DIAMETER", precision=126)
	private double perfHoleDiameter;

	@Column(name="PILOT_HOLE_SIZE", precision=126)
	private double pilotHoleSize;

	@Column(name="PIPE_DATA_ID", length=5)
	private String pipeDataId;

	@Column(name="PIPE_PRESSURE_BURST", precision=126)
	private double pipePressureBurst;

	@Column(name="PIPE_RUN_ID", length=5)
	private String pipeRunId;

	@Column(name="PIPE_TYPE", length=8)
	private String pipeType;

	@Column(name="PLAIN_END_COST", precision=126)
	private double plainEndCost;

	@Column(name="POCKET_SIZE", precision=126)
	private double pocketSize;

	@Column(name="POCKET_TYPE", length=32)
	private String pocketType;

	@Column(name="POISSONS_RATIO", precision=126)
	private double poissonsRatio;

	@Column(name="PRESS_RATING_BOT", precision=126)
	private double pressRatingBot;

	@Column(name="PRESS_RATING_TOP", precision=126)
	private double pressRatingTop;

	@Column(name="PRESSURE_BURST", precision=126)
	private double pressureBurst;

	@Column(name="PRESSURE_COLLAPSE", precision=126)
	private double pressureCollapse;

	@Column(name="PROFILE_TYPE", length=32)
	private String profileType;

	@Column(name="PROP_CONNECT_CATALOG_ID", length=5)
	private String propConnectCatalogId;

	@Column(name="PROP_CONNECT_CATALOG_ITEM_ID", length=5)
	private String propConnectCatalogItemId;

	@Column(name="\"RANGE\"", length=1)
	private String range;

	@Column(length=255)
	private String remarks;

	@Column(name="SAFETY_FACTOR", precision=126)
	private double safetyFactor;

	@Column(name="SCREEN_LENGTH", precision=126)
	private double screenLength;

	@Column(name="SEAL_TYPE", length=32)
	private String sealType;

	@Column(name="SECT_TYPE_CODE", length=6)
	private String sectTypeCode;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(name="SERIAL_NO", length=25)
	private String serialNo;

	@Column(name="SERVICE_CLASS", length=4)
	private String serviceClass;

	@Column(name="SERVICE_TYPE", length=25)
	private String serviceType;

	@Column(name="SLEEVE_LENGTH", precision=126)
	private double sleeveLength;

	@Column(name="SLIP_FRICTION_FACTOR", precision=126)
	private double slipFrictionFactor;

	@Column(name="SLIP_LENGTH", precision=126)
	private double slipLength;

	@Column(name="SLIP_TAPER_ANGLE", precision=126)
	private double slipTaperAngle;

	@Column(name="SLOT_BOTTOM_MD", precision=126)
	private double slotBottomMd;

	@Column(name="SLOT_LENGTH", precision=126)
	private double slotLength;

	@Column(name="SLOT_TOP_MD", precision=126)
	private double slotTopMd;

	@Column(name="SLOT_TYPE", length=32)
	private String slotType;

	@Column(name="SLOT_WIDTH", precision=126)
	private double slotWidth;

	@Column(name="SUB_ASSEMBLY_COMP_ID", length=5)
	private String subAssemblyCompId;

	@Column(name="SUB_ASSEMBLY_ID", length=5)
	private String subAssemblyId;

	@Column(length=60)
	private String supplier;

	@Column(precision=126)
	private double tfa;

	@Column(name="THERMAL_EXPANSION_COEF", precision=126)
	private double thermalExpansionCoef;

	@Column(name="THREAD_TYPE", length=25)
	private String threadType;

	@Column(name="TOP_CONN_LENGTH", precision=126)
	private double topConnLength;

	@Column(name="TOP_CONN_OD", precision=126)
	private double topConnOd;

	@Column(name="TOP_CONN_TYPE", length=50)
	private String topConnType;

	@Column(name="TORQUE_MAX", precision=126)
	private double torqueMax;

	@Column(name="TORQUE_MIN", precision=126)
	private double torqueMin;

	@Column(name="ULTIMATE_TENSILE_STRENGTH", precision=126)
	private double ultimateTensileStrength;

	@Column(name="UNDERCUT_ANGLE", precision=126)
	private double undercutAngle;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="WALL_THICKNESS", precision=126)
	private double wallThickness;

	@Column(name="WALL_THICKNESS_PERCENT", precision=126)
	private double wallThicknessPercent;

	@Column(precision=126)
	private double width;

	@Column(name="WL_BORE_SIZE", precision=126)
	private double wlBoreSize;

	@Column(name="WORKING_PRESS", precision=126)
	private double workingPress;

	@Column(name="YIELD_WEIGHT_BODY", precision=126)
	private double yieldWeightBody;

	@Column(name="YIELD_WEIGHT_CONN", precision=126)
	private double yieldWeightConn;

	@Column(name="YOUNGS_MODULUS", precision=126)
	private double youngsModulus;

	//bi-directional many-to-one association to CdAssemblyT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="ASSEMBLY_ID", referencedColumnName="ASSEMBLY_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdAssemblyT cdAssemblyT;
}
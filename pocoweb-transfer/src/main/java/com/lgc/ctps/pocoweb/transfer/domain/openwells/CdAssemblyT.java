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
 * The persistent class for the CD_ASSEMBLY_T database table.
 *
 */
@Entity
@Table(name="CD_ASSEMBLY_T")
@NamedQuery(name="CdAssemblyT.findAll", query="SELECT c FROM CdAssemblyT c")
@Getter
@Setter
public class CdAssemblyT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdAssemblyTPK id;

	@Column(name="ASSEMBLY_NAME", length=50)
	private String assemblyName;

	@Column(name="ASSEMBLY_NO", length=20)
	private String assemblyNo;

	@Column(name="ASSEMBLY_SIZE", precision=126)
	private double assemblySize;

	@Column(name="ASSEMBLY_TYPE", length=50)
	private String assemblyType;

	@Column(name="CASING_CUT_OFF", precision=126)
	private double casingCutOff;

	@Column(name="CEMENT_DAY_NO", precision=126)
	private double cementDayNo;

	@Column(name="CONCENTRIC_ASSEMBLY_ID", length=5)
	private String concentricAssemblyId;

	@Column(name="CONCENTRIC_ASSEMBLY_WB_ID", length=10)
	private String concentricAssemblyWbId;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_REPORT")
	private Date dateReport;

	@Column(name="DESIGN_LIFE", length=6)
	private String designLife;

	@Column(name="EVENT_ID", length=5)
	private String eventId;

	@Column(name="HOLE_SIZE", precision=126)
	private double holeSize;

	@Column(name="ID_MIN", precision=126)
	private double idMin;

	@Column(name="IS_CASING_LINER", length=1)
	private String isCasingLiner;

	@Column(name="IS_PARALLEL", length=1)
	private String isParallel;

	@Column(name="IS_TOP_DOWN", length=1)
	private String isTopDown;

	@Column(name="LENGTH_TOTAL", precision=126)
	private double lengthTotal;

	@Column(name="MD_ASSEMBLY_BASE", precision=126)
	private double mdAssemblyBase;

	@Column(name="MD_ASSEMBLY_TOP", precision=126)
	private double mdAssemblyTop;

	@Column(name="MD_SET_DEPTH_CORRECTION", precision=126)
	private double mdSetDepthCorrection;

	@Column(name="MD_TOC", precision=126)
	private double mdToc;

	@Column(name="MUD_DENSITY_SHOE", precision=126)
	private double mudDensityShoe;

	@Column(name="NO_COMPLETION_TRIPS", precision=10)
	private BigDecimal noCompletionTrips;

	@Column(name="OD_MAX", precision=126)
	private double odMax;

	@Column(precision=126)
	private double overlap;

	@Column(length=10)
	private String phase;

	@Column(name="PILOT_HOLE_SIZE", precision=126)
	private double pilotHoleSize;

	@Column(name="PIPE_RUN_ID", length=5)
	private String pipeRunId;

	@Column(name="PLAN_DEPTH_TYPE", precision=5)
	private BigDecimal planDepthType;

	@Column(length=2000)
	private String remarks;

	@Column(name="REPORT_JOURNAL_ID", length=10)
	private String reportJournalId;

	@Column(name="ROD_LOAD_FACTOR", precision=126)
	private double rodLoadFactor;

	@Column(name="ROD_SVC_FACTOR", precision=126)
	private double rodSvcFactor;

	@Column(name="SAND_CONTROL_EQUIPMENT", length=1)
	private String sandControlEquipment;

	@Column(name="SET_DAY_NO", precision=126)
	private double setDayNo;

	@Column(name="STRING_CLASS", length=16)
	private String stringClass;

	@Column(name="STRING_TYPE", length=20)
	private String stringType;

	@Column(name="SUSP_POINT", length=50)
	private String suspPoint;

	@Column(name="SUSP_POINT_CORRECTION", precision=126)
	private double suspPointCorrection;

	@Column(name="TVD_ASSEMBLY_BASE", precision=126)
	private double tvdAssemblyBase;

	@Column(name="TVD_ASSEMBLY_TOP", precision=126)
	private double tvdAssemblyTop;

	@Column(name="TVD_TOC", precision=126)
	private double tvdToc;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="WEIGHT_ABOVE_JARS", precision=126)
	private double weightAboveJars;

	@Column(name="WEIGHT_BELOW_JARS", precision=126)
	private double weightBelowJars;

	//bi-directional many-to-one association to CdAssemblyCompT
//	@OneToMany(mappedBy="cdAssemblyT")
//	private List<CdAssemblyCompT> cdAssemblyCompTs;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;
}
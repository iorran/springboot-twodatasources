package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CD_CASE_T database table.
 *
 */
@Entity
@Table(name="CD_CASE_T")
@NamedQuery(name="CdCaseT.findAll", query="SELECT c FROM CdCaseT c")
@Getter
@Setter
public class CdCaseT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdCaseTPK id;

	@Column(name="ASSEMBLY_ID", length=5)
	private String assemblyId;

	@Column(name="BLOOIE_LINE_INNER_DIAMETER", precision=126)
	private double blooieLineInnerDiameter;

	@Column(name="BLOOIE_LINE_LENGTH", precision=126)
	private double blooieLineLength;

	@Column(name="CASE_AUTHOR", length=50)
	private String caseAuthor;

	@Column(name="CASE_DESCRIPTION", length=255)
	private String caseDescription;

	@Column(name="CASE_NAME", length=60)
	private String caseName;

	@Column(name="CONTRACTOR_ID", length=5)
	private String contractorId;

	@Column(name="CREATE_APP_ID", length=20)
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID", length=30)
	private String createUserId;

	@Column(name="DATUM_ID", length=5)
	private String datumId;

	@Column(name="DRILL_DEPTH_RATING", precision=126)
	private double drillDepthRating;

	@Column(name="FLUID_ID", length=5)
	private String fluidId;

	@Column(name="HOLE_SECT_GROUP_ID", length=5)
	private String holeSectGroupId;

	@Column(name="INNER_ASSEMBLY_ID", length=5)
	private String innerAssemblyId;

	@Column(name="IS_LINKED", length=1)
	private String isLinked;

	@Column(name="IS_READONLY", length=1)
	private String isReadonly;

	@Temporal(TemporalType.DATE)
	@Column(name="JOB_DATE")
	private Date jobDate;

	@Column(name="JOB_DESCRIPTION", length=50)
	private String jobDescription;

	@Column(name="JOB_PIPE_SIZE", length=50)
	private String jobPipeSize;

	@Column(name="JOB_REPRESENTATIVE", length=255)
	private String jobRepresentative;

	@Column(name="LAST_CATALOG_ID", length=5)
	private String lastCatalogId;

	@Column(name="NUM_WALLPLOTS", precision=10)
	private BigDecimal numWallplots;

	@Column(name="PARENT_CASE_ID", length=5)
	private String parentCaseId;

	@Column(length=10)
	private String phase;

	@Column(length=2000)
	private String remarks;

	@Column(name="RIG_CAPACITY", precision=126)
	private double rigCapacity;

	@Column(name="RIG_ID", length=5)
	private String rigId;

	@Column(name="SALES_ORDER_NUMBER", length=255)
	private String salesOrderNumber;

	@Column(name="SCENARIO_ID", length=5)
	private String scenarioId;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(name="SP_ADDRESS", length=255)
	private String spAddress;

	@Column(name="SP_COMPANY", length=60)
	private String spCompany;

	@Column(name="SP_REPRESENTATIVE", length=60)
	private String spRepresentative;

	@Column(name="SP_TELEPHONE", length=50)
	private String spTelephone;

	@Column(name="UPDATE_APP_ID", length=20)
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID", length=30)
	private String updateUserId;

	@Column(name="USE_RIG_CAPACITY", length=1)
	private String useRigCapacity;

	//bi-directional many-to-one association to CdWellboreT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreT cdWellboreT;
}
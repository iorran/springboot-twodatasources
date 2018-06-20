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
 * The persistent class for the CD_POLICY database table.
 *
 */
@Entity
@Table(name="CD_POLICY")
@NamedQuery(name="CdPolicy.findAll", query="SELECT c FROM CdPolicy c")
@Getter
@Setter
public class CdPolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="POLICY_ID")
	private String policyId;

	@Column(name="ATTACHMENT_JOURNAL_ID")
	private String attachmentJournalId;

	@Column(name="BA_CODE")
	private String baCode;

	@Column(name="CHECKSUM_VALUE")
	private BigDecimal checksumValue;

	@Column(name="CONTINGENCY_CODES")
	private String contingencyCodes;

	@Column(name="CONTINGENCY_INFO")
	private String contingencyInfo;

	@Column(name="CREATE_APP_ID")
	private String createAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_USER_ID")
	private String createUserId;

	@Column(name="CUSTOMER_ADDRESS")
	private String customerAddress;

	@Column(name="CUSTOMER_DIVISION")
	private String customerDivision;

	@Column(name="CUSTOMER_GROUP")
	private String customerGroup;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="CUSTOMER_REPRESENTATIVE")
	private String customerRepresentative;

	@Column(name="CUSTOMER_TELEPHONE")
	private String customerTelephone;

	@Column(name="ERROR_LEVEL")
	private double errorLevel;

	@Column(name="ERROR_MODEL")
	private BigDecimal errorModel;

	@Column(name="ERROR_OUTPUT_LEVEL")
	private double errorOutputLevel;

	@Column(name="ERROR_SURFACE")
	private BigDecimal errorSurface;

	@Column(name="IS_CONTINGENCY_CALC")
	private String isContingencyCalc;

	@Column(name="IS_DUAL_CURRENCY")
	private String isDualCurrency;

	@Column(name="IS_READONLY")
	private String isReadonly;

	@Column(name="NOTIFY_CONE")
	private double notifyCone;

	@Column(name="NOTIFY_MINIMUM_SEPARATION")
	private double notifyMinimumSeparation;

	@Column(name="NOTIFY_OFFSET_SCOPE")
	private BigDecimal notifyOffsetScope;

	@Column(name="NOTIFY_OFFSET_SIDETRACK")
	private String notifyOffsetSidetrack;

	@Column(name="NOTIFY_PROJECTION_LENGTH")
	private double notifyProjectionLength;

	@Column(name="NOTIFY_PROJECTION_TYPE")
	private BigDecimal notifyProjectionType;

	@Column(name="PASSWORD_1")
	private String password1;

	@Column(name="PASSWORD_2")
	private String password2;

	private String remarks;

	@Column(name="REPORTING_STANDARD")
	private BigDecimal reportingStandard;

	@Temporal(TemporalType.DATE)
	@Column(name="REPORTING_TIME")
	private Date reportingTime;

	@Column(name="SCAN_METHOD")
	private BigDecimal scanMethod;

	@Column(name="SURVEY_CALC")
	private BigDecimal surveyCalc;

	@Column(name="TEMPLATE_ID")
	private String templateId;

	@Column(name="UPDATE_APP_ID")
	private String updateAppId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER_ID")
	private String updateUserId;

	@Column(name="USE_CASING")
	private BigDecimal useCasing;

	@Column(name="VS_ORIGIN")
	private BigDecimal vsOrigin;

	@Column(name="WALK_TYPE")
	private BigDecimal walkType;

	@Column(name="WARNING_METHOD")
	private BigDecimal warningMethod;

	//bi-directional many-to-one association to CdProjectSource
//	@OneToMany(mappedBy="cdPolicy")
//	private List<CdProjectSource> cdProjectSources;
}
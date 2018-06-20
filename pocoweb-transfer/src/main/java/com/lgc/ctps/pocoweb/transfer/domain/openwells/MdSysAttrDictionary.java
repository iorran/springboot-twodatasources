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
 * The persistent class for the MD_SYS_ATTR_DICTIONARY database table.
 *
 */
@Entity
@Table(name="MD_SYS_ATTR_DICTIONARY")
@NamedQuery(name="MdSysAttrDictionary.findAll", query="SELECT m FROM MdSysAttrDictionary m")
@Getter
@Setter
public class MdSysAttrDictionary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MdSysAttrDictionaryPK id;

	@Column(name="ATTRIBUTE_TYPE")
	private BigDecimal attributeType;

	@Column(name="CLASS_ID")
	private BigDecimal classId;

	@Column(name="DATA_TYPE")
	private BigDecimal dataType;

	@Column(name="DEFAULT_CALC_FLAG")
	private String defaultCalcFlag;

	@Column(name="DEFAULT_CO_FLAGS")
	private String defaultCoFlags;

	@Column(name="DEFAULT_CO_OPER")
	private BigDecimal defaultCoOper;

	@Column(name="DEFAULT_CO_VALUE")
	private String defaultCoValue;

	@Column(name="DEFAULT_DESCRIPTION")
	private String defaultDescription;

	@Column(name="DEFAULT_DISABLE_FLAG")
	private String defaultDisableFlag;

	@Column(name="DEFAULT_DISPLAY_TYPE")
	private String defaultDisplayType;

	@Column(name="DEFAULT_LABEL")
	private String defaultLabel;

	@Column(name="DEFAULT_SECURITY_LEVEL")
	private BigDecimal defaultSecurityLevel;

	@Column(name="FIELD_LENGTH")
	private BigDecimal fieldLength;

	@Column(name="FIELD_NAME")
	private String fieldName;

	private String flags;

	@Column(name="INIT_HINT")
	private BigDecimal initHint;

	@Column(name="PROG_ID")
	private String progId;

	@Column(name="TABLE_NAME")
	private String tableName;
}
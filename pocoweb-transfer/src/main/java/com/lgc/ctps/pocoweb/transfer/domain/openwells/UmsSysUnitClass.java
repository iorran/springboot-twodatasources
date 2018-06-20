package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the UMS_SYS_UNIT_CLASSES database table.
 *
 */
@Entity
@Table(name="UMS_SYS_UNIT_CLASSES")
@NamedQuery(name="UmsSysUnitClass.findAll", query="SELECT u FROM UmsSysUnitClass u")
@Getter
@Setter
public class UmsSysUnitClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLASS_ID")
	private long classId;

	@Column(name="CLASS_LABEL")
	private String classLabel;

	@Column(name="CLASS_NAME")
	private String className;

	@Column(name="CLASS_PRECISION")
	private double classPrecision;

	@Column(name="DSPACE_UNIT_TYPE_ID")
	private BigDecimal dspaceUnitTypeId;

	@Column(name="PRECISION_MEASURE_ID")
	private BigDecimal precisionMeasureId;

	@Column(name="TYPE_ID")
	private BigDecimal typeId;
}
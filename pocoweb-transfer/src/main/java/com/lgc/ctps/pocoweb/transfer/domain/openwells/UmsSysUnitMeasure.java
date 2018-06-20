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
 * The persistent class for the UMS_SYS_UNIT_MEASURES database table.
 *
 */
@Entity
@Table(name="UMS_SYS_UNIT_MEASURES")
@NamedQuery(name="UmsSysUnitMeasure.findAll", query="SELECT u FROM UmsSysUnitMeasure u")
@Getter
@Setter
public class UmsSysUnitMeasure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MEASURE_ID")
	private long measureId;

	@Column(name="CONV_CODE")
	private BigDecimal convCode;

	@Column(name="DSPACE_UNIT_ID")
	private BigDecimal dspaceUnitId;

	@Column(name="MEASURE_DESCRIPTION")
	private String measureDescription;

	@Column(name="MEASURE_LABEL")
	private String measureLabel;

	@Column(name="MEASURE_NAME")
	private String measureName;

	private double multiplier;

	private double offset;

	@Column(name="TYPE_ID")
	private BigDecimal typeId;
}
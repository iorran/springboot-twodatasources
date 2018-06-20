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
 * The persistent class for the CD_PORE_PRESSURE_T database table.
 *
 */
@Entity
@Table(name="CD_PORE_PRESSURE_T")
@NamedQuery(name="CdPorePressureT.findAll", query="SELECT c FROM CdPorePressureT c")
@Getter
@Setter
public class CdPorePressureT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdPorePressureTPK id;

	@Column(length=255)
	private String comments;

	@Column(name="IS_PERMEABLE_ZONE", length=1)
	private String isPermeableZone;

	@Column(name="PORE_PRESSURE", precision=126)
	private double porePressure;

	@Column(name="PORE_PRESSURE_EMW", precision=126)
	private double porePressureEmw;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(precision=126)
	private double tvd;

	//bi-directional many-to-one association to CdPorePressureGroupT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="PORE_PRESSURE_GROUP_ID", referencedColumnName="PORE_PRESSURE_GROUP_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdPorePressureGroupT cdPorePressureGroupT;
}
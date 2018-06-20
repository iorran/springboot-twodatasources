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
 * The persistent class for the CD_TEMP_GRADIENT_T database table.
 *
 */
@Entity
@Table(name="CD_TEMP_GRADIENT_T")
@NamedQuery(name="CdTempGradientT.findAll", query="SELECT c FROM CdTempGradientT c")
@Getter
@Setter
public class CdTempGradientT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdTempGradientTPK id;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(precision=126)
	private double temperature;

	@Column(name="TEMPERATURE_TYPE", length=32)
	private String temperatureType;

	@Column(precision=126)
	private double tvd;

	//bi-directional many-to-one association to CdTempGradientGroupT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="TEMP_GRADIENT_GROUP_ID", referencedColumnName="TEMP_GRADIENT_GROUP_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdTempGradientGroupT cdTempGradientGroupT;
}
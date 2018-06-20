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
 * The persistent class for the CD_FRAC_GRADIENT_T database table.
 *
 */
@Entity
@Table(name="CD_FRAC_GRADIENT_T")
@NamedQuery(name="CdFracGradientT.findAll", query="SELECT c FROM CdFracGradientT c")
@Getter
@Setter
public class CdFracGradientT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdFracGradientTPK id;

	@Column(length=255)
	private String comments;

	@Column(name="FRAC_GRADIENT_EMW", precision=126)
	private double fracGradientEmw;

	@Column(name="FRAC_GRADIENT_PRESSURE", precision=126)
	private double fracGradientPressure;

	@Column(name="OVERBURDEN_GRADIENT", precision=126)
	private double overburdenGradient;

	@Column(name="OVERBURDEN_PRESSURE", precision=126)
	private double overburdenPressure;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;

	@Column(precision=126)
	private double tvd;

	//bi-directional many-to-one association to CdFracGradientGroupT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="FRAC_GRADIENT_GROUP_ID", referencedColumnName="FRAC_GRADIENT_GROUP_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdFracGradientGroupT cdFracGradientGroupT;
}
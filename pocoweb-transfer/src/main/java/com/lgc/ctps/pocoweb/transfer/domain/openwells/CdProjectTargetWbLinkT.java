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
 * The persistent class for the CD_PROJECT_TARGET_WB_LINK_T database table.
 *
 */
@Entity
@Table(name="CD_PROJECT_TARGET_WB_LINK_T")
@NamedQuery(name="CdProjectTargetWbLinkT.findAll", query="SELECT c FROM CdProjectTargetWbLinkT c")
@Getter
@Setter
public class CdProjectTargetWbLinkT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdProjectTargetWbLinkTPK id;

	@Column(precision=126)
	private double azimuth;

	@Column(precision=126)
	private double inclination;

	@Column(name="SEQUENCE_NO", precision=10)
	private BigDecimal sequenceNo;
}
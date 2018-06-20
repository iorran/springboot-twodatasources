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
 * The persistent class for the MD_SITE_STORAGE_UNITS database table.
 *
 */
@Entity
@Table(name="MD_SITE_STORAGE_UNITS")
@NamedQuery(name="MdSiteStorageUnit.findAll", query="SELECT m FROM MdSiteStorageUnit m")
@Getter
@Setter
public class MdSiteStorageUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MdSiteStorageUnitPK id;

	@Column(name="MEASURE_ID")
	private BigDecimal measureId;

	@Column(name="USE_DATUM")
	private String useDatum;
}
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
 * The persistent class for the CD_LITHOLOGY_CLASS database table.
 *
 */
@Entity
@Table(name="CD_LITHOLOGY_CLASS")
@NamedQuery(name="CdLithologyClass.findAll", query="SELECT c FROM CdLithologyClass c")
@Getter
@Setter
public class CdLithologyClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LITHOLOGY_ID")
	private String lithologyId;

	@Column(name="ATTACHMENT_JOURNAL_ID")
	private String attachmentJournalId;

	private double conductivity;

	@Column(name="DISPLAY_CODE")
	private BigDecimal displayCode;

	@Column(name="FORMATION_DENSITY")
	private double formationDensity;

	@Column(name="FROZEN_CONDUCTIVITY")
	private double frozenConductivity;

	@Column(name="FROZEN_DENSITY")
	private double frozenDensity;

	@Column(name="HEAT_OF_FUSION")
	private double heatOfFusion;

	@Column(name="IS_PERMEABLE")
	private String isPermeable;

	private String lithology;

	@Column(name="MELTING_POINT")
	private double meltingPoint;

	private double permeability;

	private double porosity;

	@Column(name="SPECIFIC_HEAT")
	private double specificHeat;
}
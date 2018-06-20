package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the CD_SCENARIO_FORMATION_LINK_T database table.
 *
 */
@Entity
@Table(name="CD_SCENARIO_FORMATION_LINK_T")
@NamedQuery(name="CdScenarioFormationLinkT.findAll", query="SELECT c FROM CdScenarioFormationLinkT c")
@Getter
@Setter
public class CdScenarioFormationLinkT implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdScenarioFormationLinkTPK id;

	//bi-directional many-to-one association to CdWellboreFormationT
//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="WELL_ID", referencedColumnName="WELL_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_FORMATION_ID", referencedColumnName="WELLBORE_FORMATION_ID", nullable=false, insertable=false, updatable=false),
//		@JoinColumn(name="WELLBORE_ID", referencedColumnName="WELLBORE_ID", nullable=false, insertable=false, updatable=false)
//		})
//	private CdWellboreFormationT cdWellboreFormationT;
}
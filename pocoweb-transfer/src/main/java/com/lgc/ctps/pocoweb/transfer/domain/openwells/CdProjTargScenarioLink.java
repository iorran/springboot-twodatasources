package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the CD_PROJ_TARG_SCENARIO_LINK database table.
 *
 */
@Entity
@Table(name="CD_PROJ_TARG_SCENARIO_LINK")
@NamedQuery(name="CdProjTargScenarioLink.findAll", query="SELECT c FROM CdProjTargScenarioLink c")
@Getter
@Setter
public class CdProjTargScenarioLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CdProjTargScenarioLinkPK id;
}
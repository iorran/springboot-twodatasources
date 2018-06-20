package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * The primary key class for the CD_PROJ_TARG_SCENARIO_LINK database table.
 *
 */
@Embeddable
@Data
public class CdProjTargScenarioLinkPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROJECT_ID", insertable=false, updatable=false)
	private String projectId;

	@Column(name="PROJECT_TARGET_ID", insertable=false, updatable=false)
	private String projectTargetId;

	@Column(name="WELL_ID")
	private String wellId;

	@Column(name="WELLBORE_ID")
	private String wellboreId;

	@Column(name="SCENARIO_ID")
	private String scenarioId;
}
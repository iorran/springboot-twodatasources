package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * The primary key class for the CD_ASSEMBLY_COMP_T database table.
 *
 */
@Embeddable
@Data
public class CdAssemblyCompTPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="WELL_ID", insertable=false, updatable=false, unique=true, nullable=false, length=10)
	private String wellId;

	@Column(name="WELLBORE_ID", insertable=false, updatable=false, unique=true, nullable=false, length=10)
	private String wellboreId;

	@Column(name="ASSEMBLY_ID", insertable=false, updatable=false, unique=true, nullable=false, length=5)
	private String assemblyId;

	@Column(name="ASSEMBLY_COMP_ID", unique=true, nullable=false, length=5)
	private String assemblyCompId;
}
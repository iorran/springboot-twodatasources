package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * The primary key class for the MD_SITE_STORAGE_UNITS database table.
 *
 */
@Embeddable
@Data
public class MdSiteStorageUnitPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TABLE_NAME")
	private String tableName;

	@Column(name="FIELD_NAME")
	private String fieldName;
}
package com.lgc.ctps.pocoweb.transfer.domain.openwells;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * The primary key class for the MD_SYS_ATTR_DICTIONARY database table.
 *
 */
@Embeddable
@Data
public class MdSysAttrDictionaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_OBJECT")
	private String businessObject;

	@Column(name="ATTR_NAME")
	private String attrName;
}
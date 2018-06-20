package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.enumeration;

import lombok.Getter;

@Getter
public enum FileTypeEnum {
	BASICDATADRILLING("dadosbasicos.drilling"),
	BASICDATAASBUILT("dadosbasicos.asbuilt");

	private String name;

	FileTypeEnum(String name) {
		this.name = name;
	}

	public static FileTypeEnum getByName(String name) {
		for (FileTypeEnum e : FileTypeEnum.values()) {
			if (name.equals(e.getName())) {
				return e;
			}
		}
		throw new IllegalArgumentException();
	}
}

package com.lgc.ctps.pocoweb.transfer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.BasicDataDrilling;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.well.Well;
import com.lgc.ctps.pocoweb.transfer.service.pocoweb.BasicDataDrillingService;
import com.lgc.ctps.pocoweb.transfer.util.Util;

@Component
public class Transfer {
	@Autowired
	private BasicDataDrillingService basicDataDrillingService;

	@Value("${pocoweb.url.wells}")
	private String urlWells;

	public void syncAllData() {
		Util.start("syncAllData");
		List<BasicDataDrilling> basicDataDrillings = new ArrayList<>();
		List<Well> wells = basicDataDrillingService.findAllWells(urlWells);
		for (Well well : wells) {
			basicDataDrillings.add(basicDataDrillingService.findBasicDataDrillingByWellName(urlWells, well.getName()));
		}
		Util.finish("syncAllData");
	}

	public void syncWell(String wellName) {
		Util.start("syncWell");
		basicDataDrillingService.findBasicDataDrillingByWellName(urlWells, wellName);
		Util.finish("syncWell");
	}
}

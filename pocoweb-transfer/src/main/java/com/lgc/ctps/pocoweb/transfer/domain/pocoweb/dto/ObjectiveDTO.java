package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ObjectiveDTO {
	private String h2sForecast;
	private String co2Forecast;
	private String targetsName;
	private String targetsType;
	private String targetsBaseElevation;
	private String targetsHc;
	private String targetsX;
	private String targetsY;
	private String targetsTopElevation;
}

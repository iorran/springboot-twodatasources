package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = "targets")
@Builder
public class Objective {
	private String h2sForecast;
	private String co2Forecast;
	private List<Target> targets;
}

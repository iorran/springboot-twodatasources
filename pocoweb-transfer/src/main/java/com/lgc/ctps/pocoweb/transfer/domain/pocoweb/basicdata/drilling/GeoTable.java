package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class GeoTable {
	private FracturePressure fracturePressure;
	private OverbalancePressure overbalancePressure;
	private PorePressure porePressure;
}

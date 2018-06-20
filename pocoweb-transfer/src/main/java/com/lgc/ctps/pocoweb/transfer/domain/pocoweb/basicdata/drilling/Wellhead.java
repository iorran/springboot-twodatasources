package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Wellhead {
	private String centralMeridian;
	private String datum;
	private String longitude;
	private String latitude;
	private String x;
	private String y;
}

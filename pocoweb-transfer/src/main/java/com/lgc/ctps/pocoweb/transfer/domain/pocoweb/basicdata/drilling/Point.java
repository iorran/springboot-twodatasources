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
public class Point {
	private String elevation;
	private String temperature;
}

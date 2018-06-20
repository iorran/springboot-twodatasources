package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.well;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Well {
	private String url;
	private String name;
	private Oilfield oilfield;
}

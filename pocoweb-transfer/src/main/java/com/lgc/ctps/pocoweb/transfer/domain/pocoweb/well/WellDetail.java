package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.well;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class WellDetail {
	private String url;
	private String name;
	private String oilfield;
	private File file;
}

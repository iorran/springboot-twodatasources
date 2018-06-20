package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Rig {
	private String fullname;
	private String airgap;
	private String company;
	private String name;
}

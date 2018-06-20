package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import java.util.List;

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
public class Lithology {
	private List<CommonLithologyObject> porous;
	private List<CommonLithologyObject> ages;
	private List<CommonLithologyObject> formations;
	private List<CommonLithologyObject> rocks;
}

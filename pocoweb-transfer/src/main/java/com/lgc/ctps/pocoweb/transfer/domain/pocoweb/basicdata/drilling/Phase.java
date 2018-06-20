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
@EqualsAndHashCode(exclude = "columns")
@Builder
public class Phase {
	private Casingload casingload;
	private String casingStringId;
	private List<Column> columns;
	private String drillingFluidDensity;
	private String drillStringId;
	private String drillingFluidType;
	private String finalMd;
	private String internalCementTopDepth;
	private String setup;
	private String shoeMd;
	private String stingerId;
	private String workStringId;
}

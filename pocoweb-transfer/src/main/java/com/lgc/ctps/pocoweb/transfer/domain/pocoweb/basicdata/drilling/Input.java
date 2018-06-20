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
@EqualsAndHashCode(exclude = {"phases"})
@Builder
public class Input {
	private String lda;
	private Rig rig;
	private String airgap;
	private String finalMd;
	private Location location;
	private List<Phase> phases;
	private Temperature temperature;
	private Objective objective;
	private Lithology lithology;
	private GeoTable geoTable;
}

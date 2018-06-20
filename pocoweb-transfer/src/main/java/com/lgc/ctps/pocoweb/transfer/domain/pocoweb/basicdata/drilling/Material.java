package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Material {
	private String averageJointLength;
	private String bodyYieldStrength;
	private String burst;
	private String collapse;
	private String connection;
	private String driftId;
	private String grade;
	private String id;
	private String insideDiameter;
	private String makeupTorque;
	private String nominalWeight;
	private String outsideDiameter;
	private String type;
    private String weight;
}

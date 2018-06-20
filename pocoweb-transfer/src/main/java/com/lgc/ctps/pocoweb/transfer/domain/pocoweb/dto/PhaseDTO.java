package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PhaseDTO {
	private String casingloadMaxFluidDensity;
	private String casingStringId;
	private String drillingFluidDensity;
	private String drillStringId;
	private String drillingFluidType;
	private String finalMd;
	private String internalCementTopDepth;
	private String setup;
	private String shoeMd;
	private String stingerId;
	private String workStringId;

	private String columnBitSize;
	private String columnFinalMd;
	private String columnInitialMd;
	private String columnName;
	private String columnTotalWeight;
	private String columnType;

	private String valueInitialMd;
	private String valueFinalMd;
	private String valueLength;
	private String valueTotalWeight;

	private String materialAverageJointLength;
	private String materialBodyYieldStrength;
	private String materialBurst;
	private String materialCollapse;
	private String materialConnection;
	private String materialDriftId;
	private String materialGrade;
	private String materialId;
	private String materialInsideDiameter;
	private String materialMakeupTorque;
	private String materialNominalWeight;
	private String materialOutsideDiameter;
	private String materialType;
    private String materialWeight;
}

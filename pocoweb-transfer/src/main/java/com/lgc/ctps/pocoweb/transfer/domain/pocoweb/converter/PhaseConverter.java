package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Casingload;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Column;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.ColumnValue;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Material;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Phase;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto.PhaseDTO;

public class PhaseConverter {

	public static List<Phase> toEntity(List<PhaseDTO> phaseDTOs) {
		if (ObjectUtils.isEmpty(phaseDTOs)) {
			return Collections.emptyList();
		}

		List<Phase> phases = new ArrayList<>();
		Phase phase = null;
		Column column = null;

		for (PhaseDTO phaseDTO : phaseDTOs) {
			phase = addIfNotExists(phases, phaseDTOToPhase(phaseDTO));
			column = addIfNotExists(phase, phaseDTOToColumn(phaseDTO));
			addIfNotExists(column, phaseDTOToColumnValue(phaseDTO));
		}

		return phases;
	}

	private static void addIfNotExists(Column column, ColumnValue columnValue) {
		if (!column.getValues().contains(columnValue)) {
			column.getValues().add(columnValue);
		}
	}

	private static Column addIfNotExists(Phase phase, Column column) {
		if (!phase.getColumns().contains(column)) {
			phase.getColumns().add(column);
		}
		return phase.getColumns().get(phase.getColumns().indexOf(column));
	}

	private static Phase addIfNotExists(List<Phase> phases, Phase phase) {
		if (!phases.contains(phase)) {
			phases.add(phase);
		}
		return phases.get(phases.indexOf(phase));
	}

	private static Phase phaseDTOToPhase(PhaseDTO phaseDTO) {
		Casingload casingload = Casingload.builder()
			.maxFluidDensity(phaseDTO.getCasingloadMaxFluidDensity())
			.build();

		return Phase.builder()
			.casingStringId(phaseDTO.getCasingStringId())
			.workStringId(phaseDTO.getWorkStringId())
			.setup(phaseDTO.getSetup())
			.internalCementTopDepth(phaseDTO.getInternalCementTopDepth())
			.drillStringId(phaseDTO.getDrillStringId())
			.drillingFluidDensity(phaseDTO.getDrillingFluidDensity())
			.shoeMd(phaseDTO.getShoeMd())
			.finalMd(phaseDTO.getFinalMd())
			.drillingFluidType(phaseDTO.getDrillingFluidType())
			.stingerId(phaseDTO.getStingerId())
			.casingload(casingload)
			.columns(new ArrayList<>())
			.build();
	}

	private static Column phaseDTOToColumn(PhaseDTO phaseDTO) {
		return Column.builder()
			.bitSize(phaseDTO.getColumnBitSize())
			.finalMd(phaseDTO.getColumnFinalMd())
			.initialMd(phaseDTO.getColumnInitialMd())
			.name(phaseDTO.getColumnName())
			.totalWeight(phaseDTO.getColumnTotalWeight())
			.type(phaseDTO.getColumnType())
			.values(new ArrayList<>())
			.build();
	}

	private static ColumnValue phaseDTOToColumnValue(PhaseDTO phaseDTO) {
		 Material material = Material.builder().averageJointLength(phaseDTO.getMaterialAverageJointLength())
			.bodyYieldStrength(phaseDTO.getMaterialBodyYieldStrength()).burst(phaseDTO.getMaterialBurst())
			.collapse(phaseDTO.getMaterialCollapse()).connection(phaseDTO.getMaterialConnection())
			.driftId(phaseDTO.getMaterialDriftId()).grade(phaseDTO.getMaterialGrade()).id(phaseDTO.getMaterialId())
			.insideDiameter(phaseDTO.getMaterialInsideDiameter()).makeupTorque(phaseDTO.getMaterialMakeupTorque())
			.nominalWeight(phaseDTO.getMaterialNominalWeight())
			.outsideDiameter(phaseDTO.getMaterialOutsideDiameter()).type(phaseDTO.getMaterialType())
			.weight(phaseDTO.getMaterialWeight()).build();

		return ColumnValue.builder().initialMd(phaseDTO.getValueInitialMd()).finalMd(phaseDTO.getValueFinalMd())
			.length(phaseDTO.getValueLength()).totalWeight(phaseDTO.getValueTotalWeight()).material(material)
			.build();
	}

	private PhaseConverter() {
	}
}

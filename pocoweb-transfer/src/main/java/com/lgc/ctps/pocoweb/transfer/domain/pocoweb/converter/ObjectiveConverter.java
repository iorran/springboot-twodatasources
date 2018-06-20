package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Objective;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Target;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto.ObjectiveDTO;

public class ObjectiveConverter {

	public static Objective toEntity(List<ObjectiveDTO> objectiveDTOs) {
		if (CollectionUtils.isEmpty(objectiveDTOs)) {
			return null;
		}

		List<Target> targets = new ArrayList<>();
		Target target = null;
		String co2Forecast = null;
		String h2sForecast = null;

		for (ObjectiveDTO objectiveDTO : objectiveDTOs) {
			co2Forecast = objectiveDTO.getCo2Forecast();
			h2sForecast = objectiveDTO.getH2sForecast();
			target = Target.builder()
				.baseElevation(objectiveDTO.getTargetsBaseElevation())
				.hc(objectiveDTO.getTargetsHc())
				.name(objectiveDTO.getTargetsName())
				.topElevation(objectiveDTO.getTargetsTopElevation())
				.type(objectiveDTO.getTargetsType())
				.x(objectiveDTO.getTargetsX())
				.y(objectiveDTO.getTargetsY())
				.build();
			targets.add(target);
		}
		return Objective.builder()
				.co2Forecast(co2Forecast)
				.h2sForecast(h2sForecast)
				.targets(targets)
				.build();
	}

	private ObjectiveConverter() {
	}
}

package com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto.ObjectiveDTO;

public class ObjectiveMapper implements RowMapper<ObjectiveDTO> {
	@Override
	public ObjectiveDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return ObjectiveDTO.builder()
			.h2sForecast(rs.getString("h2s_forecast"))
			.co2Forecast(rs.getString("co2_forecast"))
			.targetsName(rs.getString("targets_name"))
			.targetsType(rs.getString("targets_type"))
			.targetsBaseElevation(rs.getString("targets_base_elevation"))
			.targetsHc(rs.getString("targets_hc"))
			.targetsX(rs.getString("targets_x"))
			.targetsY(rs.getString("targets_y"))
			.targetsTopElevation(rs.getString("targets_top_elevation"))
			.build();
		}
}
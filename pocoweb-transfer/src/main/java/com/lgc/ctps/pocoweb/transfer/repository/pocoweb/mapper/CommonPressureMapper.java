package com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.CommonPressure;

public class CommonPressureMapper implements RowMapper<CommonPressure> {
	@Override
	public CommonPressure mapRow(ResultSet rs, int rowNum) throws SQLException {
		return CommonPressure.builder()
			.pressure(rs.getString("pressure"))
			.elevation(rs.getString("elevation"))
			.name(rs.getString("name"))
			.build();
		}
}
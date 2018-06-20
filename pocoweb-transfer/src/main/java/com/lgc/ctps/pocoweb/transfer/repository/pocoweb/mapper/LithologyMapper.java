package com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.CommonLithologyObject;

public class LithologyMapper implements RowMapper<CommonLithologyObject> {
	@Override
	public CommonLithologyObject mapRow(ResultSet rs, int rowNum) throws SQLException {
		return CommonLithologyObject.builder()
			.baseElevation(rs.getString("base_elevation"))
			.name(rs.getString("name"))
			.build();
		}
}
package com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Column;

public class ColumnMapper implements RowMapper<Column> {

	@Override
	public Column mapRow(ResultSet rs, int rowNum) throws SQLException {
		return Column.builder()
				.name(rs.getString("phases_columns_name"))
				.bitSize("")
				.totalWeight(rs.getString("phases_columns_total_weight"))
				.finalMd(rs.getString("phases_columns_final_md"))
				.initialMd(rs.getString("phases_columns_initial_md"))
				.type(rs.getString("phases_columns_type"))
				.values(new ArrayList<>())
				.build();
	}

}
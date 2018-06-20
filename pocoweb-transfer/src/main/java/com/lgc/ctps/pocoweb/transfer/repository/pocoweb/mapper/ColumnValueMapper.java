package com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.ColumnValue;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Material;

public class ColumnValueMapper implements RowMapper<ColumnValue> {
	@Override
	public ColumnValue mapRow(ResultSet rs, int rowNum) throws SQLException {
		Material material = Material.builder()
				.averageJointLength(rs.getString("phases_columns_values_material_average_joint_length"))
				.bodyYieldStrength(rs.getString("phases_columns_values_material_body_yield_strength"))
				.burst(rs.getString("phases_columns_values_material_burst"))
				.collapse(rs.getString("phases_columns_values_material_collapse"))
				.connection(rs.getString("phases_columns_values_material_connection"))
				.driftId(rs.getString("phases_columns_values_material_drift_id"))
				.grade(rs.getString("phases_columns_values_material_grade"))
				.id(rs.getString("phases_columns_values_material_id"))
				.insideDiameter(rs.getString("phases_columns_values_material_inside_diameter"))
				.makeupTorque(rs.getString("phases_columns_values_material_makeup_torque"))
				.nominalWeight(rs.getString("phases_columns_values_material_nominal_weight"))
				.outsideDiameter(rs.getString("phases_columns_values_material_outside_diameter"))
				.type(rs.getString("phases_columns_values_material_type"))
			    .weight(rs.getString("phases_columns_values_material_weight"))
			    .build();

		return ColumnValue.builder()
				.initialMd(rs.getString("phases_columns_values_initial_md"))
				.finalMd(rs.getString("phases_columns_values_final_md"))
				.length(rs.getString("phases_columns_values_length"))
				.totalWeight(rs.getString("phases_columns_values_total_weight"))
				.material(material)
				.build();
	}
}
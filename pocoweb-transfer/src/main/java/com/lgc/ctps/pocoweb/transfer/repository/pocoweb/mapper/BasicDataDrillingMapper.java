package com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.BasicDataDrilling;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Content;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Input;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Location;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Revision;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Rig;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Wellhead;

public class BasicDataDrillingMapper implements RowMapper<BasicDataDrilling> {

	@Override
	public BasicDataDrilling mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rig rig = Rig.builder().fullname(rs.getString("rig_fullname")).airgap(rs.getString("rig_airgap"))
				.company(rs.getString("rig_company")).name(rs.getString("rig_name")).build();

		Wellhead wellhead = Wellhead.builder().centralMeridian(rs.getString("location_wellhead_central_meridian"))
				.datum(rs.getString("location_wellhead_datum")).longitude(rs.getString("location_wellhead_longitude"))
				.latitude(rs.getString("location_wellhead_latitude")).x(rs.getString("location_wellhead_x"))
				.y(rs.getString("location_wellhead_y")).build();

		Location location = Location.builder().name(rs.getString("location_name")).wellhead(wellhead).build();

		Input input = Input.builder()
				.lda(rs.getString("lda"))
				.rig(rig)
				.airgap(rs.getString("airgap"))
				.finalMd(rs.getString("final_md"))
				.location(location)
				.build();

		Content content = Content.builder().input(input).build();

		Revision revision = Revision.builder().content(content).build();

		return BasicDataDrilling.builder().url(rs.getString("url")).name(rs.getString("name")).revision(revision)
				.build();
	}

}
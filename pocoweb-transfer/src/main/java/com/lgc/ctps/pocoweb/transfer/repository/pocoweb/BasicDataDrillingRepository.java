package com.lgc.ctps.pocoweb.transfer.repository.pocoweb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.BasicDataDrilling;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.CommonLithologyObject;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.CommonPressure;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Point;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling.Temperature;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto.ObjectiveDTO;
import com.lgc.ctps.pocoweb.transfer.domain.pocoweb.dto.PhaseDTO;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper.BasicDataDrillingMapper;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper.CommonPressureMapper;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper.LithologyMapper;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper.ObjectiveMapper;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper.PhaseMapper;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.mapper.PointMapper;
import com.lgc.ctps.pocoweb.transfer.repository.pocoweb.query.BasicDataDrillingQuery;

@Repository
public class BasicDataDrillingRepository {

	@Autowired
    @Qualifier("dsdsDataSource")
    private DataSource dataSource;

    private NamedParameterJdbcTemplate namedJdbcTemplate;

    @PostConstruct
    private void postConstruct() {
    	namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

	@Autowired
	private BasicDataDrillingQuery query;

	public BasicDataDrilling findBasicDataDrilling(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingQuery(), query.findBasicDataDrillingParams(url),
				new BasicDataDrillingMapper()).get(0);
	}

	public List<PhaseDTO> findBasicDataDrillingPhases(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingPhasesQuery(), query.findBasicDataDrillingParams(url),
				new PhaseMapper());
	}

	public Temperature findBasicDataDrillingTemperature(String url) {
		List<Point> points = namedJdbcTemplate.query(query.findBasicDataDrillingTemperatureQuery(),
				query.findBasicDataDrillingParams(url), new PointMapper());
		return Temperature.builder().points(points).build();
	}

	public List<ObjectiveDTO> findBasicDataDrillingObjective(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingObjectiveQuery(),
				query.findBasicDataDrillingParams(url), new ObjectiveMapper());
	}

	public List<CommonLithologyObject> findBasicDataDrillingLithologyAges(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingLithologyAgesQuery(),
				query.findBasicDataDrillingParams(url), new LithologyMapper());
	}

	public List<CommonLithologyObject> findBasicDataDrillingLithologyPorous(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingLithologyPorousQuery(),
				query.findBasicDataDrillingParams(url), new LithologyMapper());
	}

	public List<CommonLithologyObject> findBasicDataDrillingLithologyFormations(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingLithologyFormationsQuery(),
				query.findBasicDataDrillingParams(url), new LithologyMapper());
	}

	public List<CommonLithologyObject> findBasicDataDrillingLithologyRocks(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingLithologyRocksQuery(),
				query.findBasicDataDrillingParams(url), new LithologyMapper());
	}

	public List<CommonPressure> findBasicDataDrillingFracturePressure(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingFracturePressureQuery(),
				query.findBasicDataDrillingParams(url), new CommonPressureMapper());
	}

	public List<CommonPressure> findBasicDataDrillingOverbalancePressure(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingOverbalancePressureQuery(),
				query.findBasicDataDrillingParams(url), new CommonPressureMapper());
	}

	public List<CommonPressure> findBasicDataDrillingPorePressure(String url) {
		return namedJdbcTemplate.query(query.findBasicDataDrillingPorePressureQuery(),
				query.findBasicDataDrillingParams(url), new CommonPressureMapper());
	}
}
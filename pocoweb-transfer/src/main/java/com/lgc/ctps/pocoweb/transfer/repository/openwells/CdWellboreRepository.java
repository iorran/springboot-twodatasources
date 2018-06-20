package com.lgc.ctps.pocoweb.transfer.repository.openwells;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lgc.ctps.pocoweb.transfer.domain.openwells.CdWellboreT;
import com.lgc.ctps.pocoweb.transfer.domain.openwells.projection.CdWellboreProjection;

public interface CdWellboreRepository extends JpaRepository<CdWellboreT, Long> {
	@Query("SELECT c.wellboreName as wellboreName FROM CdWellboreT c")
	List<CdWellboreProjection> findAllProjection();
}

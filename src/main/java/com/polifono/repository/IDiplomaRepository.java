package com.polifono.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.polifono.domain.Diploma;

public interface IDiplomaRepository extends CrudRepository<Diploma, Integer> {

	@Query("SELECT diploma FROM Diploma diploma WHERE diploma.player.id = :playerId ORDER BY diploma.dt DESC")
	public List<Diploma> findByPlayer(@Param("playerId") int playerId);
	
	@Query("SELECT diploma FROM Diploma diploma WHERE diploma.code = :code")
	public Diploma findByCode(@Param("code") String code);
}
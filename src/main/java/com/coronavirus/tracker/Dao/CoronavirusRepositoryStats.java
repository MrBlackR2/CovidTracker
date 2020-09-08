package com.coronavirus.tracker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronavirus.tracker.model.CovidStats;

public interface CoronavirusRepositoryStats extends JpaRepository<CovidStats, Integer>{

}

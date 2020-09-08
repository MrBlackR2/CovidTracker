package com.coronavirus.tracker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coronavirus.tracker.model.CovidStats;
import com.coronavirus.tracker.model.CovidStatus;

@Repository
public interface CoronavirusRepository extends JpaRepository<CovidStatus, Integer> {
//public interface CoronavirusRepository extends JpaRepository<CovidStats, Integer> {

}

package com.example.week1.repository;

import com.example.week1.entity.IPLTeams;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPLTeamRepository extends CrudRepository<IPLTeams, Long> {
}

package com.example.week1.service;

import com.example.week1.entity.IPLTeams;

import java.util.List;

public interface IPLTeamService {
    IPLTeams createTeam(IPLTeams team);
    List<IPLTeams> getTeams();
    IPLTeams updateTeam(IPLTeams team, long id);
    void deleteTeam(long id);

}

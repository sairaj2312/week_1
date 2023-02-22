package com.example.week1.service;

import com.example.week1.entity.IPLTeams;
import com.example.week1.repository.IPLTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPLTeamServiceImpl implements IPLTeamService{

    @Autowired
    private IPLTeamRepository teamRepository;

    @Override
    public IPLTeams createTeam(IPLTeams team) {
        return teamRepository.save(team);
    }

    @Override
    public List<IPLTeams> getTeams() {
        return (List<IPLTeams>) teamRepository.findAll();
    }

    @Override
    public IPLTeams updateTeam(IPLTeams team, long id) {
        IPLTeams tempTeam = teamRepository.findById(id).get();
        tempTeam.setTeamName(team.getTeamName());
        return teamRepository.save(tempTeam);
    }

    @Override
    public void deleteTeam(long id) {
        teamRepository.deleteById(id);
    }
}

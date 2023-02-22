package com.example.week1.service;

import com.example.week1.entity.IPLTeams;
import com.example.week1.repository.IPLTeamRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class IPLTeamServiceTest {
    private IPLTeamServiceImpl teamService;
    @Mock private IPLTeamRepository teamRepository;

    @Test
    public void getAllTeams(){
        this.teamService = new IPLTeamServiceImpl(this.teamRepository);
        teamService.getTeams();
        verify(teamRepository).findAll();
    }
}

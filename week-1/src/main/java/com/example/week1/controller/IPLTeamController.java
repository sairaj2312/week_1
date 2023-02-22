package com.example.week1.controller;

import com.example.week1.entity.IPLTeams;
import com.example.week1.service.IPLTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IPLTeamController {
    @Autowired private IPLTeamService iplTeamService;

    @PostMapping("/iplteams")
    public IPLTeams createTeam(@Validated @RequestBody IPLTeams iplteam){
        return iplTeamService.createTeam(iplteam);
    }

    @GetMapping("/iplteams")
    public List<IPLTeams> getTeams(){
        return iplTeamService.getTeams();
    }

    @PutMapping("/iplteams/{id}")
    public IPLTeams updateTeam(@RequestBody IPLTeams team, @PathVariable("id") long id){
        return iplTeamService.updateTeam(team, id);
    }

    @DeleteMapping("/iplteams/{id}")
    public String deleteTeam(@PathVariable("id") long id){
        iplTeamService.deleteTeam(id);
        return "Deleted team";
    }
}

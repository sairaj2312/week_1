package com.example.week1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class IPLTeams {
    @Id
    @GeneratedValue
    private long teamId;
    private String teamName;
    private String sponsor;

    public long getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
}
